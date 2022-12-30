/*
 * Copyright 2023-present Arpan Mukhopadhyay. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.java.mini.games.tank.inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.java.mini.games.tank.GamePanel;

/**
 * @author Arpan Mukhopadhyay
 *
 */
public class KeyboardInputs implements KeyListener {

	private final GamePanel gamePanel;

	/**
	 * 
	 * @param gamePanel
	 */
	public KeyboardInputs(final GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W:
		case KeyEvent.VK_UP:
		case KeyEvent.VK_KP_UP: {
			goUp();
			break;
		}
		case KeyEvent.VK_S:
		case KeyEvent.VK_DOWN:
		case KeyEvent.VK_KP_DOWN: {
			goDown();
			break;
		}
		case KeyEvent.VK_A:
		case KeyEvent.VK_LEFT:
		case KeyEvent.VK_KP_LEFT: {
			goLeft();
			break;
		}
		case KeyEvent.VK_D:
		case KeyEvent.VK_RIGHT:
		case KeyEvent.VK_KP_RIGHT: {
			goRight();
			break;
		}
		default:
			// Do nothing.
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
	
	/**
	 * 
	 */
	private void goUp() {

	}

	/**
	 * 
	 */
	private void goDown() {

	}

	/**
	 * 
	 */
	private void goLeft() {

	}

	/**
	 * 
	 */
	private void goRight() {

	}

}
