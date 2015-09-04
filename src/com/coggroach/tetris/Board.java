package com.coggroach.tetris;

import java.util.ArrayList;
import java.util.List;

import com.coggroach.tetris.blocks.Block;
import com.coggroach.tetris.blocks.Blocks;

import processing.core.PApplet;
import processing.core.PVector;

public class Board implements IDrawable, IMovable
{
	private List<IDrawable> blocks;
	private IDrawable block;
	
	public Board(PApplet g)
	{
		this.blocks = new ArrayList<IDrawable>();
		this.block = null;
	}

	@Override
	public void draw(PApplet g)
	{
		Colour.stroke(g, Colour.black);
		Colour.fill(g, Colour.white);
				
		g.rect(0, 0, Constants.BOARD_PIXEL_WIDTH, Constants.BOARD_PIXEL_HEIGHT);
		for(IDrawable d : blocks)
			d.draw(g);
		if(this.block != null)
			this.block.draw(g);
	}

	@Override
	public void update(PApplet g)
	{
		// TODO Auto-generated method stub		
	}

	@Override
	public void update()
	{
		if(this.block == null)
			this.block = new Block(new PVector(Constants.BOARD_PIXEL_WIDTH/2, 0), Direction.NORTH, Blocks.getRandomBlockType());
		
		if(this.block != null)
			this.block.update();
		
		if(((Block) this.block).hasCollided())
		{
			this.blocks.add(block);
			this.block = null;
		}
	}

	@Override
	public void right()
	{
		if(this.block != null)
			((IMovable) this.block).right();		
	}

	@Override
	public void left()
	{
		if(this.block != null)
			((IMovable) this.block).left();
	}

	@Override
	public void rotate()
	{
		if(this.block != null)
			((IMovable) this.block).rotate();
	}

	@Override
	public void down()
	{
		if(this.block != null)
			((IMovable) this.block).down();
	}

	@Override
	public void up()
	{
		
	}

	@Override
	public boolean contains(PVector point)
	{
		return true;
	}
}
