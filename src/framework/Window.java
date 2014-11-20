package framework;

import javax.swing.JFrame;

public class Window extends JFrame {

	public static final int WIDTH = 720;
	public static final int HEIGHT = 480;

	private static final long serialVersionUID = 1L;

	public Window() {
		setTitle("Faggots");
		setSize(WIDTH, HEIGHT);
		setResizable(false);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
