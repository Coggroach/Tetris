package com.coggroach.tetris.blocks;

import processing.core.PVector;

import com.coggroach.tetris.Colour;

public class BlockType
{
	protected Colour colour;
	protected PVector[] offsets;	

	public BlockType(Colour c, PVector[] o)
	{
		this.colour = c;
		this.offsets = o;
	}
	
	public BlockType(BlockType bt)
	{
		this.colour = new Colour(bt.getColour());
		PVector[] offsets = bt.getOffsets();
		this.offsets = new PVector[offsets.length];
		for(int i = 0; i < offsets.length; i++)
		{
			this.offsets[i] = new PVector(offsets[i].x, offsets[i].y);
		}
	}

	public Colour getColour()
	{
		return colour;
	}

	public PVector[] getOffsets()
	{
		return offsets;
	}
	
	public void rotate()
	{
		for(PVector pos : this.offsets)
		{
			pos.rotate((float) (Math.PI/2));
		}
	}
}
