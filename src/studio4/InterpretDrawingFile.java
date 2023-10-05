package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String n = in.next();
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		boolean l = in.nextBoolean();
		
		if(l = false ) {
			StdDraw.setPenRadius(0.05);
	        StdDraw.setPenColor(r, g, b);
			StdDraw.ellipse(x1, y1, x2, y2);
		}
		
	}
}
