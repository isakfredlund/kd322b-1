import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Graphics;

public class Bargraph extends JComponent {

	int x1 = 0;
	int x2 = 20;
	private int women;
	private int men;
	private float total;
	private float percentage;
	
	private int updatevalues;

	int width = getWidth();
	int height = getHeight();

	public Bargraph(int women, int men){
		this.women = women;
		this.men = men;
	}
	

	public void updateValues(int women, int men){
		this.women = women;
		this.men = men;
		this.total = this.men + this.women;
		this.repaint();
		width = getWidth();
		height = getHeight();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		if(women >= 0) {
			float percentage = (women/total);
			float pixelValue1 = (int)(height*percentage);
			int bar = (int)(height - pixelValue1);
			
			g.setColor(Color.red);
			g.fillRect(155, bar+20, 50, (int)pixelValue1);
		}
		
		if (men>=0){
			float percentage = (men/total);
			float pixelValue2 = (int)(height*percentage);
			int bar = (int)(height - pixelValue2);
			
			g.setColor(Color.blue);;
			g.fillRect(205,  bar+20,  50,  (int)pixelValue2);
		}
	
		if (total>=0){
			g.setColor(Color.black);
			//writes number of applicants within the component
			//g.drawString("Totalt Antal Sökande:  " + total,  0,  20);
			
		}
		
		super.paintComponent(g);
		
	}
	
}
