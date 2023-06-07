package com.peisia.kiosk.book;

import com.peisia.kiosk.book.product.Comic;
import com.peisia.util.So;

public class MenuComic {
	
	public static void run() {
		So.ln("대출할 기간을 선택해주세요");
		for(Comic p:KioskObj.comic) {
			So.ln(p.name+""+p.price+"원");
		}
		yy:while(true) {
			So.ln("[1. 3일 /2. 7일 /3.10일 /x. 이전메뉴 이동]");
			KioskObj.cmd=KioskObj.sc.next();
			switch(KioskObj.cmd) {
			case "1":
				So.ln(KioskObj.comic.get(0).name+"선택됨");
				KioskObj.basket.add(new Order(KioskObj.comic.get(0)));
				break;
			case "2":
				So.ln(KioskObj.comic.get(1).name+"선택됨");
				KioskObj.basket.add(new Order(KioskObj.comic.get(1)));
				break;
			case "3":
				So.ln(KioskObj.comic.get(2).name+"선택됨");
				KioskObj.basket.add(new Order(KioskObj.comic.get(2)));
				break;
			case "x":
				So.ln("이전 메뉴 이동");
				break yy;
		
			}
		}
	}
}

