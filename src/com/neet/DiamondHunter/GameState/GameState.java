/**
* <h1>Blueprint for all GameState subclasses.
* Has a reference to the GameStateManager
* along with the four methods that must
* be overridden.
* </h1>
 */

package com.neet.DiamondHunter.GameState;

import java.awt.Graphics2D;

public interface GameState {
	public abstract void init();
	public abstract void update();
	public abstract void draw(Graphics2D g);
	public abstract void handleInput();
}
