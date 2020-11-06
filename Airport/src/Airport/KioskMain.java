package Airport;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class KioskMain extends JFrame {

	JPanel mainPanel;
	JButton searchByPass, searchByTicket, searchByAirplane, searchByGate, logobutton;
	pg1_1 page1_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KioskMain frame = new KioskMain();
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
	public KioskMain() {
		
		page1_1 = new pg1_1();
		
		setTitle("Airport");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPanel);
		mainPanel.setLayout(null);

		// 버튼 크기 및 위치
		searchByPass = new JButton("여권번호로 예약 조회");
		searchByPass.setFont(new Font("한컴산뜻돋움", Font.BOLD, 14));
		searchByPass.setBackground(Color.WHITE);
		searchByPass.setBounds(75, 62, 160, 90);
		searchByPass.setContentAreaFilled(true);
		searchByPass.setRolloverIcon(new ImageIcon("src/Image/kosmo02.png"));
		mainPanel.add(searchByPass);

		searchByTicket = new JButton("티켓번호로 예약 조회");
		searchByTicket.setBackground(Color.WHITE);
		searchByTicket.setFont(new Font("한컴산뜻돋움", Font.BOLD, 14));
		searchByTicket.setBounds(293, 62, 160, 90);
		mainPanel.add(searchByTicket);

		searchByAirplane = new JButton("항공편 조회");
		searchByAirplane.setBackground(Color.WHITE);
		searchByAirplane.setFont(new Font("한컴산뜻돋움", Font.BOLD, 14));
		searchByAirplane.setBounds(75, 192, 160, 90);
		mainPanel.add(searchByAirplane);

		searchByGate = new JButton("게이트 조회");
		searchByGate.setBackground(Color.WHITE);
		searchByGate.setFont(new Font("한컴산뜻돋움", Font.BOLD, 14));
		searchByGate.setBounds(293, 192, 160, 90);
		mainPanel.add(searchByGate);



		// 버튼 이벤트 핸들러
		searchByPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "여권번호로 예약 조회");
				
			}
		});
		searchByTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "티켓번호로 예약 조회");
			}
		});
		searchByAirplane.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "항공편 조회");
			}
		});
		searchByGate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "게이트 조회");
			}
		});

	} // end of 생성자 함수



}
