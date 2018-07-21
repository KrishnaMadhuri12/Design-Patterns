package com.java.cache;

//Double Linked List
public class Node {

	String value;
	String key;
	Node prev;
	Node next;

	public Node(String value, String key, Node prev, Node next) {
		super();
		this.value = value;
		this.key = key;
		this.prev = prev;
		this.next = next;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
