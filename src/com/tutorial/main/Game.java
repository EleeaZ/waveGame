package com.tutorial.main;

import java.awt.Canvas;

public class Game extends Canvas implements Runnable{
	
	public static final int WIDTH = 640;
	public static final int HEIGHT = WIDTH/ 12 * 9;
	
	public Game() {
		new Window(WIDTH, HEIGHT, "The game", this);
	}
	
	public static void main(String args[]) {
		
		new Game();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	public synchronized void start() {
		// TODO Auto-generated method stub
		
	}

}
