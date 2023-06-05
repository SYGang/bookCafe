package com.peisia.kiosk.book;

import com.peisia.util.So;

public class Disp {
	String x= "x";
	final static String Dot = "";
	final static int Dot_Count = 12;
	public static void line() {
		for(int i=0;i<Dot_Count;i=i+1) {
			So.ln(Dot);
		}
		So.ln();
	}
	
	public static void title() {
		line();
		dot(5);
		So.ln("************  만화 카페  *************");
		line();
		dot(5);
	}
	
	public static void dot(int n) {
		for(int i=0;i<n;i++) {
			So.p(Dot);
		}
	}

}

