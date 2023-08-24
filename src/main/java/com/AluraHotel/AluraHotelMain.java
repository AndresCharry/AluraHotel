package com.AluraHotel;

import java.awt.EventQueue;

import com.AluraHotel.views.MainMenu;

public class AluraHotelMain {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
