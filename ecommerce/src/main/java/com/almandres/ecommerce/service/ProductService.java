
import com.almandres.ecommerce.model.Product;
import com.almandres.ecommerce.model.ProductCategory;
import java.util.List;

public interface ProductService {
    List<ProductCategory> listProductCategories();
    Product get(Integer id);
    Product create(Product product);
    Product update(Product product);
    void delete(Integer id);
}