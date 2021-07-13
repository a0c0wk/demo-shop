package com.demo.shop.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.demo.shop.dao.ProductsDB;
import com.demo.shop.entity.Product;

public class ScannerImpl implements Scanner {

    private ProductsDB productsDB;

    private List<Product> productsList = new ArrayList<Product>();

    public ScannerImpl(ProductsDB productsDB) {
        this.productsDB = productsDB;
    }

    @Override
    public ScannerResult scanProduct(String barcode) {

        if (barcode.isEmpty()) {
            return new ScannerResultImpl(Optional.empty(), Optional.of("Invalid barcode"));
        }

        Optional<Product> product = productsDB.findProductByBarcode(barcode);

        if (product.isPresent()) {
            productsList.add(product.get());
            return new ScannerResultImpl(product, Optional.of("Product found in DB"));
        } else {
            return new ScannerResultImpl(Optional.empty(), Optional.of("Product not found in DB"));
        }

    }

    @Override
    public ScannerSummary finish() {
        return new ScannerSummaryImpl(productsList);
    }

}
