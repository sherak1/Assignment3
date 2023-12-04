package task2;

 
public class MyTree {

	private Node root;

	private static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public MyTree() {
		this.root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void addValue(int value) {
		root = addRecursive(root, value);
	}

	/*
	 * public boolean contains(int value) { return containsRecursive(root, value); }
	 */

	private Node addRecursive(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}

		if (value < current.data) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.data) {
			current.right = addRecursive(current.right, value);
		}

		return current;
	}

	public boolean contains(int value) {
		return containsRecursive(root, value);
	}

	private boolean containsRecursive(Node current, int value) {
		if (current == null) {
			return false;
		}

		if (value == current.data) {
			return true;
		}
		// If the value we're looking for is less than the current node's data,
		return value == current.data || (value < current.data && containsRecursive(current.left, value))
		        || (value > current.data && containsRecursive(current.right, value));

		// or [return value < current.data ? containsRecursive(current.left, value) : containsRecursive(current.right, value);
	}

// remove implementation
	public void removeValue(int value) {
		root = removeRecursive(root, value);
	}

	private Node removeRecursive(Node current, int value) {
		if (current == null) {
			return null; // If the tree or subtree is not found, we return null
		}

		if (value == current.data) {
			// If we found a node that we want to remove

			// If the node has only one child or no children
			if (current.left == null) {
				return current.right;
			} else if (current.right == null) {
				return current.left;
			}

			// If the node has both children, we will find the smallest node in the right
			// subtree (or the largest in the left subtree)
			current.data = findMinValue(current.right);

			// Recursively remove the smallest node in the right subtree
			current.right = removeRecursive(current.right, current.data);
		} else if (value < current.data) {
			// If the value we are looking for is smaller, we recursively search
			// in the left subtree
			current.left = removeRecursive(current.left, value);
		} else {
			// If the value we are looking for is greater, we recursively search
			// in the right subtree
			current.right = removeRecursive(current.right, value);
		}

		return current;
	}

	private int findMinValue(Node node) {
		// smallest node in subtree
		while (node.left != null) {
			node = node.left;
		}
		return node.data;
	}
	// TreeContainsValue implementing

	public boolean contains2(int value) {
		return contains2Recursive(root, value);
	}

	private boolean contains2Recursive(Node current, int value) {
		// Base case: If the current node is null, the value is not found
		if (current == null) {
			return false;
		}

		// If the value is equal to the current node's data, it's found
		if (value == current.data) {
			return true;
		}

		if (value < current.data) {
			return contains2Recursive(current.left, value);
		}

		else {
			return contains2Recursive(current.right, value);
		}
	}

	public boolean isSorted() {
		return isSortedRecursive(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

// IsSorted implementing
	private boolean isSortedRecursive(Node current, int minValue, int maxValue) {
		// If the current node is null, it's sorted
		if (current == null) {
			return true;
		}

		// the current node's value is within the valid range
		if (current.data <= minValue || current.data > maxValue) {
			return false;
		}
		// the right subtree with updated minimum value
		// the left subtree with updated maximum value
		return isSortedRecursive(current.left, minValue, current.data)
				&& isSortedRecursive(current.right, current.data, maxValue);
	}

}
