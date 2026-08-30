package prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
    private String ip;
    private String data;
    private List<String> domains = new ArrayList<>();

    public void loadData() throws InterruptedException {
        this.data = "Data Loaded";
        domains.add("www.abc.com");
        domains.add("www.xyz.com");
        Thread.sleep(2000);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setData(this.getData());

        for(String domain : this.getDomains()) {
            networkConnection.getDomains().add(domain);
        }
        return networkConnection;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "data='" + data + '\'' +
                ", ip='" + ip + '\'' +
                ", domains=" + domains +
                '}';
    }
}
