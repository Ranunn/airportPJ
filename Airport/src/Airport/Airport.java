package Airport;

import javax.swing.JFrame;

public class Airport {

	KioskMain mainpage;
	pg1_1 page1_1;
	pg1_3pg2_3 page1_2;
	pg3_1 page3_1;
	pg4_1 page4_1;
	
	public Airport() {
		mainpage = new KioskMain();
		page1_1 = new pg1_1();
		page1_2 = new pg1_3pg2_3();
		page3_1 = new pg3_1();
		page4_1 = new pg4_1();
		
		JFrame frame = new JFrame();
		
		frame.setBounds(100, 100, 550, 400);
		frame.setTitle("Airport");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		
		Airport a = new Airport();
		
	}
}