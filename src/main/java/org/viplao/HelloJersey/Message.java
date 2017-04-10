package org.viplao.HelloJersey;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message{
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Message : " + message;
	}
}