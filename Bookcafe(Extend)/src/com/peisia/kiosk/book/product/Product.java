package com.peisia.kiosk.book.product;

import com.peisia.util.So;

public class Product {

	public String name;
	public int price;
	public Product(String xx, int yy) {
		name = xx;
		price = yy;
		
	}
	
	void info() {
		So.ln("상품명: "+name+"가격:"+price);
	}

}
