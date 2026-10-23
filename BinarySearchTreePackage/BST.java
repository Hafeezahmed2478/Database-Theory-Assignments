package BinarySearchTreePackage;

public class BST {
	Node root;
	
	Node Insert(Node root , int key , String name) {
		if (root == null) {
			return new Node(key , name);
		}
		else if (key < root.key) {
			root.left = Insert(root.left , key , name);
		}
		else {
			root.right = Insert(root.right , key , name);
		}
		return root;
	}
	Node Search(Node root , int target) {
		if (root == null || root.key == target) {
			return root;
		}
		else if (target < root.key) {
			return Search(root.left , target);
		}
		else {
			return Search(root.right , target);
		}
	}
	Node Delete(Node root , int key) {
		if (root == null) {
			return null;
		}
		if (key < root.key) {
			root.left = Delete(root.left , key);
		}
		else if (key > root.key) {
			root.right = Delete(root.right , key);
		}
		else {
			if (root.left == null && root.right == null) {
				return null;
			}
			if (root.left == null) {
				return root.right;
			}
			if (root.right == null) {
				return root.left;
			}
			Node temp = root.right;
			while (temp.left != null) {
				temp = temp.left;
			}
			root.key = temp.key;
			root.name = temp.name;
			
			root.right = Delete(root.right , temp.key);
		}
		return root;
	}
	void InOrder(Node root) {
		if (root!=null){
			InOrder(root.left);
			System.out.println(root.key + " " + root.name);
			InOrder(root.right);
		}
	}
	void PreOrder(Node root) {
		if (root!=null){
			System.out.println(root.key + " " + root.name);
			PreOrder(root.left);
			PreOrder(root.right);
		}
	}
	void PostOrder(Node root) {
		if (root!=null){
			PostOrder(root.left);
			PostOrder(root.right);
			System.out.println(root.key + " " + root.name);
		}
	}
	int Min(Node root) {
		while (root.left!=null) {
			root = root.left;
		}
		return root.key;
	}
	int Max(Node root) {
		while (root.right!=null) {
			root = root.right;
		}
		return root.key;
	}
	int Sum(Node root) {
		if (root==null) {
			return 0;
		}
		return root.key + Sum(root.left) + Sum(root.right);
	}
	int Count(Node root) {
		if (root==null) {
			return 0;
		}
		return 1 + Count(root.left) + Count(root.right);
	}
}
