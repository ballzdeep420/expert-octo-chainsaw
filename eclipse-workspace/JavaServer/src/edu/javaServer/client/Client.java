package edu.javaServer.client;

import java.net.*;
import java.io.*;

public class Client {
	public static void main(String[] args) throws IOException{
		Socket s = new Socket("localhost", 4999);
		
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("Hello from the client!");
		pr.flush();
		
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader br = new BufferedReader(in);
		
		String str = br.readLine();
		System.out.println("server: "+str);
		
	}
}
