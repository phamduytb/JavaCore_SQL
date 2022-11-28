package nsotien.model;/*
java by nsotien tv .......
Name : nsotien
Time : 1:36 PM
Date : 10/29/22
*/

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;

public class Ddos extends Thread {
    public void ddos() throws IOException {
        URL url = new URL("https://www.24h.com.vn/");
        HttpsURLConnection urlCon = (HttpsURLConnection) url.openConnection();

        for (int i = 0; i < urlCon.getHeaderFields().size(); i++) {
            System.out.println(urlCon.getHeaderFieldKey(i) + "=" + urlCon.getHeaderField(i));
        }
    }

    @Override
    public void run() {
        super.run();
        try {
            ddos();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

