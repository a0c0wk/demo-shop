package com.demo.shop;

import java.util.Optional;

import com.demo.shop.business.Scanner;
import com.demo.shop.business.ScannerImpl;
import com.demo.shop.dao.ProductsDB;
import com.demo.shop.entity.LCDImpl;
import com.demo.shop.entity.PrinterImpl;
import com.demo.shop.entity.Product;
import com.demo.shop.entity.ProductImpl;

public class DemoShop {

	public static void main(String[] args) {

		Optional<Product> lcd = Optional.of(new LCDImpl(new ProductImpl("123", 100, "LCD")));
		Optional<Product> printer = Optional.of(new PrinterImpl(new ProductImpl("456", 200, "printer")));

		ProductsDB productsDB = new ProductsDB() {

			@Override
			public Optional<Product> findProductByBarcode(String barcode) {
				// TODO Auto-generated method stub
				if (barcode.equalsIgnoreCase(lcd.get().getBarcode()))
					return lcd;
				else if (barcode.equalsIgnoreCase(printer.get().getBarcode()))
					return printer;
				return 
					Optional.empty();
				
			}
		};

		// TODO Auto-generated method stub
		Scanner scanner = new ScannerImpl(productsDB);
		System.out.println("---> " + scanner.scanProduct("123").message());
		System.out.println("---> " + scanner.scanProduct("456").message());
		System.out.println("---> " + scanner.scanProduct("789").message());
		scanner.finish().productsList().forEach(d -> System.out.println(d.getName()));
		System.out.println("---> " + scanner.finish().summaryPrice());
	}
	

}
