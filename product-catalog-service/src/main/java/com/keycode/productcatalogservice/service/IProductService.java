package com.keycode.productcatalogservice.service;

import com.keycode.productcatalogservice.entity.Product;

import java.util.List;

public interface IProductService {
    public List<Product> getAllProduct();
    public List<Product> getAllProductByCategory(String category);
    public Product getProductById(Long id);
    public List<Product> getAllProductsByName(String name);
    public Product addProduct(Product product);
    public void deleteProduct(Long productId);
}
