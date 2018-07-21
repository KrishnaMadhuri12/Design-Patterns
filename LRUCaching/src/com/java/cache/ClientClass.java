package com.java.cache;
/*
 * Client Class initiating multiple user threads and accessing the cache layer accordingly
 */
public class ClientClass {
	
public static void main(String[] args)
{
	User user1=new User("","");
	user1.start();
	User user2=new User("","");
	user2.start();
	User user3=new User("","");
	user3.start();
	//Make sure to terminate all the user threads before shutting down the main thread
	try {
        user1.join();
        user2.join();
        user3.join();
    } catch (InterruptedException e) {
             e.printStackTrace();
    }
}






}
