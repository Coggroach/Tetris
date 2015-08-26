package com.coggroach.tetris;

import processing.core.PApplet;

public class Tetris extends PApplet
{
	private static final long serialVersionUID = 1L;	
	
	private IDrawable board;
	
	@Override
	public void setup()
	{
		this.size(this.displayWidth, this.displayHeight);
		this.frameRate(60);	
		this.board = new Board(this);
	}
	
	@Override
	public void draw()
	{	
		this.background(0);
		this.board.draw(this);
	}
	
	@Override
	public void mousePressed()
	{
		this.board.update(this);
	}
	
	@Override
	public void mouseDragged()
	{
		this.board.update(this);
	}
}
