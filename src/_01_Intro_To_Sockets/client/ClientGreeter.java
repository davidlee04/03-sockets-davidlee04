package _01_Intro_To_Sockets.client;

import java.net.*;

import javax.swing.JOptionPane;

import java.io.*;

public class ClientGreeter {

	public static void main(String[] args) {
		// 1. Create a String for the ip address of the server.
		// If you don't know how to find a computer's ip address, ask about ifconfig on
		// linux/mac and ipconfig on windows.
		String ip = "192.168.7.170";
		boolean temp = true;
		int port = 8080;
		try {
			Socket socket = new Socket(ip, port);
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			while (temp) {
				String message = JOptionPane.showInputDialog("Client Message:");
				System.out.println("Client: " + message);
				dos.writeUTF(message);
				System.out.println("Server: " + dis.readUTF());
				// socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
			temp = false;
		}
	}
	// 2. Create an integer for the server's port number

	// 3. Surround steps 4-9 in a try-catch block that catches any IOExceptions.

	// 4. Create an object of the Socket class. When initializing the object, pass
	// in the ip address and the port number

	// 5. Create a DataOutputStream object. When initializing it, use the Socket
	// object you created in step 4 to call the getOutputStream() method.

	// 6. Use the DataOutputStream object to send a message to the server using the
	// writeUTF(String message) method

	// 7. Create a DataInputStream object. When initializing it, use the Server
	// object you created in step 4 to call the getInputStream() method.

	// 8. Use the DataInputStream object to print a message from the server using
	// the readUTF() method.

	// 9. Close the client's server object

	public void start() {

	}
}
