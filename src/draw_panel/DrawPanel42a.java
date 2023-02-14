package draw_panel;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel42a extends JPanel {
	

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		
		//int width = getWidth();
		int height = getHeight();
		
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		
		int i = 0;
		
		while(i<=height) {
			
			i+=(height/20);
			
			//origem no canto superior esquerdo
			x1 = 0;
			y1 = 0;
			x2 = i;
			y2 = height-i;
			g.drawLine(x1, y1, x2, y2);
			
		}
		
	}

}
