import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CartFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CartFrame frame = new CartFrame();
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
	public CartFrame() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 285);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(10, 11, 414, 180);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(10, 1));
		
		//***************************************************************************
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JLabel label1_1 = new JLabel("Title");
		
		JLabel label1_2 = new JLabel("Author");
		
		JLabel label1_3 = new JLabel("ISBN");
		
		JLabel label1_4 = new JLabel("Price");
		
		JButton Remove_1 = new JButton("Remove");
		panel_1.setLayout(new GridLayout(5, 1, 5, 5));
		panel_1.add(label1_1);
		panel_1.add(label1_2);
		panel_1.add(label1_3);
		panel_1.add(label1_4);
		panel_1.add(Remove_1);
		
		panel_1.setVisible(false);
		
		//*****************************************************************
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(5, 1, 5, 5));
		
		JLabel label2_1 = new JLabel("Title");
		panel_2.add(label2_1);
		
		JLabel label2_2 = new JLabel("Author");
		panel_2.add(label2_2);
		
		JLabel label2_3 = new JLabel("ISBN");
		panel_2.add(label2_3);
		
		JLabel label2_4 = new JLabel("Price");
		panel_2.add(label2_4);
		
		JButton Remove_2 = new JButton("Remove");
		panel_2.add(Remove_2);
		
		panel_2.setVisible(false);
		
		//******************************************************************************
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(5, 1, 5, 5));
		
		JLabel label3_1 = new JLabel("Title");
		panel_3.add(label3_1);
		
		JLabel label3_2 = new JLabel("Author");
		panel_3.add(label3_2);
		
		JLabel label3_3 = new JLabel("ISBN");
		panel_3.add(label3_3);
		
		JLabel label3_4 = new JLabel("Price");
		panel_3.add(label3_4);
		
		JButton Remove_3 = new JButton("Remove");
		panel_3.add(Remove_3);
		
		panel_3.setVisible(false);
		//*********************************************************************
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(5, 1, 5, 5));
		
		JLabel label4_1 = new JLabel("Title");
		panel_4.add(label4_1);
		
		JLabel label4_2 = new JLabel("Author");
		panel_4.add(label4_2);
		
		JLabel label4_3 = new JLabel("ISBN");
		panel_4.add(label4_3);
		
		JLabel label4_4 = new JLabel("Price");
		panel_4.add(label4_4);
		
		JButton Remove_4 = new JButton("Remove");
		panel_4.add(Remove_4);
		
		panel_4.setVisible(false);
		
		//*************************************************************************
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new GridLayout(5, 1, 5, 5));
		
		JLabel label5_1 = new JLabel("Title");
		panel_5.add(label5_1);
		
		JLabel label5_2 = new JLabel("Author");
		panel_5.add(label5_2);
		
		JLabel label5_3 = new JLabel("ISBN");
		panel_5.add(label5_3);
		
		JLabel label5_4 = new JLabel("Price");
		panel_5.add(label5_4);
		
		JButton Remove_5 = new JButton("Remove");
		panel_5.add(Remove_5);
		
		panel_5.setVisible(false);
		
		//****************************************************************************
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		panel_6.setLayout(new GridLayout(5, 1, 5, 5));
		
		JLabel label6_1 = new JLabel("Title");
		panel_6.add(label6_1);
		
		JLabel label6_2 = new JLabel("Author");
		panel_6.add(label6_2);
		
		JLabel label6_3 = new JLabel("ISBN");
		panel_6.add(label6_3);
		
		JLabel label6_4 = new JLabel("Price");
		panel_6.add(label6_4);
		
		JButton Remove_6 = new JButton("Remove");
		panel_6.add(Remove_6);
		
		panel_6.setVisible(false);
		
		//*******************************************************************************
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7);
		panel_7.setLayout(new GridLayout(5, 1, 5, 5));
		
		JLabel label7_1 = new JLabel("Title");
		panel_7.add(label7_1);
		
		JLabel label7_2 = new JLabel("Author");
		panel_7.add(label7_2);
		
		JLabel label7_3 = new JLabel("ISBN");
		panel_7.add(label7_3);
		
		JLabel label7_4 = new JLabel("Price");
		panel_7.add(label7_4);
		
		JButton Remove_7 = new JButton("Remove");
		panel_7.add(Remove_7);
		
		panel_7.setVisible(false);
		
		//**************************************************************************
		
		JPanel panel_8 = new JPanel();
		panel.add(panel_8);
		panel_8.setLayout(new GridLayout(5, 1, 5, 5));
		
		JLabel label8_1 = new JLabel("Title");
		panel_8.add(label8_1);
		
		JLabel label8_2 = new JLabel("Author");
		panel_8.add(label8_2);
		
		JLabel label8_3 = new JLabel("ISBN");
		panel_8.add(label8_3);
		
		JLabel label8_4 = new JLabel("Price");
		panel_8.add(label8_4);
		
		JButton Remove_8 = new JButton("Remove");
		panel_8.add(Remove_8);
		
		panel_8.setVisible(false);
		
		//**************************************************************************
		
		JPanel panel_9 = new JPanel();
		panel.add(panel_9);
		panel_9.setLayout(new GridLayout(5, 1, 5, 5));
		
		JLabel label9_1 = new JLabel("Title");
		panel_9.add(label9_1);
		
		JLabel label9_2 = new JLabel("Author");
		panel_9.add(label9_2);
		
		JLabel label9_3 = new JLabel("ISBN");
		panel_9.add(label9_3);
		
		JLabel label9_4 = new JLabel("Price");
		panel_9.add(label9_4);
		
		JButton Remove_9 = new JButton("Remove to Cart");
		panel_9.add(Remove_9);
		
		panel_9.setVisible(false);
		
		//***********************************************************************************
		
		JPanel panel_10 = new JPanel();
		panel.add(panel_10);
		panel_10.setLayout(new GridLayout(5, 1, 5, 5));
		
		JLabel label10_1 = new JLabel("Title");
		panel_10.add(label10_1);
		
		JLabel label10_2 = new JLabel("Author");
		panel_10.add(label10_2);
		
		JLabel label10_3 = new JLabel("ISBN");
		panel_10.add(label10_3);
		
		JLabel label10_4 = new JLabel("Price");
		panel_10.add(label10_4);
		
		JButton Remove_10 = new JButton("Remove");
		panel_10.add(Remove_10);
		
		panel_10.setVisible(false);
		
		//*****************************************************************
		
		JButton btnCheckOut = new JButton("Checkout");
		btnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] args = null;
				Complete.main(args);
			}
		});
		btnCheckOut.setBounds(324, 213, 100, 23);
		contentPane.add(btnCheckOut);
		
		JLabel labelItemsInCart = new JLabel("Items in Cart:");
		labelItemsInCart.setBounds(20, 215, 100, 19);
		contentPane.add(labelItemsInCart);
	}

}
