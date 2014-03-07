import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

	public class XMLGUI extends JFrame {
		
		/**
		 * variables
		 */
		private Bargraph bargraph_1;
					
		private Document doc;
		
		private static final long serialVersionUID = 1L;
		
		private JPanel contentPane;
		
		private ArrayList<Program> programsList = new ArrayList<Program>(); 
		
		/**
		 * methods
		 */
		private ArrayList<Program> loadAllPrograms(){ 
			ArrayList<Program> output = new ArrayList<Program>(); 
			//Hämta alla program
			NodeList programs = doc.getElementsByTagName("Program");
			for (int i = 0; i < programs.getLength(); i++) {
				
				//Gör om varje nod i listan till ett element
				Node node = programs.item(i);
				Element elm = (Element) node;
				
				//Hämta data från elementet
				String name = elm.getElementsByTagName("name").item(0).getTextContent();
				String code = elm.getElementsByTagName("code").item(0).getTextContent();
				int women = Integer.parseInt(elm.getElementsByTagName("women").item(0).getTextContent());
				int men = Integer.parseInt(elm.getElementsByTagName("men").item(0).getTextContent());
			
				Program program = new Program(name, code, women, men);
				output.add(program);
			}
			return output;
		
		}
		
		private static Document openXmlFile(String fileName) {
			Document doc = null;
			try{
				File fXmlFile = new File(fileName);
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				doc = dBuilder.parse(fXmlFile);
				doc.getDocumentElement().normalize();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return doc;
		}

	public ArrayList<Program> getProgramsList(){
		programsList = loadAllPrograms();
		return programsList;
	}
	
	/**
	 * GUI
	 */
	public XMLGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setBounds(100,100,450,448); 
		contentPane = new JPanel(); 
		contentPane.setBorder(new EmptyBorder(5,5, 5,5)); 
		setContentPane(contentPane); 
		contentPane.setLayout(null);
		getContentPane().setLayout(null);
		
		/**
		 * variables
		 */
		doc = openXmlFile("ht2013_antagning.xml"); 
		
		Node n = doc.getDocumentElement(); 
		
		String root = n.getNodeName(); 
		
		programsList=loadAllPrograms();
		
		
		/**
		 * JComponents
		 */
		JLabel lblFrstaElementetrooten = new JLabel("Sökande Till Program På Svenska Högskolor HT-2013" /*+ root*/);
		lblFrstaElementetrooten.setBounds(10, 11, 414, 14);
		getContentPane().add(lblFrstaElementetrooten);
		
		JLabel lblAntalProgram = new JLabel("Antal Program: " + programsList.size());
		lblAntalProgram.setBounds(10, 36, 414, 14);
		getContentPane().add(lblAntalProgram);		

		bargraph_1 = new Bargraph(0, 0); 
		bargraph_1.setBounds(10, 143, 414, 256); 
		getContentPane().add(bargraph_1); 
		
		final JLabel lblNamn = new JLabel("Namn:");
		lblNamn.setBounds(10, 92, 142, 14);
		contentPane.add(lblNamn);
		
		final JLabel lblSkandeMn = new JLabel("S\u00F6kande M\u00E4n:");
		lblSkandeMn.setBounds(288, 385, 136, 14);
		contentPane.add(lblSkandeMn);
		
		final JLabel lblSkandeKvinnor = new JLabel("S\u00F6kande Kvinnor:");
		lblSkandeKvinnor.setBounds(10, 385, 180, 14);
		contentPane.add(lblSkandeKvinnor);

		final JLabel lblProgramkod = new JLabel("Programkod:");
		lblProgramkod.setBounds(10, 118, 414, 14);
		contentPane.add(lblProgramkod);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 61, 414, 20);
		getContentPane().add(comboBox);
		comboBox.addActionListener(new ActionListener(){ 
			
			@Override public void actionPerformed(ActionEvent graph){ 
			
			int index = comboBox.getSelectedIndex(); 
			Program prog = programsList.get(index); 
			bargraph_1.updateValues(prog.getWomen(),prog.getMen()); 

			lblNamn.setText("Namn: " + prog.getName());
			lblProgramkod.setText("Programkod: " + prog.getCode());
			lblSkandeMn.setText("Sökande Män: " + prog.getMen());
			lblSkandeKvinnor.setText("Sökande Kvinnor: " + prog.getWomen());
			}
		});
 
		comboBox.setModel(new DefaultComboBoxModel(programsList.toArray())); 
		
	} 	
	
	/**
	 * Launch the application. 
	 */ 
	
	public static void main(String[] args) { 
		EventQueue.invokeLater(new Runnable() { 
			public void run() {
				try { 
					XMLGUI frame = new XMLGUI();
					frame.setVisible(true); 
				}
				catch (Exception e) { 
					e.printStackTrace();
				}
			}
		}); 
	} 
}
