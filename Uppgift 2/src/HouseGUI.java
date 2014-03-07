import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class HouseGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		
        House house0 = new House(1997,102);
        House house1 = new House(1998,200);
        House house2 = new House(1999,85);
       
        House houseArray[] = new House[10];
        houseArray[0] = house0;
        houseArray[1] = house1;
        houseArray[2] = house2;
       
        int houses = House.getNbrHouses();
       
        String houseNameArray[] = new String[houses];
       
        for(int i = 0; i < houses; i++){
                houseNameArray[i] = new String("Byggnadsår: " + houseArray[i].getYear() + ". Storlek: " + houseArray[i].getSize() + " kvm");
		table.setShowGrid(false);
		table.setShowHorizontalLines(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
					{houseNameArray[0]},
                    {houseNameArray[1]},
                    {houseNameArray[2]},
                    {"Totalt: " + houses + " hus"},
			},
			new String[] {
				"Hus"
			}
		));
		table.setBounds(60, 31, 300, 200);
		contentPane.add(table);
		
		
	}
	}
}
