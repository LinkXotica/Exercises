package solarSystem;

public class CelestialBody {
	private int size;
	private int [] center = new int[2];
	private int speed;
	
	public CelestialBody() {
		
	}
	
	public CelestialBody(int size, int positionX, int positionY, int speed) {
		this.size = size;
		this.center[0] = positionX + (Math.round(size/2));
		this.center[1] = positionY + (Math.round(size/2));
		this.speed = speed;
	}

}
