package Main;

import java.awt.*;

public class Wall {
	
	static int x;
	static int y;
	int length;
	
	Wall(int x, int y, int length){
		
		this.x = x;
		this.y = y;
		this.length = length;

	}
	
	public void render(Graphics2D g){
		
		g.setColor(Color.white);
		g.fillRect(x, y, 5, length);
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
	}
	

}
