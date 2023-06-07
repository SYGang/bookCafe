package com.peisia.kiosk.book;
import com.peisia.util.So;

public class MenuBookRental {

	public static void run() {

		yy: while (true) {
			So.ln("[1. 만화책 /2. 소설책 /x. 이전메뉴이동]");
			KioskObj.cmd = KioskObj.sc.next();
			switch (KioskObj.cmd) {
			case "1":
				MenuComic.run();
				break;
			case "2":
				MenuNovel.run();
				break;
			
			case "e":
				So.ln("이전 메뉴 이동");
				break yy;
			}
		}
}

}