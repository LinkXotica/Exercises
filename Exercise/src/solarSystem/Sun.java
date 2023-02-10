package solarSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


import noApplet.AnimationNoApplet;

@SuppressWarnings("serial")
public class Sun extends AnimationNoApplet {
	
	
	private int i;
	private int size;
	private int [] position = new int[2];
	private int [] center = new int[2];
	//private List<Planet> planets = new ArrayList<>();
	private Planet mars = new Planet(10, 250, center, 4);
	private Planet mercury = new Planet(5, 100, center, 8);
	private Planet earth = new Planet(20, 200, center, 2);
	
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
		earth.setMoon(3, 20, 4);
		
		
		
	}
	

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		
		int [] earthCenter = earth.newPosition(i);
		int [] marsCenter  = mars.newPosition(i);
		int [] mercuryCenter = mercury.newPosition(i);
		
		int [] earthMoon = earth.getMoon().newPosition(i);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, dim.width, dim.height);
		
		g.setColor(Color.YELLOW);
		g.fillOval(position[0], position[1], size, size);
		
		g.setColor(Color.BLUE);
		g.fillOval(earthCenter[0] - (Math.round(earth.getSize()/2)), earthCenter[1] - (Math.round(earth.getSize()/2)), earth.getSize(), earth.getSize());

		g.setColor(Color.WHITE);
		g.fillOval(earthMoon[0] - (Math.round(earth.getMoon().getSize()/2)), earthMoon[1] - (Math.round(earth.getMoon().getSize()/2)), earth.getMoon().getSize(), earth.getMoon().getSize());
		
		g.setColor(Color.ORANGE);
		g.fillOval(marsCenter[0] - (Math.round(mars.getSize()/2)), marsCenter[1] - (Math.round(mars.getSize()/2)), mars.getSize(), mars.getSize());
		
		g.setColor(Color.RED);
		g.fillOval(mercuryCenter[0] - (Math.round(mercury.getSize()/2)), mercuryCenter[1] - (Math.round(mercury.getSize()/2)), mercury.getSize(), mercury.getSize());
		
		g.setFont(new Font("Dialog", 2, 30));
		g.drawString("Danilo Romero", dim.width - 250, dim.height - 50);
		
		
		i++;
	}
	
	public static void main(String[] args) {
		Sun sun = new Sun(50, 250, 250, 10, 3, new String[] {"width=500", "height=500"});
		sun.run();
		
	}
	
	
	
}
