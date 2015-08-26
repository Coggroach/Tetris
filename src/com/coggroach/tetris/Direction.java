package com.coggroach.tetris;

public enum Direction
{
	NORTH,
	SOUTH,
	EAST,
	WEST;
	
	public static Direction getNextDirection(Direction dir)
	{
		switch(dir)
		{
			case NORTH:
				return EAST;
			case EAST:
				return SOUTH;
			case SOUTH:
				return WEST;
			case WEST:
				return NORTH;				
		}
		return null;
	}
}
