package main;

public class Game 
{
	private GameWindow gameWindow;
	private GamePanel gamePanel;
	
	public Game()
	{
		// Create a new instance of the GamePanel
		gamePanel = new GamePanel();
		// Create a new GameWindow and pass the GamePanel instance
		gameWindow = new GameWindow(gamePanel);
		// Request keyboard focus for the GamePanel
		gamePanel.requestFocus();
	}
}
