package Airport;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import Airport.KioskMain;

public class Airport extends JFrame{

	KioskMain mainpage;
	pg1_1 page1;
//	pg1_2 page2;
	pg1_3 page1seat;
	pg3 page3;
	pg4 page4;
	
	public Airport() {
		mainpage = new KioskMain();
		page1 = new pg1_1();
		page1seat = new pg1_3();
		page3 = new pg3();
		page4 = new pg4();
		
		JTabbedPane frame = new JTabbedPane();
		frame.add("메인화면", mainpage);
//		frame.add("여권번호로 예약 조회", page1);
//		frame.add("티켓번호로 예약 조회", page2);
//		frame.add("좌석 선택", page1seat);
//		frame.add("항공편 조회", page3);
		
		frame.setSelectedIndex(0);
		
//		getContentPane.add("Center", frame);
		pack();
		setVisible(true);
		
		frame.setBounds(100, 100, 550, 400);
//		frame.setTitle("Airport");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		
		new Airport();
		
	}
}
