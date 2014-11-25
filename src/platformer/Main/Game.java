package platformer.Main;

import javax.swing.JFrame;

public class Game extends JFrame {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Platformer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setContentPane(new GamePanel());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setTitle("Platformer");
		
	}
	
}
