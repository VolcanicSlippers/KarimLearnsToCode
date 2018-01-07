import java.awt.*;
import java.util.Arrays;

import javax.swing.JPanel;
import javax.swing.JFrame;

/**
 * This class draws Christmas trees of varying sizes
 * 
 * @author Abdikariim Timer
 * @version 3/01/2017
 */

public class Trees extends JPanel {

	private int[] xTrees;
	private int[] xCoord = { 7, 7, 2, 8, 14, 9, 9 };
	private int[] yTrees;
	private int[] yCoord = { 16, 12, 12, 0, 12, 12, 16 };
	private int[] scaleTrees;

	public Trees(int[] xTrees, int[] yTrees, int[] scaleTrees) {
		this.scaleTrees = scaleTrees;
		this.xTrees = xTrees;
		this.yTrees = yTrees;

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// below, we will draw each tree using a for loop
		for (int i = 0; i < xTrees.length; i++) {
			// xUnit gives the x-component of the tree
			int[] xUnit = { xTrees[i] + (xCoord[0] * scaleTrees[i]), xTrees[i] + (xCoord[1] * scaleTrees[i]),
					xTrees[i] + (xCoord[2] * scaleTrees[i]), xTrees[i] + (xCoord[3] * scaleTrees[i]),
					xTrees[i] + (xCoord[4] * scaleTrees[i]), xTrees[i] + (xCoord[5] * scaleTrees[i]),
					xTrees[i] + (xCoord[6] * scaleTrees[i]) };
			// yUnit gives the y-component of the tree
			int[] yUnit = { yTrees[i] + (yCoord[0] * scaleTrees[i]), yTrees[i] + (yCoord[1] * scaleTrees[i]),
					yTrees[i] + (yCoord[2] * scaleTrees[i]), yTrees[i] + (yCoord[3] * scaleTrees[i]),
					yTrees[i] + (yCoord[4] * scaleTrees[i]), yTrees[i] + (yCoord[5] * scaleTrees[i]),
					yTrees[i] + (yCoord[6] * scaleTrees[i]) };

			// creates the tree
			g.fillPolygon(xUnit, yUnit, 7);

			// create the rectangle that will fill in brown.
			 g.setColor(new Color(101, 67, 33));
			g.fillRect(xTrees[i] + (xCoord[1] * scaleTrees[i]), yTrees[i] + (yCoord[1] * scaleTrees[i]),
					((xCoord[5] * scaleTrees[i]) - ((xCoord[1] * scaleTrees[i]))),
					(yCoord[0] * scaleTrees[i]) - ((yCoord[1] * scaleTrees[i])));
			
			//create the triangle that will fill in green.
			int[] xTriangle = {xUnit[2], xUnit[3], xUnit[4]};
			int[] yTriangle = {yUnit[2], yUnit[3], yUnit[4]};

			g.setColor(new Color(2, 100, 64));
			g.fillPolygon(xTriangle, yTriangle, 3);
		}

	}

	public int[] getxTrees() {
		return xTrees;
	}

	public int[] getyTrees() {
		return yTrees;
	}

	public static void main(String[] args) {

		int[] x = { 1, 20, 1, 60, 110, 1 };
		int[] y = { 3, 10, 60, 60, 80, 160 };
		int[] sc = { 1, 3, 5, 3, 4, 9 };
		Trees tree1 = new Trees(x, y, sc);

		JFrame frame = new JFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final int FRAME_WIDTH = 400;
		final int FRAME_HEIGHT = 400;

		// creates a window of size 800 x 600 pixels
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.add(tree1);
		frame.setVisible(true); // makes the application visible.
	}
}
