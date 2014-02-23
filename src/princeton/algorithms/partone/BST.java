package princeton.algorithms.partone;

public class BST{
	
	Node root = null;
	
	class Node
	{
		int key;
		int value;
		Node left, right;
		public Node(int key, int value)
		{
			this.key = key;
			this.value = value;
		}
	}
	
	public void insert(int key, int value)
	{
		if(root == null)
		{
			root = new Node(key, value);
		}
		else
		{
			put(root, key, value);
		}
	}

	private Node put(Node r, Integer key, int value) {
		if(r == null)
		{
			return r = new Node(key, value);
		}
		
		if(compareTo(key, r.key) < 0)
		{
			r.left =  put(r.left, key, value);
		}
		else if(compareTo(key, r.key) > 0)
		{
			r.right = put(r.right, key, value);
		}
		else if(compareTo(key, r.key) == 0)
		{
			return r;
		}
		return r;
		
	}

	public int get(Integer key)
	{
		Node x = root;
		while(x != null)
		{
			int cmp = compareTo(key, x.key);
			if(cmp < 0) x = x.left;
			else if(cmp > 0) x = x.right;
			else if (cmp == 0) return x.value;
		}
		return -1;
	}
	
	public int compareTo(int key, Integer that) {
		// TODO Auto-generated method stub
		if(key < that) return -1;
		else if(key > that) return 1;
		else if(key == that)
			return 0;
		return 0;
	}
	
	public void delete(int key)
	{
		Node x = root;
		while(x != null)
		{
			int cmp = compareTo(key, x.key);
			if(cmp < 0) x = x.left;
			else if(cmp > 0) x = x.right;
			else if (cmp == 0) x = null;
		}
		
	}

}
