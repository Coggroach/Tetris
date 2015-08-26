package com.coggroach.tetris;

import processing.core.PApplet;
import processing.core.PVector;

public class Board implements IDrawable
{
	private static int WIDTH = 10;
	private static int HEIGHT = 18;

	private Colour[] board;
	private int length;
	private PVector pos;

	public Board(PApplet g)
	{
		this.board = new Colour[WIDTH * HEIGHT];
		this.init(g);
	}

	private void init(PApplet g)
	{
		this.length = 50;
		this.pos = new PVector();
		for (int i = 0; i < this.board.length; i++)
		{
			this.board[i] = Colour.white;
		}
	}

	@Override
	public void draw(PApplet g)
	{
		PVector pos = new PVector(this.pos.x, this.pos.y);
		for (int i = 0; i < HEIGHT; i++)
		{
			for (int j = 0; j < WIDTH; j++)
			{
				g.stroke(0);
				Colour c = this.board[j + i * WIDTH];
				g.fill(c.R, c.G, c.B, c.A);
				g.rect(pos.x, pos.y, this.length, this.length);
				pos.x += this.length;
			}
			pos.x = 0;
			pos.y += this.length;
		}
	}

	@Override
	public void update(PApplet g)
	{
		PVector pos = new PVector(this.pos.x, this.pos.y);
		for (int i = 0; i < HEIGHT; i++)
		{
			for (int j = 0; j < WIDTH; j++)
			{

				if (g.mouseX >= pos.x && g.mouseX < pos.x + this.length
						&& g.mouseY >= pos.y && g.mouseY < pos.y + this.length)
					this.board[j + i * WIDTH] =
							g.mouseButton == PApplet.LEFT ? Colour.green
									: Colour.white;

				pos.x += this.length;
			}
			pos.x = 0;
			pos.y += this.length;
		}
	}
}
