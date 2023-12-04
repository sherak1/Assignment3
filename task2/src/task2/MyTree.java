package task2;

//import org.w3c.dom.Node;

public class MyTree {
	private Node root;

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

		return value < current.data ? containsRecursive(current.left, value) : containsRecursive(current.right, value);
	}

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

}
