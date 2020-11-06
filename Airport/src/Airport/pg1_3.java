package Airport;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class pg1_3 extends JFrame {

	private JPanel page1_3;
	private JTextArea ticketResult;
	private JButton ticketing, returnHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pg1_3 frame = new pg1_3();
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
	public pg1_3() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		page1_3 = new JPanel();
		page1_3.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(page1_3);
		page1_3.setLayout(null);
		
		ticketResult = new JTextArea();
		ticketResult.setBounds(132, 48, 155, 159);
		page1_3.add(ticketResult);
		
		ticketing = new JButton("티켓 발권");
		ticketing.setBounds(162, 228, 97, 23);
		page1_3.add(ticketing);
		
		returnHome = new JButton("홈으로 돌아가기");
		returnHome.setBounds(301, 10, 121, 23);
		page1_3.add(returnHome);
		
	} // end of 생성자함수
}
