package com.peisia.kiosk.book;

import java.util.ArrayList;
import java.util.Scanner;

import com.peisia.kiosk.book.product.Comic;
import com.peisia.kiosk.book.product.CouponDrink;
import com.peisia.kiosk.book.product.Drink;
import com.peisia.kiosk.book.product.Food;
import com.peisia.kiosk.book.product.Novel;
import com.peisia.kiosk.book.product.Time;

public class KioskObj {
	public static ArrayList<Order> basket = new ArrayList<>();
	public static ArrayList<Time> time = new ArrayList<>();
	public static ArrayList<Food> food = new ArrayList<>();
	public static ArrayList<Drink> drink = new ArrayList<>();
	public static ArrayList<Comic> comic = new ArrayList<>();
	public static ArrayList<Novel> novel = new ArrayList<>();
	public static ArrayList<CouponDrink> couponDrink = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);
	public static String cmd;
	
	public static void productLoad() {
		drink.add(new Drink("콜라",2000));	
		drink.add(new Drink("사이다",2000));
		drink.add(new Drink("아메리카노",2000));
		drink.add(new Drink("카라멜 마끼아토",3000));
		food.add(new Food("라면",2000));
		food.add(new Food("짜장라면",3000));
		food.add(new Food("떡볶이",4000));
		food.add(new Food("핫도그",2000));
		time.add(new Time("3시간",4000));
		time.add(new Time("5시간",7000));
		time.add(new Time("8시간",9000));
		time.add(new Time("종일권",15000));
		comic.add(new Comic("3일",1000));
		comic.add(new Comic("7일",2000));
		comic.add(new Comic("10일",3000));
		novel.add(new Novel("3일",1000));
		novel.add(new Novel("7일",2000));
		novel.add(new Novel("10일",3000));
		couponDrink.add(new CouponDrink("콜라",0));
		couponDrink.add(new CouponDrink("사이다",0));
		couponDrink.add(new CouponDrink("아메리카노",0));
		couponDrink.add(new CouponDrink("카라멜 마끼아토",0));
		
		
	}
}
