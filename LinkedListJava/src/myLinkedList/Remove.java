package myLinkedList;
/*Given a linked list and inte­ger ‘n’, write an algo­rithm to find the nth node from the end in the Linked List.*/
public class Remove {
	
	public static void main(String[] args) {
		LinkedImpl ll = new LinkedImpl();
		ll.add(25);
		ll.add(42);
		ll.add(40);
		ll.add(78);
		ll.add(39);
		ll.print();
		Node head =ll.first;
		remove(head,2);
	}
	public static void remove(Node head,int k){
		int i=k;
		Node current = head;
		while(i>0){
			current=current.getNode();
			i--;
		}
		Node next = head;
		while(current!=null){
			current = current.getNode();
			next = next.getNode();
		}
		System.out.println("node "+k+" from end contains "+next.getAge());
	}

}
