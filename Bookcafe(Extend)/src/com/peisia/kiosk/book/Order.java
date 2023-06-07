package com.peisia.kiosk.book;

import com.peisia.kiosk.book.product.Drink;
import com.peisia.kiosk.book.product.Food;
import com.peisia.kiosk.book.product.Time;
import com.peisia.kiosk.book.product.Comic;
import com.peisia.kiosk.book.product.Novel;
import com.peisia.kiosk.book.product.CouponDrink;

public class Order {
	public Time selectedTime;
	public Drink selectedDrink;
	public Food selectedFood;
	public Comic selectedComic;
	public Novel selectedNovel;
	public CouponDrink selectedCouponDrink;
	
	public Order (Drink drink) {
		this.selectedDrink=drink;
	}
	public Order (Time time) {
		this.selectedTime=time;
	}
	public Order (Food food) {
		this.selectedFood=food;
	}
	public Order (CouponDrink couponDrink) {
		this.selectedCouponDrink=couponDrink;
	}
	public Order(Comic comic) {
		this.selectedComic=comic;
	}
	public Order(Novel novel) {
		this.selectedNovel=novel;
	}
	
}
