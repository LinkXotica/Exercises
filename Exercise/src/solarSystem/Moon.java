package solarSystem;

public class Moon {
	
	private int size;
	private int [] center = new int[2];
	private int [] position = new int[2];
	private int speed;
	private double orbitRadius;
	private int [] centerOrbit = new int[2];
	
	public Moon() {
		
	}
	
	public Moon(int size, int orbitRadius, int [] centerOrbit, int speed) {
		this.size = size;
		this.center[0] = centerOrbit[0] + orbitRadius;
		this.center[1] = centerOrbit[1];
		this.position[0] = center[0] - (Math.round(size/2));
		this.position[1] = center[1] - (Math.round(size/2));
		this.speed = speed;
		this.centerOrbit = centerOrbit;
		this.orbitRadius = orbitRadius;
	}
	
	public int [] newPosition(int timer) {
		
		double yCycle = Math.sin((timer * speed) * (Math.PI / 180));
		double xCycle = Math.cos((timer * speed) * (Math.PI / 180));
		
		this.center[0] = (int) (centerOrbit[0] + (int) (orbitRadius * xCycle));
		this.center[1] = (int) (centerOrbit[1] + (int) (orbitRadius * yCycle));
		
		
		return this.center;
	}
	
	public int getSize() {
		return this.size;
	}
	

}
