package com.coggroach.tetris.blocks;

import processing.core.PApplet;
import processing.core.PVector;

import com.coggroach.tetris.Colour;
import com.coggroach.tetris.Constants;
import com.coggroach.tetris.Direction;
import com.coggroach.tetris.IDrawable;
import com.coggroach.tetris.IMovable;

public class Block implements IDrawable, IMovable
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
		this.direction = Direction.getNextDirection(this.direction);
		this.type.rotate();
	}

	@Override
	public void draw(PApplet g)
	{
		g.stroke(0);
		Colour.fill(g, this.type.getColour());
		g.rect(this.position.x, this.position.y, Constants.BLOCK_LENGTH,
				Constants.BLOCK_LENGTH);
		for (PVector offset : this.type.getOffsets())
		{
			g.rect(this.position.x + Constants.BLOCK_LENGTH * offset.x,
					this.position.y + Constants.BLOCK_LENGTH * offset.y,
					Constants.BLOCK_LENGTH, Constants.BLOCK_LENGTH);
		}
	}

	@Override
	public void update(PApplet g)
	{

	}

	@Override
	public void update()
	{
		if (!this.hasCollided())
			this.position.y += Constants.BLOCK_LENGTH;
	}

	public boolean hasCollided()
	{
		return (this.position.y >= Constants.BOARD_PIXEL_HEIGHT);
	}

	@Override
	public void right()
	{
		if (this.position.x < Constants.BOARD_PIXEL_WIDTH)
			this.position.x += Constants.BLOCK_LENGTH;
	}

	@Override
	public void left()
	{
		if (this.position.x > 0)
			this.position.x -= Constants.BLOCK_LENGTH;
	}

	@Override
	public void down()
	{
		if (!this.hasCollided())
			this.position.y += Constants.BLOCK_LENGTH;
	}

	@Override
	public void up()
	{
		if(this.position.y > 0)
			this.position.y -= Constants.BLOCK_LENGTH;
	}

	@Override
	public boolean contains(PVector point)
	{
		if (point.x >= this.position.x
				&& point.x < this.position.x + Constants.BLOCK_LENGTH
				&& point.y >= this.position.y
				&& point.y < this.position.y + Constants.BLOCK_LENGTH)
			return true;

		PVector[] offsets = this.type.getOffsets();

		for (int i = 0; i < offsets.length; i++)
		{
			if (point.x >= this.position.x + offsets[i].x
					&& point.x < this.position.x + offsets[i].x + Constants.BLOCK_LENGTH
					&& point.y >= this.position.y + offsets[i].y
					&& point.y < this.position.y + offsets[i].y + Constants.BLOCK_LENGTH)
				return true;
		}
		return false;
	}
}
