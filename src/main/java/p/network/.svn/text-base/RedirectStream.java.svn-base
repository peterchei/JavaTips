package p.network;

import java.io.*;

public class RedirectStream extends Thread
{
    private InputStream in;
    private OutputStream out;
    private int ID;
    RedirectStream( InputStream i_in, OutputStream i_out, int i_ID)
    {
	ID = i_ID;
	in = i_in;
	out = i_out;
	setPriority(1);
    }
    public void run()
    {
	System.out.println("Start "+ID);
	try
	{
	    int l_length = 0;
	    byte[] l_buf = new byte[1024*34];
	    while( l_length >= 0)
	    {
	        l_buf = new byte[1024*34];
	        l_length = in.read(l_buf);

		System.out.print(".");
	        if ( l_length > 0)
	        {
       	      //  	System.out.print(">"+l_length);
	        //	System.out.print(">"+new String (l_buf,0,l_length));
		    out.write(l_buf, 0,l_length);
		    out.flush();
	        }
                l_buf = null;

	    }
	    in.close();
       	    out.close();
	    in = null;
	    out = null;
	}catch(Exception e)
	{
		System.out.println("RedirectStream "+ ID +" run() Exception:"+e);
	}
	System.out.println("End " + ID);
    }
}
