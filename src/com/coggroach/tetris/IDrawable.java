package com.coggroach.tetris;

import processing.core.PApplet;

public interface IDrawable
{
	public void draw(PApplet g);
	public void update(PApplet g);
	public void update();
}
