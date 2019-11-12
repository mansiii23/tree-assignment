import java.util.*;
class TreeHeight{
	public static void main(String args[]){
		Node root=null;
		root=insert(root,50);
		insert(root,30);
		insert(root,20);
		insert(root,40);
		insert(root,70);
		insert(root,80);
		insert(root,60);
		System.out.print(treeHeight(root)-1);
	}

	static class Node{
		int data;
		Node left,right;
		public Node(int data){
			this.data=data;
			Node left=null;
			Node right=null;
		}
	}

	static Node insert(Node root, int data){
		Node node=new Node(data);
		if(root==null){
			return node;
		}
		Node parent=null, current=root;
		while(current!=null){
			parent=current;
			if(current.data>=data){
				current=current.left;
			}
			else{
				current=current.right;
			}
		}
		if(parent.data>=data){
			parent.left=node;
		}
		else{
			parent.right=node;
		}
		return root;
	}

	static int treeHeight(Node root){
		if(root==null){
			return 0;
		}
		int lh=treeHeight(root.left);
		int rh=treeHeight(root.right);
		if(lh>=rh){
			return lh+1;
		}
		else{
			return rh+1;
		}
	}
}