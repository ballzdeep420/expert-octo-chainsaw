package edu.javaServer.server;

import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(4999);
		Socket s = ss.accept();
		
		System.out.println("client: connected");
		
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader br = new BufferedReader(in);
		
		String str = br.readLine();
		System.out.println("client: "+str);
		
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("Hello from the server!");
		pr.flush();
	}
}
