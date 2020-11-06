package Airport;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class KioskMain extends JPanel {

	JPanel mainPanel;
	JButton searchByPass, searchByTicket, searchByAirplane, searchByGate, logobutton;
	pg1_1 page1_1;
	

	/** 생성자함수 **/
	public KioskMain() {
		
		addLayout();
		eventProc();
		
//		page1_1 = new pg1_1();
		
//		setTitle("Airport");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	} // end of 생성자 함수
	
	
	/** 버튼 이벤트 **/
	public void eventProc() {
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
	}

	
	
	void addLayout() {
		
		mainPanel = new JPanel();
		setBounds(100, 100, 550, 400);
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
//		mainPanel.setContentPane(mainPanel);
		mainPanel.setLayout(new BorderLayout());
		JPanel pNorth, pCenter, pSouth, pEast, pWest;
		
		pNorth = new JPanel();
		pNorth.setLayout(new BorderLayout());
		mainPanel.add(pNorth, BorderLayout.NORTH);
		
		pCenter = new JPanel();
		pCenter.setLayout(new GridLayout(2,2));
		pCenter.add(searchByPass);
		pCenter.add(searchByTicket);
		pCenter.add(searchByAirplane);
		pCenter.add(searchByGate);
		
		mainPanel.add(pCenter, BorderLayout.CENTER);
		
		pSouth = new JPanel();
		pSouth.setLayout(new BorderLayout());
		mainPanel.add(pSouth, BorderLayout.SOUTH);
		
		pEast = new JPanel();
		pEast.setLayout(new BorderLayout());
		mainPanel.add(pEast, BorderLayout.EAST);
		
		
		
	// 버튼 크기 및 위치
		searchByPass = new JButton("여권번호로 예약 조회");
		searchByPass.setBackground(Color.WHITE);
		searchByPass.setFont(new Font("한컴산뜻돋움", Font.BOLD, 14));
		searchByPass.setBounds(75, 62, 160, 90);
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
		
//		setBounds(100, 100, 550, 400);
//		mainPanel = new JPanel();
//		mainPanel.setBackground(Color.WHITE);
//		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(mainPanel);
		mainPanel.setLayout(null);
	}

	
	
	/**
	 * Launch the application.
	
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
	*/
}
