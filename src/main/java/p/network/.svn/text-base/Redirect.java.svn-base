package p.network;

import java.io.*;
import java.net.*;
public class Redirect
{
    public static void main( String args[]) throws Exception
    {
	String destIP = args[1];
	int destPort = Integer.parseInt(args[2]);
	int srcPort = Integer.parseInt(args[0]);
	int count=0;
	ServerSocket svrSocket;
	Socket srcSock, destSock;
	RedirectStream rs1, rs2;
	while(true)
	{
	    //HELLO
		count++;
		svrSocket = new ServerSocket(srcPort,1000);
	
		System.out.println(" Listerning "+ count);
		srcSock = svrSocket.accept();
		System.out.println(" Connected "+ count+" :"+ svrSocket);
		System.out.println(" Connecting "+destIP +","+ count+" :"+ svrSocket);
		destSock  = new Socket (destIP, destPort);
		System.out.println(" Connected "+ count);
		rs1 = new RedirectStream( srcSock.getInputStream(), destSock.getOutputStream(), count);
		rs1.start();
		rs2 = new RedirectStream( destSock.getInputStream(), srcSock.getOutputStream(), 1000000+count);
		rs2.start();

		svrSocket.close();
		svrSocket = null;
	}
    }
}
