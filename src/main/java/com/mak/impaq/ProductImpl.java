package com.mak.impaq;

public class ProductImpl implements Product {

    private String barcode;
    private int price;
    private String name;

    public ProductImpl(String barcode, int price, String name) {
        this.barcode = barcode;
        this.price = price;
        this.name = name;
    }

    @Override
    public String getBarcode() {
        return barcode;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

}
