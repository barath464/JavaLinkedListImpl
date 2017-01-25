package myLinkedList;

public class Node {

	private int age;
	private Node Node;

	/**
	 * @param age
	 * @param node
	 */
	public Node(int age, Node node) {
		this.age = age;
		Node = node;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Node getNode() {
		return Node;
	}

	public void setNode(Node node) {
		Node = node;
	}

	@Override
	public String toString() {
		return "Node [age=" + age + "]";
	}

}
