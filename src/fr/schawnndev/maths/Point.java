package fr.schawnndev.maths;

public class Point {

	private int x;
	private int y;
	private String name;

	public Point() {
		this("A");
	}

	public Point(String name) {
		this(name, 0, 0);
	}

	public Point(String name, int x, int y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public Point setX(int x) {
		this.x = x;
		return this;
	}

	public int getY() {
		return y;
	}

	public Point setY(int y) {
		this.y = y;
		return this;
	}

	public String getName() {
		return name;
	}

	public Point setName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public String toString() {
		return "[name=" + name + ",x=" + x + ",y=" + y + "]";
	}

}
