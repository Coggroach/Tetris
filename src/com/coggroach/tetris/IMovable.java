package com.coggroach.tetris;

import processing.core.PVector;

public interface IMovable
{
	public void right();
	public void left();
	public void rotate();
	public void down();
	public void up();
	public boolean contains(PVector point);
}
