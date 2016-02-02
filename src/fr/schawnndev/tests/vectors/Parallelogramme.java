package fr.schawnndev.tests.vectors;

import fr.schawnndev.maths.Point;
import fr.schawnndev.maths.Vector2D;
import fr.schawnndev.tests.ITest;

public class Parallelogramme implements ITest {

	@Override
	public void test(boolean debug) {
		Point a = new Point("A", 2, -1);
		Point b = new Point("B", 3, 4);
		Point c = new Point("C", -5, 1);
		Point d = new Point("D");

		d.setX(c.getX() - b.getX() + a.getX());
		d.setY(c.getY() - b.getY() + a.getY());

		if (debug) {
			System.out.println(d.toString());
			System.out.println(c.toString());
		}

		Vector2D ab = new Vector2D(a, b);
		Vector2D dc = new Vector2D(d, c);

		if (debug) {
			System.out.println("ab= " + ab.toString());
			System.out.println("dc= " + dc.toString());
		}

		if (ab.equals(dc))
			System.out.println("C'est un parallèlogramme");
		else
			System.out.println("Ce n'est pas un parallèlogramme");

	}

}
