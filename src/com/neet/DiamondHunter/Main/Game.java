

/**
 * The game program implements an application that   
 * allows players to enter the GamePanel and play the game.
 * The entry point of the game.
 * This class loads up a JFrame window and
 * puts a GamePanel into it.
 * 
 * @author Naim Rais
 * @version 1.0
 * @since 2016-11-01
 */

package com.neet.DiamondHunter.Main;
import javax.swing.JFrame;

public class Game {
	
	/**
	 * @param args Unused
	 *
	 */
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Diamond Hunter");
		window.add(new GamePanel());
		window.setResizable(false);
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
