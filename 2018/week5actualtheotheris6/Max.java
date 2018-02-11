/**
 * @author Karim Timer
 */

public class Max {

/**
	 * Maximum value in a search tree
	 * 
	 * @param a
	 *            a binary search tree.
	 * @return The maximum value stored in the tree.
	 */
	public static int max(Tree<Integer> a) {
		if (a.isEmpty()) {
			return 0;
		} else if (!a.getRight().isEmpty()) {
			return max(a.getRight());
		} else
			return a.getValue();

	}
  }
  
