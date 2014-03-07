import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGUI extends JFrame {

	private Calculator calc;
	private JTextField textField_1;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 266, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		calc = new Calculator();
		
		JButton button_16 = new JButton("0");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(0);
				textField_1.setText("0");
			}
		});
		contentPane.setLayout(null);
		button_16.setBounds(16, 10, 39, 23);
		contentPane.add(button_16);
		
		textField_1 = new JTextField();
		textField_1.setBounds(60, 11, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button_17 = new JButton("1");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(1);
				textField_1.setText("1");
			}
		});
		button_17.setBounds(151, 10, 39, 23);
		contentPane.add(button_17);
		
		JButton button_18 = new JButton("2");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(2);
				textField_1.setText("2");
			}
		});
		button_18.setBounds(195, 10, 39, 23);
		contentPane.add(button_18);
		
		JButton button_19 = new JButton("3");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(3);
				textField_1.setText("3");
			}
		});
		button_19.setBounds(17, 38, 39, 23);
		contentPane.add(button_19);
		
		JButton button_20 = new JButton("4");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(4);
				textField_1.setText("4");
			}
		});
		button_20.setBounds(61, 38, 39, 23);
		contentPane.add(button_20);
		
		JButton button_21 = new JButton("5");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(5);
				textField_1.setText("5");
			}
		});
		button_21.setBounds(105, 38, 39, 23);
		contentPane.add(button_21);
		
		JButton button_22 = new JButton("6");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(6);
				textField_1.setText("6");
			}
		});
		button_22.setBounds(149, 38, 39, 23);
		contentPane.add(button_22);
		
		JButton button_23 = new JButton("7");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(7);
				textField_1.setText("7");
			}
		});
		button_23.setBounds(193, 38, 39, 23);
		contentPane.add(button_23);
		
		JButton button_24 = new JButton("8");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(8);
				textField_1.setText("8");
			}
		});
		button_24.setBounds(17, 66, 39, 23);
		contentPane.add(button_24);
		
		JButton button_25 = new JButton("9");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(9);
				textField_1.setText("9");
			}
		});
		button_25.setBounds(61, 66, 39, 23);
		contentPane.add(button_25);
		
		JButton button_26 = new JButton("-");
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperator();
				calc.minus();
				textField_1.setText("-");
			}
		});
		button_26.setBounds(105, 66, 37, 23);
		contentPane.add(button_26);
		
		JButton button_27 = new JButton("+");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperator();
				calc.plus();
				textField_1.setText("+");			
			}
		});
		button_27.setBounds(147, 66, 41, 23);
		contentPane.add(button_27);
		
		JButton button_28 = new JButton("*\r\n");
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperator();
				calc.mult();
				textField_1.setText("*");
			}
		});
		button_28.setBounds(193, 66, 39, 23);
		contentPane.add(button_28);
		
		JButton button_29 = new JButton("=");
		button_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperator();
				calc.equals();
				int i = calc.getResult();
				textField_1.setText(String.valueOf(i));
			}
		});
		button_29.setBounds(104, 94, 41, 23);
		contentPane.add(button_29);
		
		JButton btnCe = new JButton("CE\r\n");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			calc.clear();
			}
		});
		btnCe.setBounds(167, 100, 67, 33);
		contentPane.add(btnCe);
		textField_1.setColumns(10);

	}
}
