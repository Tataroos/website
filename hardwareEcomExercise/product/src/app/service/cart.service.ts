import { Injectable } from '@angular/core';
import { BehaviorSubject, Subject } from 'rxjs';
import { CartItem } from '../model/cart-item';
import { Product } from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  private cartItemsSubject = new BehaviorSubject<CartItem[]>([]);
  public items$ = this.cartItemsSubject.asObservable(); 

  public totalPrice$ = new BehaviorSubject<number>(0);
  public totalQuantity$ = new BehaviorSubject<number>(0);

  constructor() {
    const storedItems = localStorage.getItem('cartItems');
    if (storedItems) {
      const items: CartItem[] = JSON.parse(storedItems);
      this.cartItemsSubject.next(items);
      this.computeCartTotals(items);
    }
  }

  addToCart(product: Product) {
    const currentItems = this.cartItemsSubject.getValue();
    let alreadyExists = false;
    
    for (let item of currentItems) {
      if (item.id === product.id) {
        item.quantity++;
        alreadyExists = true;
        break;
      }
    }

    if (!alreadyExists) {
      currentItems.push(new CartItem(product));
    }

    this.notifySubscribers(currentItems);
  }

  decrementQuantity(cartItem: CartItem) {
    const currentItems = this.cartItemsSubject.getValue();
    for (let item of currentItems) {
      if (item.id === cartItem.id && item.quantity > 1) {
        item.quantity--;
        this.notifySubscribers(currentItems);
        return; 
      }
    }
  }
  removeFromCart(cartItem: CartItem) {
    let currentItems = this.cartItemsSubject.getValue();
    currentItems = currentItems.filter(item => item.id !== cartItem.id);
    this.notifySubscribers(currentItems);
  }

  getCartItems(): CartItem[] {
    return this.cartItemsSubject.getValue();
  }

  clearCart() {
    this.notifySubscribers([]);
  }

  private notifySubscribers(items: CartItem[]) {
    const { total, quantity } = this.computeCartTotals(items);

    this.cartItemsSubject.next(items);
    this.totalPrice$.next(total);
    this.totalQuantity$.next(quantity);
    
    localStorage.setItem('cartItems', JSON.stringify(items));
  }

  private computeCartTotals(items: CartItem[]): { total: number, quantity: number } {
    let total = 0;
    let quantity = 0;

    for (let item of items) {
      total += item.quantity * item.unitPrice;
      quantity += item.quantity;
    }
    return { total, quantity };
  }
}

