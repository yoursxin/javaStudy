package test.heap;

public class BinaryHeap<T extends Comparable<? super T>> {

	public BinaryHeap() {
		this(DEFAULT_CAPACITY);
	}

	public BinaryHeap(int capacity) {
		currentSize=0;
		array = (T[])new Comparable[capacity+1];
				
	}

	public BinaryHeap(T[] items) {
		currentSize = items.length;
		array = (T[])new Comparable[(currentSize+2)*11/10];
		buildHeap();
	}

	public void insert(T x) {

		if (currentSize + 1 >= array.length) {
			enlargeArray(currentSize*2+1);
		}
		int hole = ++currentSize;
		for (; hole > 1 && x.compareTo(array[hole / 2]) < 0; hole = hole / 2) {
			array[hole] = array[hole / 2];
		}
		array[hole]=x;

	}

	public T findMin() {
		if(currentSize>0)
			return array[1];
		else 
			return null;
	}

//	public T deleteMin() {
//		
//		T x = array[currentSize];
//		T x1 = array[1];
//		int hole=1;
//		int minHole = array[hole*2].compareTo(array[hole*2+1])<0?hole*2:hole*2+1;
//		for(;hole<currentSize && x.compareTo(array[minHole])>0;){
//			array[hole] = array[minHole];
//			hole = minHole;
//			minHole = array[hole*2].compareTo(array[hole*2+1])<0?hole*2:hole*2+1;			
//		}
//		array[hole] = x;
//		return x1;
//
//	}
	
	public T deleteMin() throws UnderflowException{
		
		if(isEmpty()){
			throw new UnderflowException();
		}
		T minItem = findMin();
		array[1] = array[currentSize--];
		percolateDown(1);
		return minItem;

	}

	public boolean isEmpty() {
		return currentSize == 0;
	}

	public void makeEmpty() {
		currentSize=0;
	}

	private static final int DEFAULT_CAPACITY = 10;
	private T[] array;
	private int currentSize;

	private void percolateDown(int hole) {
		int child;
		T tmp = array[hole];
		for(;hole*2<=currentSize; hole=child){
			child = hole*2;
			if(child<currentSize && array[child+1].compareTo(array[child])<0){
				child++;
			}
			if(array[child].compareTo(tmp) <0){
				array[hole] = array[child];
			}else{
				break;
			}
		}
		array[hole]=tmp;
	}

	private void buildHeap() {
		for(int i=currentSize/2; i>0;i--){
			percolateDown(i);
		}
	}

	private void enlargeArray(int newSize) {
		T[] oldArray = array;
		array = (T[])new Comparable[newSize];
		for(int i=0; i<oldArray.length;i++){
			array[i] = oldArray[i];
		}
	}

	public static void main(String[] args) throws Exception{
		int numItems = 10000;
        BinaryHeap<Integer> h = new BinaryHeap<>( );
        int i = 37;

        for( i = 37; i != 0; i = ( i + 37 ) % numItems )
            h.insert( i );
        
        for( i = 1; i < numItems; i++ )
            if( h.deleteMin( ) != i )
                System.out.println( "Oops! " + i );

	}

}
