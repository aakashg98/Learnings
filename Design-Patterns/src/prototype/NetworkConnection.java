package prototype;

public class NetworkConnection implements Cloneable {
    private String ip;
    private String data;

    public void loadData() throws InterruptedException {
        this.data = "Data Loaded";
        Thread.sleep(2000);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "data='" + data + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }
}
