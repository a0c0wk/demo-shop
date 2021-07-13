package com.demo.shop.dao;

import java.util.Optional;

import com.demo.shop.entity.Product;

public interface ProductsDB {

    Optional<Product> findProductByBarcode(String barcode);
}
