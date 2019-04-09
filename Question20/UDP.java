import java.io.*;
import java.net.*;

class UDP {
	static int serverPort = 666, clientPort = 999, buffer_size = 1024;
	static DatagramSocket ds;
	static byte buffer[] = new byte[buffer_size];
	public static void Server () throws Exception {
		int pos = 0;
		while (true) {
			int c = System.in.read ();
			switch (c) {
				case -1:
					System.out.println ("Server Quits.");
					return;
				case '\n':
					ds.send (new DatagramPacket (buffer, pos, 
						InetAddress.getLocalHost (), clientPort));
					pos = 0;
					break;
				default:
					buffer[pos++] = (byte) c;
			}
		}
	}
	public static void Client() throws Exception {
		while (true) {
			DatagramPacket p = new DatagramPacket (buffer, buffer.length);
			ds.receive (p);
			System.out.println (new String (p.getData(), 0, p.getLength ()));
		}
	}
	public static void main (String args[]) throws Exception { // UDP server|client
		try {
			if (args[0].equals ("server")) {
				ds = new DatagramSocket (serverPort);
				Server ();
			} 
			else if (args[0].equals ("client")) {
				ds = new DatagramSocket (clientPort);
				Client ();
			}
		}
		catch (Exception e) {
			System.out.println (e);
		}
	}
}