package Airport;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class pg1_2 extends JFrame {

	private JPanel page2;
	private JButton select, returnHome;
	private JButton[][] seat;


	/**
	 * Create the frame.
	 */
	public pg1_2() {
		
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
		
		
		JPanel pCenter = new JPanel();
		pCenter.setLayout(new BorderLayout());
			JPanel pCenterCenter = new JPanel();
			pCenterCenter.setLayout(new BorderLayout());
			// 좌석 열 이름
			JPanel seatColName = new JPanel();
				seatColName.setLayout(new GridLayout(1,4));
					JButton seatA = new JButton("A");
					JButton seatB = new JButton("B");
					JButton seatC = new JButton("C");
					JButton seatD = new JButton("D");
					seatA.setEnabled(false);
					seatB.setEnabled(false);
					seatC.setEnabled(false);
					seatD.setEnabled(false);
					seatColName.add(seatA);
					seatColName.add(seatB);
					seatColName.add(seatC);
					seatColName.add(seatD);
				pCenterCenter.add(seatColName, BorderLayout.NORTH);
			// 좌석 버튼
			JPanel seatNum = new JPanel();
				int i=10, j=4;
				seatNum.setLayout(new GridLayout(i,j));
					JButton[][] seat = new JButton[i][j];
					for (int row=0; row<seat.length; row++) {
						for (int col=0; col<seat[row].length; col++) {
						seat[row][col] = new JButton(""+(row+1)+"");
						seat[row][col].setSize(50,50);
						seat[row][col].addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								// 이벤트 
							}
						});
						seatNum.add(seat[row][col]);
						}
					}
				pCenterCenter.add(seatNum, BorderLayout.CENTER);
			pCenter.add(pCenterCenter, BorderLayout.CENTER);
//		add(pCenter, BorderLayout.CENTER);
		pCenter.setBounds(40, 40, 350, 180);
		page2.add(pCenter);
		
		
		select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "선택완료 버튼 이벤트");
			}
		});
		returnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "홈으로 돌아가기 버튼 이벤트");
			}
		});
		
		add(select, BorderLayout.NORTH);
		add(returnHome, BorderLayout.SOUTH);
		
		
		setBounds(100, 100, 450, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

	}
	
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
}
