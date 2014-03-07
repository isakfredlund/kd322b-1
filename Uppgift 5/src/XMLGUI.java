import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.File;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

/**
1.1 name
1.2 women

2.1 3
2.2 Mittuniversitetet och Blekinge Tekniska Högskola

@author CWS
*/

public class XMLGUI extends JFrame {

	private JPanel contentPane;
	private JTextArea txtrTheNameOf;
	private JComboBox comboBox;
	
	private ArrayList<Program> programsList = new ArrayList<Program>();
	
	private static Document doc = openXmlFile("ht2013_antagning.xml");
		
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

	private ArrayList<Program> loadAllPrograms() {
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
	
	public ArrayList<Program> getProgramsList(){
		programsList = loadAllPrograms();
		return programsList;
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
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public XMLGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 226);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtrTheNameOf = new JTextArea();
		txtrTheNameOf.setText("The name of the root element is " + doc.getDocumentElement().getNodeName() + "\r\n\r\n" + "The number of programs is " + loadAllPrograms().size());
		txtrTheNameOf.setBounds(0, 0, 346, 70);
		contentPane.add(txtrTheNameOf);
		
		comboBox = new JComboBox();
		comboBox.setBounds(0, 81, 346, 20);
		comboBox.setModel(new DefaultComboBoxModel(getProgramsList().toArray()));
		contentPane.add(comboBox);
	}
}
