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
package org.java.mini.games.tank;

import javax.swing.JFrame;

/**
 * @author Arpan Mukhopadhyay
 *
 */
public class GameWindow {

	private final JFrame gameFrame;

	/**
	 * 
	 */
	public GameWindow(final GamePanel gamePanel) {
		gameFrame = new JFrame();
		gameFrame.add(gamePanel);
		initGameFrame();
	}

	/**
	 * 
	 */
	private void initGameFrame() {
		gameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		gameFrame.pack();
		gameFrame.setVisible(true);
	}
}
