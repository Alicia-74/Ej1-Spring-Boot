package com.vedruna.ejemplo1.services;

import java.util.List;
import com.vedruna.ejemplo1.persistance.models.Product;

public interface ProductServiceI {
    List<Product> showAllProduct();
    Product showUserByProductName(String productName);
    Product showUserByProductPrecio(Double productPrecio);
    Product showUserByProductNameAndProductPrecio(String productName, Double productPrecio);
    void saveProduct(Product product);
    void updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}
