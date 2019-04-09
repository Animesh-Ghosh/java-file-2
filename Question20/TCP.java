import java.net.*;
import java.io.*;

public class TCP {
	public static void Client (String serverName, int port) throws Exception {
      	try {
        	System.out.println ("Connecting to " + serverName + " on port " + port);
        	Socket client = new Socket (serverName, port);
         	System.out.println ("Just connected to " + client.getRemoteSocketAddress ());
         	OutputStream outToServer = client.getOutputStream ();
         	DataOutputStream out = new DataOutputStream (outToServer);
         	out.writeUTF ("Hello from " + client.getLocalSocketAddress ());
         	InputStream inFromServer = client.getInputStream ();
         	DataInputStream in = new DataInputStream (inFromServer);
         	System.out.println ("Server says " + in.readUTF ());
         	client.close ();
      	}
      	catch (IOException e) {
         	System.out.println (e);
      	}
	}
	public static void Server (int port) throws Exception {
      	ServerSocket serverSocket;
      	while (true) {
         	try {
            	serverSocket = new ServerSocket (port);
            	serverSocket.setSoTimeout (60 * 1000);
            	System.out.println ("Waiting for client on port " + 
            		serverSocket.getLocalPort () + "...");
            	Socket server = serverSocket.accept ();
            	System.out.println ("Just connected to " + server.getRemoteSocketAddress ());
            	DataInputStream in = new DataInputStream (server.getInputStream ());
            	System.out.println (in.readUTF ());
            	DataOutputStream out = new DataOutputStream (server.getOutputStream ());
            	out.writeUTF ("Thank you for connecting to " + 
            		server.getLocalSocketAddress () + "\nGoodbye!");
            	server.close();
         	} 
         	catch (SocketTimeoutException s) {
            	System.out.println("Socket timed out!");
            	break;
         	} 
         	catch (IOException e) {
            	System.out.println (e);
            	break;
         	}
		}
	}
	public static void main (String[] args) {
		int port;
		String servername;
		try {
			if (args[0].equals ("server")) { // java TCP server port
				port = Integer.parseInt (args[1]);
				Server (port);
			}
			else if (args[0].equals ("client")) { // java TCP client servername port
				servername = args[1];
				port = Integer.parseInt (args[2]);
				Client (servername, port);
			}
		}
		catch (Exception e) {
			System.out.println (e);
		}
	}
}