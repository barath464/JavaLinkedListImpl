package myLinkedList;

public class Circular {
static Circular circular;
public static void main(String[] args) {
	LinkedImpl list = new LinkedImpl();
	list.add(25);
	list.add(28);
	list.add(69);
	list.add(85);
	list.print();
	list.last.setNode(list.first.getNode());
	circular = new Circular();
	circular.checkCircular(list);
	
}
	public void checkCircular(LinkedImpl list){
	Node current = list.first;
	Node next = list.first;
	while(current!=null && next!=null){
		if(current==next.getNode()){
			System.out.println("Circular Linked List");
			return ;
		}
		else {
			current = current.getNode();
			next = next.getNode().getNode();
		}
	}
	System.out.println("Not circular");
	System.out.println("test");
}

}
