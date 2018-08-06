package com.training.exilant.RestFul_Works_SPringBoot;

public class HelloWorld {
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

@Override
public String toString() {
	return "HelloWorld [message=" + message + "]";
}

public HelloWorld(String message) {
	this.setMessage(message);
}

}
