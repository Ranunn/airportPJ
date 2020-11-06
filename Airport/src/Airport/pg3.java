package Airport;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class pg3 extends JFrame {

	private JPanel page3;
	private JLabel departureMsg, arrivalMsg;
	private JTextField taDeparture, taArrival;
	private JTable planTable;
	private JButton returnHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pg3 frame = new pg3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end of 메인함수

	/**
	 * Create the frame.
	 */
	public pg3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		page3 = new JPanel();
		page3.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(page3);
		page3.setLayout(null);
		
		departureMsg = new JLabel("출발지를 입력해 주십시오.");
		departureMsg.setBounds(26, 57, 153, 15);
		page3.add(departureMsg);
		
		arrivalMsg = new JLabel("도착지를 입력해 주십시오.");
		arrivalMsg.setBounds(254, 57, 144, 15);
		page3.add(arrivalMsg);
		
		taDeparture = new JTextField();
		taDeparture.setBounds(36, 82, 116, 21);
		page3.add(taDeparture);
		taDeparture.setColumns(10);
		
		taArrival = new JTextField();
		taArrival.setColumns(10);
		taArrival.setBounds(266, 82, 116, 21);
		page3.add(taArrival);
		
		JButton planSearch = new JButton("항공편 조회");
		planSearch.setBounds(158, 129, 97, 23);
		page3.add(planSearch);
		
		planTable = new JTable();
		planTable.setBounds(36, 184, 365, 67);
		page3.add(planTable);
		
		returnHome = new JButton("홈으로 돌아가기");
		returnHome.setBounds(301, 10, 121, 23);
		page3.add(returnHome);
		
	} // end of 생성자함수
}
