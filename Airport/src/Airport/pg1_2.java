package Airport;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class pg1_2 extends JFrame {

	private JPanel page2;
	private JButton select, returnHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pg1_2 frame = new pg1_2();
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
	public pg1_2() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		page2 = new JPanel();
		page2.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(page2);
		page2.setLayout(null);
		
		select = new JButton("선택 완료");
		select.setBounds(164, 228, 97, 23);
		page2.add(select);
		
		returnHome = new JButton("홈으로 돌아가기");
		returnHome.setBounds(301, 10, 121, 23);
		page2.add(returnHome);
		
		
	} // end of 생성자함수
	
	
}
