package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.5);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.setPenRadius(0.08);
		StdDraw.line(0.5, 0.5, 0, 1);
		StdDraw.line(0.5, 0.5, 1, 0);
		
		
	}
}