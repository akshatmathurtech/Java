package com.java.hotel;
import java.util.List;

import hotelssss.UserVisible;

public class Tester {

	public static void main(String[] args) {
		
		List<Hotel> list= UserVisible.avaiableHotels();
		System.out.println(UserVisible.enterUserData());
	}
}