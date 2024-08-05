package com.model;

public class Box {
	private int width;
	private int height;
	private int depth;

	public Box() {

	}

	public Box(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

	public int getDepth() {
		return this.depth;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int calculateArea() {
		return this.width * this.height * this.depth;
	}
}