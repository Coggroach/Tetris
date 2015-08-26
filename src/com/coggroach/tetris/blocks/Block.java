package com.coggroach.tetris.blocks;

import processing.core.PApplet;
import processing.core.PVector;

import com.coggroach.tetris.Colour;
import com.coggroach.tetris.Constants;
import com.coggroach.tetris.Direction;
import com.coggroach.tetris.IDrawable;

public class Block implements IDrawable
{
	protected PVector position;
	protected Direction direction;
	protected BlockType type;
	
	public Block(PVector p, Direction d, BlockType t)
	{
		this.position = p;
		this.direction = d;
		this.type = t;
	}	

	public void setDirection(Direction d)
	{
		this.direction = d;
	}

	public void setPosition(PVector p)
	{
		this.position = p;
	}
	
	public void rotate()
	{

	}

	@Override
	public void draw(PApplet g)
	{
		g.stroke(0);
		Colour.fill(g, this.type.getColour());
		g.rect(this.position.x, this.position.y, Constants.BLOCK_LENGTH, Constants.BLOCK_LENGTH);
		for (PVector offset : this.type.getOffsets())
		{
			g.rect(this.position.x + Constants.BLOCK_LENGTH * offset.x, this.position.y
					+ Constants.BLOCK_LENGTH * offset.y, Constants.BLOCK_LENGTH, Constants.BLOCK_LENGTH);
		}
	}

	@Override
	public void update(PApplet g)
	{
		
	}

	@Override
	public void update()
	{
		if(!this.hasCollided())
			this.position.y += Constants.BLOCK_LENGTH;
	}
	
	public void moveLeft()
	{
		if(this.position.x > 0)
			this.position.x -= Constants.BLOCK_LENGTH;
	}
	
	public void moveRight()
	{
		if(this.position.y < Constants.BOARD_PIXEL_WIDTH)
			this.position.x += Constants.BLOCK_LENGTH;
	}
	
	public boolean hasCollided()
	{
		return (this.position.y >= Constants.BOARD_PIXEL_HEIGHT);
	}
}
