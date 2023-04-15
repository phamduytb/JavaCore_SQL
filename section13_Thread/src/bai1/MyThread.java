package bai1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class MyThread extends Thread{
	public void run() {
		try {
			dDOS();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void dDOS() throws IOException {
			
			URL url = new URL("https://www.24h.com.vn/");
	
			HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();
	
			for (int i = 0; i < urlCon.getHeaderFields().size(); i++) {
	
				System.out.println(urlCon.getHeaderFieldKey(i) + "=" + urlCon.getHeaderField(i));
	
			}
	
		}
}
