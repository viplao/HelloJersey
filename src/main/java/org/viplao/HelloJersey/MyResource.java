package org.viplao.HelloJersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("/text")
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Hello, Heroku!";
    }
    
    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public Message getJsonMessage() {
    	Message msg = new Message();
    	msg.setMessage("Hello, Jersey..");
    	System.out.println(msg.toString());
    	return msg;
    }
    
//    @XmlRootElement
//    private class Message{
//    	private String message;
//
//		public String getMessage() {
//			return message;
//		}
//
//		public void setMessage(String message) {
//			this.message = message;
//		}
//		
//		@Override
//		public String toString() {
//			// TODO Auto-generated method stub
//			return "Message : " + message;
//		}
//    }
}
