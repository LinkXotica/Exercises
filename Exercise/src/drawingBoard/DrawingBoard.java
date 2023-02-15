package drawingBoard;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import noApplet.NoApplet;

@SuppressWarnings("serial")
public class DrawingBoard extends NoApplet{
	
	public DrawingBoard() {
		
	}

	public DrawingBoard(String [] args) {
		super(args);
	}
	
	@Override
	public void init() {
		
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		
		Dimension d = getSize();
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, d.width, d.height);
		
		Shape s = new Circle(50, 200, Color.RED);
		s.drawShape(g);

		
	}
	
	public static void main(String[] args) {
		new DrawingBoard(new String[] {"width=350", "height=350"}).run();
	}
	
}
