package com.peisia.kiosk.book;

import com.peisia.kiosk.book.product.Time;
import com.peisia.util.So;

public class MenuTime {


	public static void run() {
		for(Time p:KioskObj.time) {
			So.ln(p.name+""+p.price+"원");
		}
		yy:while(true) {
			So.ln("[1. 3시간 /2. 5시간+쿠폰음료 /3. 8시간+쿠폰음료 /4. 종일권+쿠폰음료 /x. 이전메뉴이동]");
			KioskObj.cmd=KioskObj.sc.next();
			switch(KioskObj.cmd) {
			case "1":
				So.ln(KioskObj.time.get(0).name+"선택됨");
				KioskObj.basket.add(new Order(KioskObj.time.get(0)));
				break;
			case "2":
				So.ln(KioskObj.time.get(1).name+"선택됨");
				KioskObj.basket.add(new Order(KioskObj.time.get(1)));
				MenuCoupon.run();
				break;
			case "3":
				So.ln(KioskObj.time.get(2).name+"선택됨");
				KioskObj.basket.add(new Order(KioskObj.time.get(2)));
				break;
			case "4":
				So.ln(KioskObj.time.get(3).name+"선택됨");
				KioskObj.basket.add(new Order(KioskObj.time.get(3)));
				break;
			case "x":
				So.ln("이전메뉴 이동");
				break yy;
			}
		}
	}
}
