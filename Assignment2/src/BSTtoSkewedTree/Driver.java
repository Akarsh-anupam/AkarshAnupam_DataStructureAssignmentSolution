package BSTtoSkewedTree;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int bstSize;
		BinarySearchTree myBST = new BinarySearchTree();
		RightSkewedTree rightSkewedTree = new RightSkewedTree();
		
		System.out.println("Enter the size of BST: ");
		bstSize = sc.nextInt();
		
		System.out.println("Enter the elements of BST: ");
		for(int i=0; i<bstSize; i++)
			myBST.insert(sc.nextInt());
		System.out.println("My BST is: ");
		myBST.InOrder();
		rightSkewedTree.ConvertToRST(myBST.root);
		
		System.out.println("\nThe Right Skewed Tree is: ");
		rightSkewedTree.display();
		sc.close();

	}

}
