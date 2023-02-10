package solarSystem;

import java.awt.Color;
import java.awt.Graphics;
import java.util.*;

import noApplet.AnimationNoApplet;

@SuppressWarnings("serial")
public class Sun extends AnimationNoApplet {
	
	
	
	private int size;
	private int [] position = new int[2];
	private int [] center = new int[2];
	private int speed;
	private List<Planet> planets = new ArrayList<>();
	private Planet mars = new Planet();
	private Planet mercury = new Planet();
	private Planet earth = new Planet();
	private Planet [] pNames = {mars, mercury, earth};
	
	public Sun() {
		
	}
	
	public Sun(String[] args) {
		super(args);
	}
	
	public Sun(int size, int positionX, int positionY, int speed, int planetAmount, String[] args) {
		this.size = size;
		this.position[0] = positionX - (Math.round(size/2));
		this.position[1] = positionY - (Math.round(size/2));
		this.center[0] = positionX; 
		this.center[1] = positionY;
		this.speed = speed;
		for(int i = 0; i < planetAmount; i++) {
			planets.add(pNames[i]);
		}
	}
	
	@Override
	protected void initAnimation() {
		
	}
	

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.YELLOW);
		g.fillOval(position[0], position[1], size, size);
		
	}
	
	public static void main(String[] args) {
		Sun sun = new Sun(50, 100, 100, 10, 3, new String[] {"width=200", "height=200"});
		sun.run();
		
	}
	
	
	
}
