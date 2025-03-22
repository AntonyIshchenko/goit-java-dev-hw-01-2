import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        Map<String, String> devInfo = new HashMap<>();
        devInfo.put("name", "Anton");
        devInfo.put("lastName", "Ishchenko");

        System.out.println(new Gson().toJson(devInfo));
    }
}
