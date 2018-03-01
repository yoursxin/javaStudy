package test.tree;

public class BST <Key extends Comparable<Key>, Value>{
	
	private class Node{
		private Node left,right;		
		private Key key;
		private Value val;
		private int N;
		public Node(Key key,Value val, int N){
			this.key = key;
			this.val = val;
			this.N = N;
		}
	}
	private Node root;
	public int size(){
		return size(root);
	}
	private int size(Node x){
		if(x == null) return 0;
		else return x.N;
				
	}
	public Value get(Key key){
		return get(root,key);
	}
	
	private Value get(Node n,Key key){
		if(n == null){
			return null;
		}
		int cmp = key.compareTo(n.key);
		if(cmp<0){
			return get(n.left, key);
		}else if(cmp>0){
			return get(n.right,key);
		}else{
			return n.val;
		}
	}
	public void put(Key key, Value val){
		root = put(root,key,val);
	}
	
	private Node put(Node n, Key key,Value val){
		if(n == null){
			return new Node(key,val,1);
		}
		int cmp = key.compareTo(n.key);
		if(cmp<0){
			n.left= put(n.left,key,val);
		}else if(cmp>0){
			n.right = put(n.right,key,val);
		}else{
			n.val = val;
		}
		n.N = size(n.left)+size(n.right)+1;
		return n;
	}
	
	public Key min(){
		return min(root).key;
	}
	private Node min(Node n){
		if(n == null) return null;
		else if(n.left != null)
			return min(n.left);
		else 
			return n;
	}
	
	public Key max(){
		return max(root).key;
	}
	private Node max(Node n){
		if(n==null)
			return null;
		else if (n.right != null)
			return max(n.right);
		else 
			return n;
	}
	
	public Key floor(Key key){
		return floor(root, key).key;
	}
	
	public Node floor(Node n, Key key){
		if(n == null)
			return null;
		int cmp = key.compareTo(n.key);
		if( cmp == 0){
			return n;
		}else if(cmp<0){
			return floor(n.left,key);			
		}
	
		Node x = floor(n.right,key);
		if(x!=null)
			return x;
		else 
			return n;
		
	}
	
	public Key ceiling(Key key){
		return ceiling(root,key).key;
	}
	
	private Node ceiling(Node n, Key key){
		if(n==null) return null;
		int cmp = n.key.compareTo(key);
		if(cmp == 0)
			return n;
		else if(cmp<0)
			return ceiling(n.right,key);
		Node x = ceiling(n.left,key);
		if(x == null)
			return n;
		else return x;
		
	}
	
	public Key select(int k){
		return select(root,k).key;
	}
	private Node select(Node n, int k){
		if(n == null)
			return null;
		int lsize = size(n.left);
		if(lsize == k)
			return n;
		else if(lsize > k)
			return select(n.left,k);
		else 
			return select(n.right,k-lsize-1);
	}
	
	public int rank(Key key){
		return rank(key,root);
	}
	private int rank(Key key,Node n){
		if(n == null) return 0;
		int cmp = key.compareTo(n.key);
		if(cmp == 0)
			return size(n.left);
		else if(cmp < 0 )
			return rank(key,n.left);
		else
			return size(n.left)+1+rank(key,n.right);
	}
	public void deleteMin(){
		deleteMin(root);
	}
	private Node deleteMin(Node n){		
		if(n.left == null) 
			return n.right;
		n.left = deleteMin(n.left);
		n.N = size(n.left)+size(n.right)+1;
		return n;
	}
	
	public void deleteMax(){
		deleteMax(root);
	}
	private Node deleteMax(Node n){
		if(n.right == null)
			return n.left;
		n.right = deleteMax(n.right);
		n.N = size(n.left)+size(n.right)+1;
		return n;
	}
	
	public void delete(Key key){
		delete(root,key);		
	}
	
	private Node delete(Node n, Key key){
		if(n == null) return null;
		int cmp = key.compareTo(n.key);
		if(cmp < 0 ) 
			n.left = delete(n.left, key);
		else if(cmp>0)
			n.right = delete(n.right, key);
		else{			
			if(n.left == null)
				return n.right;
			else if(n.right == null)
				return n.left;
			Node t = n;  
			n = min(t.right); 
			n.right = deleteMin(t);
			n.left = t.left;			
		}
		n.N = size(n.left)+size(n.right)+1;
		return n;
	}

	public static void main(String[] args) {
		BST<String,Integer> bst = new BST<>();
		bst.put("c", 2);
		bst.put("a", 1);
		bst.put("e", 3);
		bst.put("b", 5);
		bst.put("k", 6);
		System.out.println(bst.get("d"));
		System.out.println("min:"+bst.min());
		System.out.println("max:"+bst.max());
		System.out.println("floor:"+bst.floor("f"));
		System.out.println("ceiling:"+bst.ceiling("f"));
		System.out.println("select:"+bst.select(3));
		System.out.println("rank:"+bst.rank("e"));
		bst.delete("a");
		bst.delete("b");
		System.out.println("min:"+bst.min());
		

	}

}
