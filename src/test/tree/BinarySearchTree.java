package test.tree;

public class BinarySearchTree <T extends Comparable<? super T>>{
	
	private static class BinaryNode<T>{
		T element;
		BinaryNode<T> left;
		BinaryNode<T> right;
		
		BinaryNode(T element,BinaryNode<T> left, BinaryNode<T> right){
			this.element = element;
			this.left = left;
			this.right = right;			
		}
		BinaryNode(T element){
			this(element,null,null);
		}
	}
	
	private BinaryNode<T> root;
	BinarySearchTree(){
		root = null;		
	}
	public boolean isEmpty(){
		return root == null;
	}
	public void makeEmpty(){
		root = null;
	}
	
	public boolean contains(T x){
		return contains(x, root);
	}
	
	
	public void insert(T x){
		insert(x, root);
	}
	
	public void remove(T x){
		remove(x, root);
	}
	
	public T findMax(){
		return findMax(root).element;
	}
	
	public T findMin(){
		return findMin(root).element;
	}
	
	public  boolean contains(T x, BinaryNode<T> r) {
		if(null == r){
			return false;
		}
		int comparedResult = x.compareTo(r.element);
			
		if(comparedResult==0){
			return true;
		}else if(comparedResult <0){
			return contains(x,r.left);
		}else{
			return contains(x,r.right);
		}
		
	}
	
	public BinaryNode<T> findMax(BinaryNode<T> r) {
		if(r == null){
			return null;
		}else if(r.right == null){
			return r.right;
		}
		return findMax(r);
		
	}

	public BinaryNode<T> findMin(BinaryNode<T> r) {
		
		if(null == r)
			return null;
		while(r.left != null){
			r = r.left;
		}
		return r;
	}
	public BinaryNode<T> insert(T x, BinaryNode<T> r) {
		if(r==null) 
			return new BinaryNode<T>(x);
		int comparedResult = x.compareTo(r.element);
		if(comparedResult<0){
			r.left =insert(x,r.left);			
		}else if(comparedResult>0){
			r.right =insert(x,r.right);			
		}	
		return r;
	}
	public BinaryNode<T> remove(T x, BinaryNode<T> r) {
		if(r == null) 
			return r;
		int comparedResult = x.compareTo(r.element);
		if(comparedResult<0){
			r.left = remove(x,r.left);
		}else if (comparedResult >0){
			r.right = remove(x,r.right);
		}else if(r.left != null && r.right != null){
			r.element = findMin(r.right).element;
			r.right = remove(r.element,r.right);
		}else{
			r = (r.left != null)? r.left:r.right;
		}
		return r;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

