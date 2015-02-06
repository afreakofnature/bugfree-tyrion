package jrod.practice.sockets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


public class SimpleDateServer {
	public static void main(String[] args) throws IOException {
		ServerSocket listener = new ServerSocket(9090);
		try {
			while (true) {
				Socket client = listener.accept();
				try {
					PrintWriter response = new PrintWriter(client.getOutputStream(), true);
					response.println(new Date().toString());
				} finally {
					client.close();
				}
			}
		} finally {
			listener.close();
		}
	}
}
