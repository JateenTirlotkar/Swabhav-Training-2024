package com.model;

public class ConstructorChaining {
	private int width;
	private int height;
	private int depth;
	public ConstructorChaining(int width, int height) {
		
		this();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public ConstructorChaining()
	{
		this.width=10;
		this.depth=10;
		this.height=10;
	}

}
