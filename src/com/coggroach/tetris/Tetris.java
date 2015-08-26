package com.coggroach.tetris;

import processing.core.PApplet;

public class Tetris extends PApplet
{
	private static final long serialVersionUID = 1L;
	
	
	
	@Override
	public void setup()
	{
		this.size(800, 600);
		this.frameRate(30);		
	}
	
	@Override
	public void draw()
	{
		this.background(0);
		this.fill(150);
		this.stroke(250);
		this.rect(400, 200, 50, 50);
	}
}
