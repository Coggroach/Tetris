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

	public Colour getColour()
	{
		return colour;
	}

	public PVector[] getOffsets()
	{
		return offsets;
	}	
}
