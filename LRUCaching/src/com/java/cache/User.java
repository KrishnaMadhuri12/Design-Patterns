package com.java.cache;


public class User extends Thread {
	String userIp;
	String userTagLine;

	public User() {
		System.out.println("In the default constructor");
	}

	public User(String userIp, String userTagLine) {
		super();
		this.userIp = userIp;
		this.userTagLine = userTagLine;
	}

	public void run() {
		// LRU Cache of the layer
		
		LRUCache localToUser = LRUCache.getInstanceCache();
		if (localToUser.getValue(this.userIp) != null)
			System.out.println(localToUser.getValue(this.userIp));
		else
			localToUser.add(this.userIp, this.userTagLine);
		System.out.println(localToUser.getValue(this.userIp));
		}
	
	
}
