package com.peisia.kiosk.book;

import com.peisia.kiosk.book.product.Drink;
import com.peisia.util.So;

public class MenuDrink {
	
	public static void run() {
		for(Drink p:KioskObj.drink) {
			So.ln(p.name+""+p.price+"원");
		}
		yy:while(true) {
			So.ln("[1. 콜라 /2. 사이다 /3. 아메리카노 /4. 카라멜마끼아토 /x. 이전메뉴 이동]");
			KioskObj.cmd=KioskObj.sc.next();
			switch(KioskObj.cmd) {
			case "1":
				So.ln(KioskObj.drink.get(0).name+"선택됨");
				KioskObj.basket.add(new Order(KioskObj.drink.get(0)));
				break;
			case "2":
				So.ln(KioskObj.drink.get(1).name+"선택됨");
				KioskObj.basket.add(new Order(KioskObj.drink.get(1)));
				break;
			case "3":
				So.ln(KioskObj.drink.get(2).name+"선택됨");
				KioskObj.basket.add(new Order(KioskObj.drink.get(2)));
				break;
			case "4":
				So.ln(KioskObj.drink.get(3).name+"선택됨");
				KioskObj.basket.add(new Order(KioskObj.drink.get(3)));
				break;
			case "x":
				So.ln("이전 메뉴 이동");
				break yy;
		
			}
		}
	}
}
