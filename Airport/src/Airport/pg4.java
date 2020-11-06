package Airport;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class pg4 extends JFrame {

	private JPanel page4;
	private JLabel gateSearchMsg, gateResult, mapResult;
	private JTextField tfGate;
	private JTextArea taResult;
	private JButton searchGate, returnHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pg4 frame = new pg4();
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
	public pg4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		page4 = new JPanel();
		page4.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(page4);
		page4.setLayout(null);
		
		gateSearchMsg = new JLabel("항공편명을 입력하여 주십시오.");
		gateSearchMsg.setBounds(12, 35, 174, 15);
		page4.add(gateSearchMsg);
		
		mapResult = new JLabel("지도 및 조회 결과");
		mapResult.setBounds(273, 63, 105, 15);
		page4.add(mapResult);
		
		gateResult = new JLabel("번 게이트");
		gateResult.setBounds(250, 88, 57, 15);
		page4.add(gateResult);
		
		tfGate = new JTextField();
		tfGate.setBounds(12, 60, 174, 21);
		page4.add(tfGate);
		tfGate.setColumns(10);
		
		taResult = new JTextArea();
		taResult.setBounds(236, 60, 168, 158);
		page4.add(taResult);
		
		searchGate = new JButton("항공편 조회");
		searchGate.setBounds(41, 169, 97, 23);
		page4.add(searchGate);
		
		returnHome = new JButton("홈으로 돌아가기");
		returnHome.setBounds(301, 10, 121, 23);
		page4.add(returnHome);
		
	} // end of 생성자함수
}
