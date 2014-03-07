import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;


public class BikeShopGUI extends JFrame {

	BikeShop myBikeStore = new BikeShop();
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton button;
	private JTextArea textArea;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeShopGUI frame = new BikeShopGUI();
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
	public BikeShopGUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(178, 125, 246, 126);
		contentPane.add(textField);
		textField.setColumns(10);

		textArea = new JTextArea();
		textArea.setBounds(178, 45, 246, 69);
		contentPane.add(textArea);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(66, 47, 102, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(66, 78, 102, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(66, 109, 102, 20);
		contentPane.add(textField_3);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(10, 50, 46, 14);
		contentPane.add(lblColor);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(10, 81, 46, 14);
		contentPane.add(lblSize);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(10, 112, 46, 14);
		contentPane.add(lblPrice);
		
		JLabel lblAddNewBike = new JLabel("Add new Bike");
		lblAddNewBike.setBounds(10, 11, 82, 25);
		contentPane.add(lblAddNewBike);
		
		/***/
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myBikeStore.addBike(textField_1.getText(), textField_2.getText(), textField_3.getText());
				textArea.setText(myBikeStore.getAllBikes());
			}
		});
		btnNewButton.setBounds(104, 136, 66, 26);
		contentPane.add(btnNewButton);
		
		/**Shows all bikes*/
		button = new JButton("Show All");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(myBikeStore.getAllBikes());
			}
		});
		button.setBounds(278, 10, 146, 26);
		contentPane.add(button);
		
		
	}
}
