package Main;

import java.awt.*;

public class Sprite {

	public int x, y, width = 25, height = 25;
	public int speed = 15;
	
	public Sprite(Pac pac){
		this.x = pac.height/2;
		this.y = pac.width/2;
	}

	public void render(Graphics g){
		g.setColor(Color.white);
		g.fillOval(x, y, height, width);
	}
	
	public void move (boolean up){
		
		if (up) {

			if ((y  - speed) > 0) {

				y-= speed;
				colision(this);
				System.out.print("y: " + y + " Height : " + height +  " Speed : " + speed + " pac.pac.height " + Pac.pac.height + "\n");
			} else {

				y = 0;
			}

		} else {

			if ((y + height +speed) < Pac.pac.height) {

				y+= speed;
				colision(this);
				System.out.print("y: " + y + " Height : " + height +  " Speed : " + speed + " Pong.pong.height " + Pac.pac.height + "\n");
			} else {

				y = Pac.pac.height - height;
			}

		}
		
	}
	
public void moveRight (boolean right){
		
		int speed = 15;
		
		if (right) {

			if ((x  - speed) > 0) {

				x-= speed;
				//System.out.print("y: " + y + " Height : " + height +  " Speed : " + speed + " Pong.pong.height " + Pong.pong.height + "\n");
				colision(this);
			} else {

				x = 0;
			}

		} else {

			if ((x + width +speed) < Pac.pac.width) {

				x+= speed;
				colision(this);
				//System.out.print("y: " + y + " Height : " + height +  " Speed : " + speed + " Pong.pong.height " + Pong.pong.height + "\n");
			} else {

				x = Pac.pac.width - width;
			}

		}
	}

	public void colision(Sprite sprite){
	
	if (sprite.x == Wall.x || sprite.y == Wall.y){
		
		System.out.println("Hello");
		this.x = this.x + 5;
		this.y = this.y + 5;
		
	}	
}
}
