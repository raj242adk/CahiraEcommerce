package com.ecommerce.cahira.repository;

import com.ecommerce.cahira.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findAllByCategory_Id(Integer id);
}
