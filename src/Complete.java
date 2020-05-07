import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Complete extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Complete frame = new Complete();
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
	public Complete() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 200, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelMessage = new JLabel("Your order is complete! \r\n");
		labelMessage.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelMessage.setHorizontalAlignment(SwingConstants.CENTER);
		labelMessage.setBounds(10, 11, 164, 23);
		contentPane.add(labelMessage);
		
		JButton btnOK = new JButton("OK");
		btnOK.setBounds(46, 77, 89, 23);
		contentPane.add(btnOK);
		
		JLabel labelMessage2 = new JLabel("Thank you for your purchase!");
		labelMessage2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelMessage2.setHorizontalAlignment(SwingConstants.CENTER);
		labelMessage2.setBounds(10, 45, 164, 21);
		contentPane.add(labelMessage2);
	}

}
