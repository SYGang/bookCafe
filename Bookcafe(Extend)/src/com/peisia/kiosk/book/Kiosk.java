package com.peisia.kiosk.book;

import com.peisia.util.So;

public class Kiosk {

	void run() {
	KioskObj.productLoad();
		Disp.title();
		xx: while (true) {
			So.ln("[1. 시간 선택 /2. 음료 선택 /3. 음식 선택 /4. 도서대출/e. 선택완료]");
			KioskObj.cmd = KioskObj.sc.next();
			switch (KioskObj.cmd) {
			case "1":
				MenuTime.run();
				break;
			case "2":
				MenuDrink.run();
				break;
			case "3":
				MenuFood.run();
				break;
			case "4":
				MenuBookRental.run();
				break;
			
			case "e":
				int sum = 0;
				for (Order o : KioskObj.basket) {
					if (null != o.selectedTime) {
						sum = sum + o.selectedTime.price;
					}
					if (null != o.selectedFood) {
						sum = sum + o.selectedFood.price;
					}
					if (null != o.selectedDrink) {
						sum = sum + o.selectedDrink.price;
					}
					if (null != o.selectedComic) {
						sum = sum + o.selectedComic.price;
					}
					if (null != o.selectedNovel) {
						sum = sum + o.selectedNovel.price;
					}
				}
					So.ln("선택상품 내역");
					So.ln("===========================");
					for (Order o1 : KioskObj.basket) {
						if (null != o1.selectedTime) {
							So.ln(o1.selectedTime.name);
						}
						if (null != o1.selectedDrink) {
							So.ln(o1.selectedDrink.name);
						
						}
						if (null != o1.selectedFood) {
							So.ln(o1.selectedFood.name);						
						}
						if (null != o1.selectedComic) {
							So.ln(o1.selectedComic.name);						
						}
						if (null != o1.selectedNovel) {
							So.ln(o1.selectedNovel.name);						
						}
					}
					So.ln("===========================");
					So.ln("계산하실 금액은" + sum + "원 입니다.");
					break xx;
				}

			}
		}

	}


