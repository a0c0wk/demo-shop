package com.demo.shop.entity;

public class LCDImpl implements LCD{
	
	Product product;

	public LCDImpl(Product product) {
		this.product = product;
	}
	
    @Override
    public void display(String message) {
        System.out.println(message);
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
