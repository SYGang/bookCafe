package com.peisia.kiosk.book;

import com.peisia.kiosk.book.product.Drink;
import com.peisia.kiosk.book.product.Food;
import com.peisia.kiosk.book.product.Time;

public class Order {
	public Time selectedTime;
	public Drink selectedDrink;
	public Food selectedFood;
	
	public Order (Drink drink) {
		this.selectedDrink=drink;
	}
	public Order (Time time) {
		this.selectedTime=time;
	}public Order (Food food) {
		this.selectedFood=food;
	}
	
}
