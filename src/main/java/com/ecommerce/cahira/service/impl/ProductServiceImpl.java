package com.ecommerce.cahira.service.impl;

import com.ecommerce.cahira.entity.Product;
import com.ecommerce.cahira.repository.ProductRepository;
import com.ecommerce.cahira.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public List<Product> getAllProduct() {

        return productRepository.findAll();
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProductById(Integer id) {
    productRepository.deleteById(id);
    }

    @Override
    public Optional<Product> getProductById(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> getAllProductByCategoryId(Integer id) {
        return productRepository.findAllByCategory_Id(id);
    }

    @Override
    public Object searchProductsByName(String productName) {
        List<Product> searchResults = new ArrayList<>();
        List<Product> allProducts = getAllProduct();

        for (Product product : allProducts) {
            if (product.getName().toLowerCase().contains(productName.toLowerCase())) {
                searchResults.add(product);
            }
        }


        return searchResults;
    }


}
