package myLinkedList;

public class LinkedImpl {
	Node first;
	Node last;
	int size;

	public void add(int age) {
		Node temp = new Node(age, null);
		size++;
		if (first == null) {
			first = temp;
			last = first;
		} else {
			last.setNode(temp);
			last = temp;
		}
	}

	public String delete(int n) {
		Node previous = null;
		Node temp = first;
		while (temp != null) {
			if (temp.getAge() == n) {
				size--;
				if (temp == first) {
					first = first.getNode();
					return String.valueOf(n)+" is element deleted";
				} else
					previous.setNode(temp.getNode());
				return String.valueOf(n)+" is element deleted";

			} else
				previous = temp;
			temp = temp.getNode();
		}
		return String.valueOf(n)+"not found";
	}



	@Override
	public String toString() {
		return "LinkedImpl [first=" + first + "]";
	}

	public void print() {
		System.out.println("linked list size is " + size);
		Node current = first;
		if (current == null) {
			System.out.println("List is empty");
			return;
		} else {
			while (current.getNode() != null) {
				System.out.println(current.getAge());
				current = current.getNode();
			}
			System.out.println(current.getAge());
		}

	}
}
