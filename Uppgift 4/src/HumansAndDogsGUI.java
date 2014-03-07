import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


public class HumansAndDogsGUI extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextArea textArea;
	private JTextArea textArea_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumansAndDogsGUI frame = new HumansAndDogsGUI();
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

	private Human person;
	private Dog dog;

	
	public HumansAndDogsGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 262);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 123, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 42, 123, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textArea = new JTextArea();
		textArea.setBounds(10, 123, 268, 49);
		contentPane.add(textArea);
		
		textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 191, 268, 22);
		contentPane.add(textArea_1);
		
		JButton btnNewButton = new JButton("New Owner");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if ((String.valueOf(textField.getText()).length() >= Human.MIN_LENGTH)){
					person = new Human(String.valueOf(textField.getText()));
			}else{
				textArea_1.setText("Name not long enough");
			}
			}
		});
		btnNewButton.setBounds(143, 10, 135, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buy Dog");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (person != null){
					dog = new Dog(String.valueOf(textField_1.getText()));
					person.buyDog(dog);
				}else{
					textArea_1.setText("Dog must have an owner, you fooo");
				}
			}
		});
		btnNewButton_1.setBounds(143, 41, 135, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Print Info");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(person.getInfo());
			}
		});
		btnNewButton_2.setBounds(143, 72, 135, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(10, 110, 46, 14);
		contentPane.add(lblInfo);
		
		JLabel lblErrormessage = new JLabel("ErrorMessage");
		lblErrormessage.setBounds(10, 177, 100, 14);
		contentPane.add(lblErrormessage);
	}
}
