package com.java.cache;

public interface Cache {

void add(String key, String value);//Ip address is the key and the UserTagLine is value
void remove(String key);
String getValue(String key);
//void updateValue(String key, Node value);

}
