package jrod.practice.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class SimpleDateClient {
	public static void main(String[] args) throws IOException {
		Socket client = new Socket("localhost", 9090);
		BufferedReader responseReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
		String response = responseReader.readLine();
		System.out.println("SimpleDateServer response: " + response);

		System.exit(0);
	}
}
