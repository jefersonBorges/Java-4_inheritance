package draw_panel;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel41b extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		int r = 20;
		int i = 0;
		
		while(i<=height) {
			
			i+=(height/r);
			
			//canto superior esquerdo para canto inferior direito
			x1 = 0;
			y1 = i;
			x2 = i;
			y2 = height;
			g.drawLine(x1, y1, x2, y2);
			
			//canto superior direito para canto inferior esquerdo
			x1 = height-i;
			y1 = 0;
			x2 = 0;
			y2 = i;
			g.drawLine(x1, y1, x2, y2);
			
			//canto inferior direito para canto superior esquerdo
			x1 = width;
			y1 = height-i;
			x2 = width-i;
			y2 = 0;
			g.drawLine(x1, y1, x2, y2);
			
			
			//canto inferior esquerdo para canto superior direito
			x1 = i;
			y1 = height;
			x2 = width;
			y2 = height-i;
			g.drawLine(x1, y1, x2, y2);
			
		}
		
	}

}
