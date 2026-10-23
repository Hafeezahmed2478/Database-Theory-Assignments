package BinarySearchTreePackage;
import java.util.Scanner;
public class BSTRunner {
	public static void main (String[] args) {
		BST list = new BST();
		Scanner input = new Scanner(System.in);
		list.root = new Node(10 , "A");
		list.Insert(list.root, 20, "B");
		list.Insert(list.root, 40, "C");
		list.Insert(list.root, 70, "D");
		list.Insert(list.root, 50, "E");
		list.Insert(list.root, 30, "F");
		list.Insert(list.root, 45, "G");
		list.Insert(list.root, 55, "H");
		System.out.println(" InOrder Transversal ");
		list.InOrder(list.root);
		System.out.println(" Maximum root of tree is " + list.Max(list.root));
		System.out.println(" Minimum root of tree is " + list.Min(list.root));
		System.out.println(" Sum of node " + list.Sum(list.root));
		System.out.println(" Total number of nodes " + list.Count(list.root));
		double average = (double)list.Sum(list.root)/(double)list.Count(list.root);
		System.out.println(" Average of nodes of the tree is " + average);
		System.out.println(" Maximum root in right sub tree " + list.Max(list.root.right));
		System.out.println(" Minimum root in right sub tree " + list.Min(list.root.right));
		System.out.println(" Enter the data you want to search ");
		int num = input.nextInt();
		Node res = list.Search(list.root, num);
		if (res != null) {
			System.out.println(" Record found ");
			System.out.println(res.key + " " + res.name);
		}
		else {
			System.out.println(" Not found ");
		}
	}

	
}
