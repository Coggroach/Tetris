package com.coggroach.tetris.blocks;

import java.util.Random;

import processing.core.PVector;

import com.coggroach.tetris.Colour;

public class Blocks
{
	public static BlockType iBlock;
	public static BlockType jBlock;
	public static BlockType lBlock;
	public static BlockType oBlock;
	public static BlockType sBlock;
	public static BlockType tBlock;
	public static BlockType zBlock;
	
	private static Random random;

	static
	{
		iBlock = new BlockType(Colour.cyan, new PVector[]
		{ new PVector(1, 0), new PVector(2, 0), new PVector(3, 0) });

		jBlock = new BlockType(Colour.blue, new PVector[]
		{ new PVector(1, 0), new PVector(2, 0), new PVector(0, 1) });
		
		lBlock = new BlockType(Colour.orange, new PVector[]
		{ new PVector(1, 0), new PVector(2, 0), new PVector(0, -1) });
		
		oBlock = new BlockType(Colour.yellow, new PVector[]
		{ new PVector(1, 0), new PVector(1, 1), new PVector(0, 1) });
		
		sBlock = new BlockType(Colour.green, new PVector[]
		{ new PVector(-1, 0), new PVector(0, 1), new PVector(1, 1) });
		
		tBlock = new BlockType(Colour.purple, new PVector[]
		{ new PVector(-1, 0), new PVector(1, 0), new PVector(0, 1) });
		
		zBlock = new BlockType(Colour.red, new PVector[]
		{ new PVector(-1, 0), new PVector(0, -1), new PVector(1, -1) });
		
		random = new Random();
	}	
	
	public static BlockType getRandomBlockType()
	{
		int i = random.nextInt(7);
		switch(i)
		{
			case 0:
				return iBlock;
			case 1:
				return jBlock;
			case 2:
				return lBlock;
			case 3:
				return oBlock;
			case 4:
				return sBlock;
			case 5:
				return tBlock;
			case 6:
				return zBlock;			
		}
		return null;
	}
}
