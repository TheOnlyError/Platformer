package platformer.Main;

import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	// Dimensions
	public static final int WIDTH = 800;
	public static final int HEIGHT = 480;
	
	public GamePanel() {
		
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
	}
	
}
