package draw_panel;

import javax.swing.JFrame;

public class DrawPanelTest41a {
	
	public static void main(String[]args) {
		DrawPanel41a panel = new DrawPanel41a();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);
		application.setSize(500, 500);
		application.setVisible(true);
	}
}
