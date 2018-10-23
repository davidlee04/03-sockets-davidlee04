package _02_Chat_Application;

import java.io.IOException;

import javax.swing.JFrame;

import _01_Intro_To_Sockets.client.ClientGreeter;
import _01_Intro_To_Sockets.server.ServerGreeter;

/*
 * Using the Click_Chat example, write an application that allows a server computer to chat with a client computer.
 */

public class ChatApp {
	ServerGreeter server;
	ClientGreeter client;
	
	public static void main(String[] args) {
		new ChatApp();
	}
	public ChatApp() {
		try {
			server = new ServerGreeter();
			client = new ClientGreeter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		server.run();

	}

}
