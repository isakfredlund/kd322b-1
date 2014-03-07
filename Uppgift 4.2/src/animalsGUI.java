import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;


public class animalsGUI extends JFrame {

	private JPanel contentPane;
	private JTextArea txtrJgiHjhb;
	
	private ArrayList<Animal> animalList = new ArrayList<Animal>();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					animalsGUI frame = new animalsGUI();
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
	public animalsGUI() {
		
		animalList.add(new Cat(true, 322, 9));
		animalList.add(new Dog(true, 8685, true));
		animalList.add(new Snake(true, false));
		animalList.add(new Snake(true, true));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtrJgiHjhb = new JTextArea();
				for (int i = 0; i < animalList.size(); i++){
					txtrJgiHjhb.append(animalList.get(i).getInfo() + "\n");
				}
		txtrJgiHjhb.setBounds(0, 0, 434, 262);
		contentPane.add(txtrJgiHjhb);
	}
}
