package Lesson;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.Date;

public class Lesson {
    // Web Services
    //What is a web service fundamentally?
    //Represenatational state transfer
    // a software system designed to support interoperable machine - to machine
    //interaction over a network
    // web: an enormous interconnected network of resources
    //service: a server-based application or software that exposes a resource to clients
    //web services can provide many different format for resources
    //XML
    //extensible markup language = it's basically HTML with user defined elements
    //XML is used extensively and is widely considered a defacto standard for representing data.
    //XML can be provided as a  resource
    //JSON
    //this is considered the standard for Javascript Resources/
    //in fact, Javascript objects align one-to-one with JSON.
    //JSON is not directly an object, but a direct representation of your resource.
    //there are many for handling web servies
    //terminal tools include cUrl, whois, nslokkup, wget
    //GUI includes Postman,SOAPUI, etc
    //API - Application programming interface.All webservices are API's API's define a standard in which one program
    // can talk to another
    //web service, web server standard and program architecture
    //REST, SOAP, GRAPHQL is the newer standard and best
    //controller is the REST
    //the three big API Web service standards are
    //SOAP
    //REST
    //GraphQL
    //URIs are the way you identify resources
    //URLs are a kind of URI
    //It is possible to write a pure Java Web Service
    //It's really hard and verbose
    //toold and frameworks like Spring and Spring boot ease the pain
    //of writing server code
    public static void main(String[] args) throws IOException {
        //It opens a scoket in computer forport 8080
        //this code utillizes sockets to provide a rudimenatry webservice
        //that service simply returns a data value corresponding with today's date
        final ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080..");
        while (true) {
            try (Socket socket = server.accept()) {
//            Socket socket = server.accept();
//                final Socket client = server.accept();
                Date today = new Date();
                //this string renders static content after the 200 ok message
                //therotically, you can render static web pages via this method
                String httpRespomse = "HTTP/1.1 200 OK\r\n\r\n " + today;
                socket.getOutputStream().write(httpRespomse.getBytes("UTF-8"));



            }
        }
    }
}





