import java.util.Arrays;
import java.util.ArrayList;

public class filter extends dns {
    private String ip;
    private String hostname;
    private int index;

    private ArrayList<String> whitelist = new ArrayList<>(Arrays.asList("127.0.0.1", "142.250.72.14", "example.com"));

    public filter(String input) {
        super(input);

        index = hostnames.indexOf(input);
 
        if (index != -1) {
            hostname = input;
            ip = ips.get(index);
        } else {
            index = ips.indexOf(input);
            if (index != -1) {
                ip = input;
                hostname = hostnames.get(index);
            }
        }
    }

    public String check() {
        if (index != -1 && whitelist.contains(ip) || whitelist.contains(hostname)) {
            return "accepted ip:" + ip + " hostname:" + hostname;
        }

        return "rejected";
    }

}