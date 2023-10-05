package studio4;

import edu.princeton.cs.introcs.StdDraw;

public class Flag2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.5);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.setPenRadius(0.08);
		StdDraw.line(0.5, 0.5, 0, 1);
		StdDraw.line(0.5, 0.5, 1, 0);
		StdDraw.line(0.5, 0.5, 0,0);
		StdDraw.line(0.5, 0.5, 1, 1);
	}

}
