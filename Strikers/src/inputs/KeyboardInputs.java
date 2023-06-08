package inputs;

import java.awt.event.KeyListener;

import main.GamePanel;

import java.awt.event.KeyEvent;

public class KeyboardInputs implements KeyListener {
	
	private GamePanel gamePanel;
	
	public KeyboardInputs(GamePanel gamePanel)
	{
		this.gamePanel = gamePanel;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_W:
			// Change the yDelta value in the GamePanel to move up by 5 units
			gamePanel.changeYDelta(-5);
			break;
		case KeyEvent.VK_A:
			// Change the xDelta value in the GamePanel to move left by 5 units
			gamePanel.changeXDelta(-5);
			break;
		case KeyEvent.VK_S:
			// Change the yDelta value in the GamePanel to move down by 5 units
			gamePanel.changeYDelta(5);
			break;
		case KeyEvent.VK_D:
			// Change the xDelta value in the GamePanel to move right by 5 units
			gamePanel.changeXDelta(5);
			break;
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

}
