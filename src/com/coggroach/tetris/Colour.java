package com.coggroach.tetris;

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
	public static Colour green = new Colour(0, 255, 0, 255);
	public static Colour blue = new Colour(0, 0, 255, 255);
	public static Colour red = new Colour(255, 0, 0, 255);
}
