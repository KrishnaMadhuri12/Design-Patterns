package com.java.cache;

import java.util.concurrent.ConcurrentHashMap; 

public class LRUCache implements Cache {
	ConcurrentHashMap<String, Node> mappingFile;
	/**
	 * ConcurrentHashMap read and write
	 * By default it simultaneously allows 16 threads to read and write from Map
	 * without any external synchronization
	 */

	Node head, tail;
	int LRUSIZE = 5;
	static LRUCache cachingObj = null;
/*
 * Singleton Pattern to make sure all the user threads access the same single cache layer
 */
	
	public static LRUCache getInstanceCache() {
		
		if (cachingObj == null)
			return new LRUCache();
		else
			return cachingObj;
	}

	private LRUCache() {

		mappingFile = new ConcurrentHashMap<String, Node>();
	}

	@Override
	public void add(String key, String value) {
		// TODO Auto-generated method stub
		if (mappingFile.contains(key)) {
			Node test = mappingFile.get(key);
			test.setValue(value);
			removeNode(mappingFile.get(key));
			addNodeAtFront(mappingFile.get(key));
			mappingFile.put(key, test);
		} else {

			Node new_Node = new Node(key, value, null, null);
			if (mappingFile.size() > LRUSIZE)// reached cache max capacity now
												// remove the old data
			{
				mappingFile.remove(tail.getKey());
				removeNode(tail);

			}
			mappingFile.put(key, new_Node);
			addNodeAtFront(new_Node);

		}
	}

	@Override
	public void remove(String key) {
		// TODO Auto-generated method stub
		if(mappingFile.contains(key))
		{
			Node node_To_Remove=mappingFile.get(key);
			removeNode(node_To_Remove);
			mappingFile.remove(key);	
		}
		else 
			System.out.println("Cant remove the value");
	}
/*
 * Method returns the value (user Tagline)
 * @see com.java.cache.CacheMethods#getValue(java.lang.String)
 */
	@Override
	public String getValue(String key) {
		// TODO Auto-generated method stub
		System.out.println(key);
		if (mappingFile.containsKey(key)) {
			removeNode(mappingFile.get(key));
			addNodeAtFront(mappingFile.get(key));
			Node returnValue = mappingFile.get(key);
			return returnValue.getValue();
		} else
			return null;

	}

	/*
	 * Double Linked List Methods to removeNode from end and insertNode near Head
	 */

	public void removeNode(Node node) {
		if (node.getPrev() != null)
			node.prev.next = node.next;
		else
			head = node.next;
		if (node.next != null)
			node.next.prev = node.prev;
		else
			tail = node.prev; // left side of the node
	}

	public void addNodeAtFront(Node node) {
		node.next = head;
		node.prev = null;
		if (head != null)
			head.prev = node;
		head = node;
		if (tail == null) {
			tail = head;
		}
	}

}
