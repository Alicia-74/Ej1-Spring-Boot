package com.vedruna.ejemplo1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.ejemplo1.persistance.models.Product;
import com.vedruna.ejemplo1.persistance.repository.ProductRepositoryI;

@Service
public class ProductServiceImpl implements ProductServiceI {

    @Autowired
    ProductRepositoryI productRepo;

    @Override
    public List<Product> showAllProduct() {
        return productRepo.findAll();
    }

    @Override
    public Product showUserByProductName(String productName) {
        return productRepo.findByProductName(productName);
    }

    @Override
    public Product showUserByProductPrecio(Double productPrecio) {
        return productRepo.findByProductPrecio(productPrecio);
    }

    @Override
    public Product showUserByProductNameAndProductPrecio(String productName, Double productPrecio) {
        return productRepo.findByProductNameAndProductPrecio(productName, productPrecio);
    }

    @Override
    public void saveProduct(Product product) {
        productRepo.save(product);
    }

    @Override
    public void updateProduct(Long id, Product product) {
        product.setProductId(id);
        productRepo.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepo.deleteById(id);    
    }
    
}
