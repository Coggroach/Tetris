package com.coggroach.tetris;

import processing.core.PApplet;
import processing.core.PConstants;

public class Tetris extends PApplet
{
	private static final long serialVersionUID = 1L;

	private IDrawable board;
	private int counter;

	@Override
	public void setup()
	{
		this.size(800, 600);
		this.frameRate(60);
		this.board = new Board(this);
		this.counter = 0;
	}

	@Override
	public void draw()
	{
		this.background(0);
		this.board.draw(this);
		if(canUpdate())
			this.board.update();
		this.counter++;
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
	
	@Override
	public void keyPressed()
	{
		if(this.keyCode == PConstants.LEFT)
			((Board) this.board).moveLeft();
		if(this.keyCode == PConstants.RIGHT)
			((Board) this.board).moveRight();
	}
	
	private boolean canUpdate()
	{
		boolean flag =  this.counter >= Constants.BLOCK_SPAWN_FRAME;
		if(flag)
			this.counter = 0;
		
		return flag;		
	}
}
