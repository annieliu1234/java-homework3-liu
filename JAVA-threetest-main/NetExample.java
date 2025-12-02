



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetExample {

    public static void main(String[] args) {
        String city = "Taipei";
        String apiUrl = "https://wttr.in/" + city + "?format=j1";

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "UTF-8"));

            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

            br.close();
            conn.disconnect();

            String result = sb.toString();
            int maxLen = Math.min(result.length(), 500);

            System.out.println("===== " + city + " 的天氣資料（JSON 前 500 字）=====");
            System.out.println(result.substring(0, maxLen));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
