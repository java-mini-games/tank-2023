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

import java.awt.Graphics;
import java.io.Serial;

import javax.swing.JPanel;

import org.java.mini.games.tank.inputs.KeyboardInputs;
import org.java.mini.games.tank.inputs.MouseInputs;

/**
 * @author Arpan Mukhopadhyay
 *
 */
public class GamePanel extends JPanel {

	@Serial
	private static final long serialVersionUID = 7512828271493798090L;

	private final KeyboardInputs keyboardInputs;
	private final MouseInputs mouseInputs;

	/**
	 * 
	 */
	public GamePanel() {
		mouseInputs = new MouseInputs(this);
		keyboardInputs = new KeyboardInputs(this);
		
		addKeyListener(keyboardInputs);
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
}
