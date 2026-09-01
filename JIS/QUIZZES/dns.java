import java.util.Arrays;
import java.util.ArrayList;

public class dns {
    private String hostname;

    private ArrayList<String> hostnames = new ArrayList<>(Arrays.asList("localhost", "google.com", "example.com"));
    private ArrayList<String> ips = new ArrayList<>(Arrays.asList(" 127.0.0.1", "142.250.72.14", "7.7.7.7"));

    public dns(String hostnameInput) {
        hostname = hostnameInput;
    }

    public String lookup() {
        int index = hostnames.indexOf(hostname);

        if (index == -1) {
            return "service not on record table. Use register() to add a new service:port pair";
        }

        return ips.get(index);
    }
}