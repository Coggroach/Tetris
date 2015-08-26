package com.coggroach.tetris;

import processing.core.PApplet;
import processing.core.PVector;

public class Board implements IDrawable
{
	private static int WIDTH = 10;
	private static int HEIGHT = 18;	
	
	private int[] board;
	private int length;
	private PVector pos;
	
	public Board(PApplet g)
	{
		this.board = new int[WIDTH * HEIGHT];
		this.init(g);
	}
	
	private void init(PApplet g)
	{
		this.length = 25;
		this.pos = new PVector();
		for(int i = 0; i < this.board.length; i++)
		{
			this.board[i] = 255;
		}
	}

	@Override
	public void draw(PApplet g)
	{			
		PVector pos = new PVector(this.pos.x, this.pos.y);
		for(int i = 0; i < HEIGHT; i++)
		{
			for(int j = 0; j < WIDTH; j++)
			{
				g.stroke(0);
				g.fill(this.board[j + i * WIDTH]);
				g.rect(pos.x, pos.y, this.length, this.length);
				pos.x += this.length;
			}
			pos.x = 0;
			pos.y += this.length;
		}
	}
}
