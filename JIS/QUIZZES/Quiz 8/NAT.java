import java.util.ArrayList;
import java.util.Arrays;
 
public class NAT {
    ArrayList<String> sourceIps = new ArrayList<>(Arrays.asList("192.168.1.10", "192.168.1.11", "192.168.1.12"));
    ArrayList<Integer> sourcePorts = new ArrayList<>(Arrays.asList(4500, 5100, 5100));
 
    ArrayList<String> transIps = new ArrayList<>(Arrays.asList("203.0.113.55", "203.0.113.55", "203.0.113.55"));
    ArrayList<Integer> transPorts = new ArrayList<>(Arrays.asList(10001, 10002, 10003));

    int count;

    public String get_new_trans(String ip, int port) {
        for (int i = 0; i < sourceIps.size(); i++) {
            if (sourceIps.get(i).equals(ip) && sourcePorts.get(i) == port) {
                return transIps.get(i) + ":" + transPorts.get(i);
            }
        }

        String newIp = "203.0.113.55";
        int newPort = transPorts.get(transPorts.size() - 1) + 1;
 
        sourceIps.add(ip);
        sourcePorts.add(port);
        transIps.add(newIp);
        transPorts.add(newPort);
 
        return newIp + ":" + newPort;
    }
}