package com.coggroach.tetris;

import processing.core.PApplet;

public class Tetris extends PApplet
{
	private static final long serialVersionUID = 1L;	
	
	private IDrawable board;
	
	@Override
	public void setup()
	{
		this.size(800, 600);
		this.frameRate(30);	
		this.board = new Board(this);
	}
	
	@Override
	public void draw()
	{
		this.background(0);
		this.board.draw(this);
	}
}
