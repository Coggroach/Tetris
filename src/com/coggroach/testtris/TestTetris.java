package com.coggroach.testtris;

import java.util.ArrayList;
import java.util.List;

import processing.core.PApplet;
import processing.core.PVector;

import com.coggroach.tetris.Direction;
import com.coggroach.tetris.IDrawable;
import com.coggroach.tetris.blocks.Block;
import com.coggroach.tetris.blocks.Blocks;

public class TestTetris extends PApplet
{
	private static final long serialVersionUID = 1L;	
	
	private List<IDrawable> blocks;
	
	@Override
	public void setup()
	{
		this.size(this.displayWidth, this.displayHeight);
		this.frameRate(60);	
		this.blocks = new ArrayList<IDrawable>();
		
		this.blocks.add(new Block(new PVector(50,50), Direction.NORTH, Blocks.iBlock));
		this.blocks.add(new Block(new PVector(150,50), Direction.NORTH, Blocks.jBlock));
		this.blocks.add(new Block(new PVector(150,150), Direction.NORTH, Blocks.lBlock));
		this.blocks.add(new Block(new PVector(250,150), Direction.NORTH, Blocks.oBlock));
		this.blocks.add(new Block(new PVector(250,250), Direction.NORTH, Blocks.sBlock));
		this.blocks.add(new Block(new PVector(350,250), Direction.NORTH, Blocks.tBlock));
		this.blocks.add(new Block(new PVector(350,350), Direction.NORTH, Blocks.zBlock));		
	}
	
	@Override
	public void draw()
	{	
		this.background(255);
		for(IDrawable d : blocks)
			d.draw(this);
	}
	
	@Override
	public void mousePressed()
	{
		
	}
	
	@Override
	public void mouseDragged()
	{
		
	}
}
