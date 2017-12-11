package test.generic;

public class LinkedStack<T> {
	private class Node<U>{
		U item;
		Node<U> next;		
		Node(U item, Node<U> next ){
			this.item = item;
			this.next = next;
		}
		Node(){
			this.item=null;
			this.next=null;
		}
		boolean end(){
			return item==null && next==null;
		}
	}
	Node<T> top = new Node<>();
	public void push(T item){	
		top = new Node<T>(item,top);
		
		
	}
	public T pop(){
		T result = top.item;		
		if(!top.end())
			top = top.next;	
		
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedStack<String> ls = new LinkedStack<>();
		for(String s: "i'm supper man !".split(" ")){
			ls.push(s);
		}
		String s;
		while( (s = ls.pop()) != null){
			System.out.println(s);
		}	

	}

}
