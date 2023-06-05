package com.peisia.kiosk.book;

import java.util.ArrayList;
import java.util.Scanner;

import com.peisia.kiosk.book.product.Drink;
import com.peisia.kiosk.book.product.Food;
import com.peisia.kiosk.book.product.Time;

public class KioskObj {
	public static ArrayList<Order> basket = new ArrayList<>();
	public static ArrayList<Time> time = new ArrayList<>();
	public static ArrayList<Food> food = new ArrayList<>();
	public static ArrayList<Drink> drink = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);
	public static String cmd;
	
	public static void productLoad() {
		drink.add(new Drink("콜라",2000));	
		drink.add(new Drink("사이다",2000));
		drink.add(new Drink("카라멜 마끼아토",3000));
		drink.add(new Drink("아메리카노",2000));
		food.add(new Food("라면",2000));
		food.add(new Food("짜장라면",3000));
		food.add(new Food("떡볶이",4000));
		food.add(new Food("핫도그",2000));
		time.add(new Time("3시간",4000));
		time.add(new Time("5시간+음료",7000));
		time.add(new Time("8시간+음료",9000));
		time.add(new Time("종일권+음료",15000));
		
	}
}
