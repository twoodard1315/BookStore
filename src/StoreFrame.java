import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StoreFrame extends JFrame {
	
	static String dbUrl = "jdbc:mysql://localhost:3306/bookstore";
	static String userName = "root";
	static String passWord = "Marlin67";

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoreFrame frame = new StoreFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public StoreFrame() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 283);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(10, 11, 414, 189);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(10, 1));
		
		DBConnection c = new DBConnection();
		ResultSets r = new ResultSets();
		//CartFrame cf = new CartFrame();
		
		//***************************************************************************
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JLabel label1_1 = new JLabel("Title");
		label1_1.setText("Title: " + r.resultTitle(c.connect(dbUrl, userName, passWord)).get(0));
		
		JLabel label1_2 = new JLabel("Author");
		label1_2.setText("Author: " + r.resultAuthor(c.connect(dbUrl, userName, passWord)).get(0));
		
		JLabel label1_3 = new JLabel("ISBN");
		label1_3.setText("ISBN: " + r.resultIsbn(c.connect(dbUrl, userName, passWord)).get(0));
		
		JLabel label1_4 = new JLabel("Price");
		label1_4.setText("Price: $" + r.resultPrice(c.connect(dbUrl, userName, passWord)).get(0));
		
		JButton Add_1 = new JButton("Add to Cart");
		
		panel_1.setLayout(new GridLayout(5, 1, 5, 5));
		panel_1.add(label1_1);
		panel_1.add(label1_2);
		panel_1.add(label1_3);
		panel_1.add(label1_4);
		panel_1.add(Add_1);
		
		//*****************************************************************
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(5, 1, 5, 5));
		
		JLabel label2_1 = new JLabel("Title");
		label2_1.setText("Title: " + r.resultTitle(c.connect(dbUrl, userName, passWord)).get(1));
		
		panel_2.add(label2_1);
		
		JLabel label2_2 = new JLabel("Author");
		label2_2.setText("Author: " + r.resultAuthor(c.connect(dbUrl, userName, passWord)).get(1));
		panel_2.add(label2_2);
		
		JLabel label2_3 = new JLabel("ISBN");
		label2_3.setText("ISBN: " + r.resultIsbn(c.connect(dbUrl, userName, passWord)).get(1));
		panel_2.add(label2_3);
		
		JLabel label2_4 = new JLabel("Price");
		label2_4.setText("Price: $" + r.resultPrice(c.connect(dbUrl, userName, passWord)).get(1));
		panel_2.add(label2_4);
		
		JButton Add_2 = new JButton("Add to Cart");
		panel_2.add(Add_2);
		
		//******************************************************************************
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(5, 1, 5, 5));
		
		JLabel label3_1 = new JLabel("Title");
		label3_1.setText("Title: " + r.resultTitle(c.connect(dbUrl, userName, passWord)).get(2));
		panel_3.add(label3_1);
		
		JLabel label3_2 = new JLabel("Author");
		label3_2.setText("Author: " + r.resultAuthor(c.connect(dbUrl, userName, passWord)).get(2));
		panel_3.add(label3_2);
		
		JLabel label3_3 = new JLabel("ISBN");
		label3_3.setText("ISBN: " + r.resultIsbn(c.connect(dbUrl, userName, passWord)).get(2));
		panel_3.add(label3_3);
		
		JLabel label3_4 = new JLabel("Price");
		label3_4.setText("Price: $" + r.resultPrice(c.connect(dbUrl, userName, passWord)).get(2));
		panel_3.add(label3_4);
		
		JButton Add_3 = new JButton("Add to Cart");
		panel_3.add(Add_3);
		
		//*********************************************************************
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(5, 1, 5, 5));
		
		JLabel label4_1 = new JLabel("Title");
		label4_1.setText("Title: " + r.resultTitle(c.connect(dbUrl, userName, passWord)).get(3));
		panel_4.add(label4_1);
		
		JLabel label4_2 = new JLabel("Author");
		label4_2.setText("Author: " + r.resultAuthor(c.connect(dbUrl, userName, passWord)).get(3));
		panel_4.add(label4_2);
		
		JLabel label4_3 = new JLabel("ISBN");
		label4_3.setText("ISBN: " + r.resultIsbn(c.connect(dbUrl, userName, passWord)).get(3));
		panel_4.add(label4_3);
		
		JLabel label4_4 = new JLabel("Price");
		label4_4.setText("Price: $" + r.resultPrice(c.connect(dbUrl, userName, passWord)).get(3));
		panel_4.add(label4_4);
		
		JButton Add_4 = new JButton("Add to Cart");
		panel_4.add(Add_4);
		
		//*************************************************************************
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new GridLayout(5, 1, 5, 5));
		
		JLabel label5_1 = new JLabel("Title");
		label5_1.setText("Title: " + r.resultTitle(c.connect(dbUrl, userName, passWord)).get(4));
		panel_5.add(label5_1);
		
		JLabel label5_2 = new JLabel("Author");
		label5_2.setText("Author: " + r.resultAuthor(c.connect(dbUrl, userName, passWord)).get(4));
		panel_5.add(label5_2);
		
		JLabel label5_3 = new JLabel("ISBN");
		label5_3.setText("ISBN: " + r.resultIsbn(c.connect(dbUrl, userName, passWord)).get(4));
		panel_5.add(label5_3);
		
		JLabel label5_4 = new JLabel("Price");
		label5_4.setText("Price: $" + r.resultPrice(c.connect(dbUrl, userName, passWord)).get(4));
		panel_5.add(label5_4);
		
		JButton Add_5 = new JButton("Add to Cart");
		panel_5.add(Add_5);
		
		//****************************************************************************
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		panel_6.setLayout(new GridLayout(5, 1, 5, 5));
		
		JLabel label6_1 = new JLabel("Title");
		label6_1.setText("Title: " + r.resultTitle(c.connect(dbUrl, userName, passWord)).get(5));
		panel_6.add(label6_1);
		
		JLabel label6_2 = new JLabel("Author");
		label6_2.setText("Author: " + r.resultAuthor(c.connect(dbUrl, userName, passWord)).get(5));
		panel_6.add(label6_2);
		
		JLabel label6_3 = new JLabel("ISBN");
		label6_3.setText("ISBN: " + r.resultIsbn(c.connect(dbUrl, userName, passWord)).get(5));
		panel_6.add(label6_3);
		
		JLabel label6_4 = new JLabel("Price");
		label6_4.setText("Price: $" + r.resultPrice(c.connect(dbUrl, userName, passWord)).get(5));
		panel_6.add(label6_4);
		
		JButton Add_6 = new JButton("Add to Cart");
		panel_6.add(Add_6);
		
		//*******************************************************************************
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7);
		panel_7.setLayout(new GridLayout(5, 1, 5, 5));
		
		JLabel label7_1 = new JLabel("Title");
		label7_1.setText("Title: " + r.resultTitle(c.connect(dbUrl, userName, passWord)).get(6));
		panel_7.add(label7_1);
		
		JLabel label7_2 = new JLabel("Author");
		label7_2.setText("Author: " + r.resultAuthor(c.connect(dbUrl, userName, passWord)).get(6));
		panel_7.add(label7_2);
		
		JLabel label7_3 = new JLabel("ISBN");
		label7_3.setText("ISBN: " + r.resultIsbn(c.connect(dbUrl, userName, passWord)).get(6));
		panel_7.add(label7_3);
		
		JLabel label7_4 = new JLabel("Price");
		label7_4.setText("Price: $" + r.resultPrice(c.connect(dbUrl, userName, passWord)).get(6));
		panel_7.add(label7_4);
		
		JButton Add_7 = new JButton("Add to Cart");
		panel_7.add(Add_7);
		
		//**************************************************************************
		
		JPanel panel_8 = new JPanel();
		panel.add(panel_8);
		panel_8.setLayout(new GridLayout(5, 1, 5, 5));
		
		JLabel label8_1 = new JLabel("Title");
		label8_1.setText("Title: " + r.resultTitle(c.connect(dbUrl, userName, passWord)).get(7));
		panel_8.add(label8_1);
		
		JLabel label8_2 = new JLabel("Author");
		label8_2.setText("Author: " + r.resultAuthor(c.connect(dbUrl, userName, passWord)).get(7));
		panel_8.add(label8_2);
		
		JLabel label8_3 = new JLabel("ISBN");
		label8_3.setText("ISBN: " + r.resultIsbn(c.connect(dbUrl, userName, passWord)).get(7));
		panel_8.add(label8_3);
		
		JLabel label8_4 = new JLabel("Price");
		label8_4.setText("Price: $" + r.resultPrice(c.connect(dbUrl, userName, passWord)).get(7));
		panel_8.add(label8_4);
		
		JButton Add_8 = new JButton("Add to Cart");
		panel_8.add(Add_8);
		
		//**************************************************************************
		
		JPanel panel_9 = new JPanel();
		panel.add(panel_9);
		panel_9.setLayout(new GridLayout(5, 1, 5, 5));
		
		JLabel label9_1 = new JLabel("Title");
		label9_1.setText("Title: " + r.resultTitle(c.connect(dbUrl, userName, passWord)).get(8));
		panel_9.add(label9_1);
		
		JLabel label9_2 = new JLabel("Author");
		label9_2.setText("Author: " + r.resultAuthor(c.connect(dbUrl, userName, passWord)).get(8));
		panel_9.add(label9_2);
		
		JLabel label9_3 = new JLabel("ISBN");
		label9_3.setText("ISBN: " + r.resultIsbn(c.connect(dbUrl, userName, passWord)).get(8));
		panel_9.add(label9_3);
		
		JLabel label9_4 = new JLabel("Price");
		label9_4.setText("Price: $" + r.resultPrice(c.connect(dbUrl, userName, passWord)).get(8));
		panel_9.add(label9_4);
		
		JButton Add_9 = new JButton("Add to Cart");
		panel_9.add(Add_9);
		
		//***********************************************************************************
		
		JPanel panel_10 = new JPanel();
		panel.add(panel_10);
		panel_10.setLayout(new GridLayout(5, 1, 5, 5));
		
		JLabel label10_1 = new JLabel("Title");
		label10_1.setText("Title: " + r.resultTitle(c.connect(dbUrl, userName, passWord)).get(9));
		panel_10.add(label10_1);
		
		JLabel label10_2 = new JLabel("Author");
		label10_2.setText("Author: " + r.resultAuthor(c.connect(dbUrl, userName, passWord)).get(9));
		panel_10.add(label10_2);
		
		JLabel label10_3 = new JLabel("ISBN");
		label10_3.setText("ISBN: " + r.resultIsbn(c.connect(dbUrl, userName, passWord)).get(9));
		panel_10.add(label10_3);
		
		JLabel label10_4 = new JLabel("Price");
		label10_4.setText("Price: " + r.resultPrice(c.connect(dbUrl, userName, passWord)).get(9));
		panel_10.add(label10_4);
		
		JButton Add_10 = new JButton("Add to Cart");
		panel_10.add(Add_10);
		
		JButton btnGoToCart = new JButton("Go to Cart");		
		btnGoToCart.setBounds(324, 213, 100, 23);
		contentPane.add(btnGoToCart);
		
		JLabel labelItemsInCart = new JLabel("Items in Cart:");
		labelItemsInCart.setBounds(20, 215, 100, 19);
		contentPane.add(labelItemsInCart);
		
		btnGoToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] args = null;
				CartFrame.main(args);
			}
		});
		
		Add_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		Add_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		Add_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		Add_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		Add_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		Add_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		Add_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		Add_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		Add_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		Add_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
}
