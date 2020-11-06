package Airport;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class pg2 extends JFrame {

	private JPanel page2;
	private JLabel ticketNumMsg, ticketNum;
	private JTextField taTicket;
	private JButton reserveSearch, returnHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pg2 frame = new pg2();
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
	public pg2() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		page2 = new JPanel();
		page2.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(page2);
		page2.setLayout(null);
		
		
		ticketNumMsg = new JLabel("고객님의 티켓번호를 입력해 주십시오.");
		ticketNumMsg.setBounds(51, 54, 244, 31);
		page2.add(ticketNumMsg);
		
		ticketNum = new JLabel("티켓번호");
		ticketNum.setBounds(51, 105, 68, 31);
		page2.add(ticketNum);
		
		taTicket = new JTextField();
		taTicket.setBounds(133, 110, 206, 21);
		page2.add(taTicket);
		taTicket.setColumns(10);
		
		reserveSearch = new JButton("예약 조회");
		reserveSearch.setBounds(170, 195, 97, 23);
		page2.add(reserveSearch);
		
		returnHome = new JButton("홈으로 돌아가기");
		returnHome.setBounds(301, 10, 121, 23);
		page2.add(returnHome);
		
	} // end of 생성자함수

}
