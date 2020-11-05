package Airport;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class pg1_2pg2_2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pg1_2pg2_2 frame = new pg1_2pg2_2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public pg1_2pg2_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("홈으로 돌아가기");
		btnNewButton_1.setBounds(301, 10, 121, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("선택 완료");
		btnNewButton.setBounds(164, 228, 97, 23);
		contentPane.add(btnNewButton);
	}
	
	public class button_array{
		public static void main(String[] args)
	}

}
