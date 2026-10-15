import java.util.Arrays;
import java.util.ArrayList;

public class porter{
    private String service;
    private String ip;

    private ArrayList<String> services =
        new ArrayList<>(Arrays.asList("http", "https", "playstation", "ssh", "ftp", "mysql"));
    
    private ArrayList<Integer> ports = new ArrayList<>(Arrays.asList(80, 443, 3479, 22, 20, 3306));

    public porter (String serviceInput, String ipInput) {
        service = serviceInput;
        ip = ipInput;
    }

    public String build(){
        int index = services.indexOf(service);

        if (index == -1) {
            return "service not on record table. Use register() to add a new service:port pair";
        }

        return ip + ":" + ports.get(index);
    }
}