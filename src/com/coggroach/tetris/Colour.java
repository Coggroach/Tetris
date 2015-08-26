package com.coggroach.tetris;

import processing.core.PApplet;

public class Colour
{
	public int R, G, B, A;
	
	public Colour(int r, int g, int b, int a)
	{
		this.R = r;
		this.G = g;
		this.B = b;
		this.A = a;
	}
	
	public static Colour white = new Colour(255, 255, 255, 255);
	
	public static Colour green = new Colour(174, 255, 162, 255);
	public static Colour blue = new Colour(90, 128, 253, 255);
	public static Colour red = new Colour(255, 143, 165, 255);
	
	public static Colour yellow = new Colour(255, 252, 179, 255);
	public static Colour orange = new Colour(255, 198, 172, 255);
	public static Colour purple = new Colour(247, 203, 255, 255);
	public static Colour cyan = new Colour(183, 255, 253, 255);

	public static Colour black = new Colour(0, 0, 0, 255);
	
	public static void fill(PApplet g, Colour c)
	{
		g.fill(c.R, c.G, c.B, c.A);
	}
	
	public static void stroke(PApplet g, Colour c)
	{
		g.stroke(c.R, c.G, c.B, c.A);
	}
}
