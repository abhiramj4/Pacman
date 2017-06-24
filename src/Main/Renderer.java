package Main;

import java.awt.*;

import javax.swing.*;

public class Renderer extends JPanel {
	
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g){
		
		super.paintComponent(g);
		Pac.pac.render((Graphics2D) g);
	}
}
