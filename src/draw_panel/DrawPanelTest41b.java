package draw_panel;

import javax.swing.JFrame;

public class DrawPanelTest41b {
	
	public static void main(String[]args) {
		DrawPanel41b panel = new DrawPanel41b();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);
		application.setSize(500, 500);
		application.setVisible(true);
	}
}
