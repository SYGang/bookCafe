package com.peisia.kiosk.book;

import com.peisia.kiosk.book.product.Food;
import com.peisia.util.So;

public class MenuFood {
	public static void run() {
		for(Food p:KioskObj.food) {
			So.ln(p.name+""+p.price+"원");
		}
		yy:while(true) {
			So.ln("[1. 라면 /2. 짜장라면 /3.떡볶이 /4. 핫도그 /x. 이전메뉴이동]");
			KioskObj.cmd=KioskObj.sc.next();
			switch(KioskObj.cmd) {
			case "1":
				So.ln(KioskObj.food.get(0).name+"선택됨");
				KioskObj.basket.add(new Order(KioskObj.food.get(0)));
				break;
			case "2":
				So.ln(KioskObj.food.get(1).name+"선택됨");
				KioskObj.basket.add(new Order(KioskObj.food.get(1)));
				break;
			case "3":
				So.ln(KioskObj.food.get(2).name+"선택됨");
				KioskObj.basket.add(new Order(KioskObj.food.get(3)));
				break;
			case "4":
				So.ln(KioskObj.food.get(3).name+"선택됨");
				KioskObj.basket.add(new Order(KioskObj.food.get(3)));
				break;
			case "x":
				So.ln("이전 메뉴 이동");
				break yy;
			}
			}
	}
}
