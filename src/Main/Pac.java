package Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Pac implements ActionListener, KeyListener {

	public static Pac pac;
	public Renderer renderer;
	public int width = 700, height = 700;
	public Sprite player;
	public Wall wall1,wall2;
	public boolean w,s,d,a,up,down;

	public Pac(){
		
		Timer timer = new Timer(20,this);
		
		JFrame frame = new JFrame("Pac");
		renderer = new Renderer();

		frame.setSize(width + 15, height + 35);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(renderer);
		frame.addKeyListener(this);
		
		timer.start();
		
	}

	private void init () {
		player = new Sprite(pac);
		wall1 = new Wall(10, 100, 200);
		wall2 = new Wall(20,200,200);
	}
	
	
	public void render(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setColor(Color.black);
		g.fillRect(0, 0, width, height);
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		player.render(g);
		wall1.render(g);
		wall2.render(g);
	
	}
	
	public void update(){
		
		if (w){
			player.move(true);
		}
		
		if (s){
			player.move(false);
		}
		if (d){
			player.moveRight(false);
		}
		
		if (a){
			player.moveRight(true);
		}
		
		
	}
	
	

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int id = e.getKeyCode();
		
		if (id == KeyEvent.VK_W){
			w= true;
		}
		
		if (id == KeyEvent.VK_S){
			s= true;
		}
		
		if (id == KeyEvent.VK_D){
			d= true;
		}
		if (id == KeyEvent.VK_A){
			a= true;
		}
		
}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int id = e.getKeyCode();
				
				if (id == KeyEvent.VK_W){
					w= false;
				}
				
				if (id == KeyEvent.VK_S){
					s= false;
				}
				
				if (id == KeyEvent.VK_D){
					d= false;
				}
				if (id == KeyEvent.VK_A){
					a= false;
				}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		update();
		renderer.repaint();
		
	}
	
	public static void main (String[] args){
		pac = new Pac();
		pac.init();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
