package org.friark.mvcore;

import java.io.IOException;
import java.io.InputStream;

public class Utils {

	/**
	 * The classic inputstream slurper
	 * @param in
	 * @return
	 * @throws IOException
	 */
	public static String slurp (InputStream in) throws IOException {
	    StringBuilder out = new StringBuilder();
	    byte[] b = new byte[2048];
	    for (int n; (n = in.read(b)) != -1;) {
	        out.append(new String(b, 0, n));
	    }
	    return out.toString();
	}
	
}
