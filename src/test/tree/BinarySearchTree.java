package test.tree;

public class BinarySearchTree<T extends Comparable<? super T>> {

	private static class BinaryNode<T> {
		T element;
		BinaryNode<T> left;
		BinaryNode<T> right;

		BinaryNode(T element, BinaryNode<T> left, BinaryNode<T> right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}

		BinaryNode(T element) {
			this(element, null, null);
		}
	}

	private BinaryNode<T> root;

	BinarySearchTree() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void makeEmpty() {
		root = null;
	}

	public boolean contains(T x) {
		return contains(x, root);
	}

	public void insert(T x) {
		root = insert(x, root);
	}

	public void remove(T x) {
		root = remove(x, root);
	}

	public T findMax() {
		return findMax(root).element;
	}

	public T findMin() {
		
		return findMin(root).element;
	}

	public boolean contains(T x, BinaryNode<T> r) {
		if (null == r) {
			return false;
		}
		int comparedResult = x.compareTo(r.element);

		if (comparedResult == 0) {
			return true;
		} else if (comparedResult < 0) {
			return contains(x, r.left);
		} else {
			return contains(x, r.right);
		}

	}

	public BinaryNode<T> findMax(BinaryNode<T> r) {
		if (r == null) {
			return null;
		} else if (r.right == null) {
			return r;
		}
		return findMax(r.right);

	}
	
	

	public BinaryNode<T> findMin(BinaryNode<T> r) {

		if (null == r)
			return null;
		while (r.left != null) {
			r = r.left;
		}
		return r;
	}
	
	public BinaryNode<T> findMin2(BinaryNode<T> r){
		if(r == null){
			return r;
		}else if(r.left == null){
			return r;
		}
		return findMin(r.left);
		
	}

	public BinaryNode<T> insert(T x, BinaryNode<T> r) {
		if (r == null)
			return new BinaryNode<T>(x);
		int comparedResult = x.compareTo(r.element);
		if (comparedResult < 0) {
			r.left = insert(x, r.left);
		} else if (comparedResult > 0) {
			r.right = insert(x, r.right);
		}
		return r;
	}

	public BinaryNode<T> remove(T x, BinaryNode<T> r) {
		if (r == null)
			return r;
		int comparedResult = x.compareTo(r.element);
		if (comparedResult < 0) {
			r.left = remove(x, r.left);
		} else if (comparedResult > 0) {
			r.right = remove(x, r.right);
		} else if (r.left != null && r.right != null) { //two children
			r.element = findMin(r.right).element;
			r.right = remove(r.element, r.right);
		} else { //one child or no child
			r = (r.left != null) ? r.left : r.right;
		}
		return r;

	}
	

	public void printTree() {
		System.out.println("----begin-----");
		if (isEmpty()) {
			System.out.println("empty tree");
		} else {
			printTree(root);
		}
		System.out.println("----end-----");
	}

	public void printTree(BinaryNode<T> r) {
		if (r != null) {
			printTree(r.left);
			System.out.println(r.element);
			printTree(r.right);
		}

	}
	
	public static void main2(String[] args) {
		BinarySearchTree<Integer> t = new BinarySearchTree<>();
		t.insert(1);
		t.printTree( );
		t.remove(1);
		t.printTree();
		
	}

	public static void main(String[] args) {
		BinarySearchTree<Integer> t = new BinarySearchTree<>( );
        final int NUMS = 1000;
        final int GAP  =   37;

        System.out.println( "Checking... (no more output means success)" );

        for( int i = GAP; i != 0; i = ( i + GAP ) % NUMS )
            t.insert( i );        
        
        for( int i = 1; i < NUMS; i+= 2 )
            t.remove( i );

        if( NUMS < 40 )
            t.printTree( );
        System.out.println("min:"+t.findMin());
        System.out.println("max:"+t.findMax());
        
        if( t.findMin( ) != 2 || t.findMax( ) != NUMS - 2 )
            System.out.println( "FindMin or FindMax error!" );

        for( int i = 2; i < NUMS; i+=2 )
             if( !t.contains( i ) )
                 System.out.println( "Find error1!" );

        for( int i = 1; i < NUMS; i+=2 )
        {
            if( t.contains( i ) )
                System.out.println( "Find error2!" );
        }
	}

}
