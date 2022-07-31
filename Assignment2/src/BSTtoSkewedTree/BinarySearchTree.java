package BSTtoSkewedTree;

public class BinarySearchTree extends Node 
{
	
	Node root;
	
	BinarySearchTree()
	{
		root = null;
	}
	
	void insert(int data)
	{
		root = addElement(data, root);
	}
	
	private Node addElement(int data, Node root)
	{
		if(root==null)
		{
			root = new Node(data);
			return root;
		}
		if(data < root.data)
			root.left = addElement(data, root.left);
		else if(data>root.data)
			root.right = addElement(data, root.right);
		return root;
	}
	
	void InOrder()
	{
		InOrderImplementation(root);
	}
	
	private void InOrderImplementation(Node root)
	{
		if(root!=null)
		{
			InOrderImplementation(root.left);
			System.out.print(root.data + " ");
			InOrderImplementation(root.right);
		}
		
	}
	
}
