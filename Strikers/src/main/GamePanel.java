package main;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import inputs.KeyboardInputs;
import inputs.MouseInputs;

public class GamePanel extends JPanel
{
	private MouseInputs mouseInputs; // Stores an instance of MouseInputs for handling mouse events
	private int xDelta = 100, yDelta = 100; // Initial position of the rectangle
	
	public GamePanel()
	{
		mouseInputs = new MouseInputs(this); // Initialize the MouseInputs instance with a reference to this GamePanel
		addKeyListener(new KeyboardInputs(this)); // Add a KeyListener instance to handle keyboard inputs for this GamePanel
		addMouseListener(mouseInputs); // Add the MouseInputs instance as a MouseListener to handle mouse click events
		addMouseMotionListener(mouseInputs); // Add the MouseInputs instance as a MouseMotionListener to handle mouse movement events
	}
	
	public void changeXDelta(int value)
	{
		this.xDelta += value; // Change the xDelta value by the specified value
		repaint(); // Request a repaint of the GamePanel to update the display
	}
	
	public void changeYDelta(int value)
	{
		this.yDelta += value; // Change the yDelta value by the specified value
		repaint(); // Request a repaint of the GamePanel to update the display
	}
	
	public void setRectPos(int x, int y)
	{
		this.xDelta = x; // Set the xDelta value to the specified x coordinate
		this.yDelta = y; // Set the yDelta value to the specified y coordinate
		repaint(); // Request a repaint of the GamePanel to update the display
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g); // Call the superclass's paintComponent method to ensure proper painting
		
		// Draw a filled rectangle at the specified position (xDelta, yDelta) with width 200 and height 50
		g.fillRect(xDelta, yDelta, 200, 50);
	}
}
