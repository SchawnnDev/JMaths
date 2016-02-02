package fr.schawnndev.maths;

public class Vector2D {

	private int x;
	private int y;

	public Vector2D() {
		this(0, 0);
	}

	public Vector2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Vector2D(Point a, Point b) {
		this(b.getX() - a.getX(), b.getY() - a.getY());
	}

	public Vector2D multiply(int m) {
		x *= m;
		y *= m;
		return this;
	}

	public Vector2D add(Vector2D vector) {
		add(vector.getX(), vector.getY());
		return this;
	}

	public Vector2D add(int x, int y) {
		this.x += x;
		this.y += y;
		return this;
	}

	public Vector2D subtract(Vector2D vector) {
		subtract(vector.getX(), vector.getY());
		return this;
	}

	public Vector2D subtract(int x, int y) {
		this.x += -x;
		this.y += -y;
		return this;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public Vector2D setX(int x) {
		this.x = x;
		return this;
	}

	public Vector2D setY(int y) {
		this.y = y;
		return this;
	}

	public int getLength() {
		return (int) Math.sqrt(x * x + y * y);
	}

	public boolean equals(Vector2D vector) {
		return vector.getX() == x && vector.getY() == y;
	}

	@Override
	public String toString() {
		return "[x=" + x + ",y=" + y + ",length=" + getLength() + "]";
	}

}
