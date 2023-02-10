package solarSystem;

import java.awt.Color;
import java.awt.Graphics;


import noApplet.AnimationNoApplet;

@SuppressWarnings("serial")
public class Sun extends AnimationNoApplet {
	
	
	private int i;
	private int size;
	private int [] position = new int[2];
	private int [] center = new int[2];
	//private List<Planet> planets = new ArrayList<>();
	//private Planet mars = new Planet();
	//private Planet mercury = new Planet();
	private Planet earth = new Planet(20, 200, center, 10);
	//private Planet [] pNames = {mars, mercury, earth};
	
	public Sun() {
		
	}
	
	public Sun(String[] args) {
		super(args);
	}
	
	public Sun(int size, int positionX, int positionY, int speed, int planetAmount, String[] args) {
		super(args);
		this.size = size;
		this.position[0] = positionX - (Math.round(size/2));
		this.position[1] = positionY - (Math.round(size/2));
		this.center[0] = positionX; 
		this.center[1] = positionY;
		
	}
	
	@Override
	protected void initAnimation() {
		
		i = 1;
		
	}
	

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		
		int [] earthCenter = earth.newPosition(i);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, dim.width, dim.height);
		
		g.setColor(Color.YELLOW);
		g.fillOval(position[0], position[1], size, size);
		
		g.setColor(Color.BLUE);
		g.fillOval(earthCenter[0] - (Math.round(earth.getSize()/2)), earthCenter[1] - (Math.round(earth.getSize()/2)), earth.getSize(), earth.getSize());
		
		i++;
	}
	
	public static void main(String[] args) {
		Sun sun = new Sun(50, 250, 250, 10, 3, new String[] {"width=500", "height=500"});
		sun.run();
		
	}
	
	
	
}
