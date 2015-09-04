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
		this.size(Constants.BOARD_PIXEL_WIDTH, Constants.BOARD_PIXEL_HEIGHT);
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
			((Board) this.board).left();
		if(this.keyCode == PConstants.RIGHT)
			((Board) this.board).right();
		if(this.keyCode == PConstants.DOWN)
			((Board) this.board).down();
		if(this.keyCode == PConstants.UP)
			((Board) this.board).rotate();
	}
	
	private boolean canUpdate()
	{
		boolean flag =  this.counter >= Constants.BLOCK_SPAWN_FRAME;
		if(flag)
			this.counter = 0;
		
		return flag;		
	}
}
