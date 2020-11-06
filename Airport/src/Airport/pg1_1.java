package Airport;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class pg1_1 extends JFrame {

	private JPanel page1;
	private final JLabel passNumMsg, passNum;
	private JTextField taPass;
	private JButton reserveSearch, returnHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pg1_1 frame = new pg1_1();
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
	public pg1_1() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		page1 = new JPanel();
		page1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(page1);
		page1.setLayout(null);
		
		passNumMsg = new JLabel("고객님의 여권번호를 입력해 주십시오.");
		passNumMsg.setBounds(51, 54, 244, 31);
		page1.add(passNumMsg);
		
		passNum = new JLabel("여권번호");
		passNum.setBounds(51, 105, 68, 31);
		page1.add(passNum);
		
		taPass = new JTextField();
		taPass.setBounds(133, 110, 206, 21);
		page1.add(taPass);
		taPass.setColumns(10);
		
		reserveSearch = new JButton("예약 조회");
		reserveSearch.setBounds(170, 195, 97, 23);
		page1.add(reserveSearch);
		
		returnHome = new JButton("홈으로 돌아가기");
		returnHome.setBounds(301, 10, 121, 23);
		page1.add(returnHome);
	}
}
	
	
	
