package com.AluraHotel;

import java.awt.EventQueue;

import com.AluraHotel.views.MenuPrincipal;

public class AluraHotelMain {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
