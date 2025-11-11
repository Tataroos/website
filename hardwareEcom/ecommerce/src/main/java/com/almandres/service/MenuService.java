package com.almandres.service;

import java.util.List;

import com.almandres.model.Menu;

public interface MenuService {
    List<Menu> getMenus();
    Menu create(Menu menu);
}
