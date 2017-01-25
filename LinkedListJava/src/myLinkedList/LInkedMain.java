package myLinkedList;


public class LInkedMain {
	public static void main(String[] args) {
		LinkedImpl list = new LinkedImpl();
		list.add(456);
		list.add(55);
		list.add(535);
		list.add(979);
		list.last.setNode(list.first.getNode());
		System.out.println(list);
		list.print();
	}
}
