package draw_panel;

import javax.swing.JFrame;

public class DrawPanelTest42a {
	
	public static void main(String[]args) {
		DrawPanel42a panel = new DrawPanel42a();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);
		application.setSize(500, 500);
		application.setVisible(true);
	}
}
