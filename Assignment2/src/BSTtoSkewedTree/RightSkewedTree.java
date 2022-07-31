package BSTtoSkewedTree;

public class RightSkewedTree  extends Node{
	
	Node root;
	public RightSkewedTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	public void insert(int data)
	{
		if(root==null)
			root = new Node(data);
		else
		{
			Node tempNode = root;
			while(tempNode.right!=null)
				tempNode = tempNode.right;
			Node newNode = new Node(data);
			tempNode.right = newNode;
			tempNode = newNode;
		}
	}
	
	public void ConvertToRST(Node bsTree)
	{
		if(bsTree!=null)
		{
			ConvertToRST(bsTree.left);
			insert(bsTree.data);
			ConvertToRST(bsTree.right);
		}
	}
	
	public void display()
	{
		if(root!=null)
		{
			Node tempNode =  root;
			while(tempNode!=null)
			{
				System.out.print(tempNode.data + " ");
				tempNode = tempNode.right;
			}
		}
	}
}
