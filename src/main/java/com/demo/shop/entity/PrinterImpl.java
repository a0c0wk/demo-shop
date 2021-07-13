package com.demo.shop.entity;

import java.util.ArrayList;
import java.util.List;

import com.demo.shop.business.ScannerSummary;

public class PrinterImpl implements Printer {
    
    private List<Product> list =  new ArrayList<>();
    Product product;

    
    
    public PrinterImpl(Product product) {
		this.product = product;
	}

	@Override
    public void printRecipt(ScannerSummary scannerSummary) {
        
        list = scannerSummary.productsList();
        
        list.forEach(list -> System.out.println("Product: " + list.getName() + ", price: " + list.getPrice()));
       
    }
    
    @Override
	public String getBarcode() {
		// TODO Auto-generated method stub
		return product.getBarcode();
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return product.getPrice();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return product.getName();
	}
}
