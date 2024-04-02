package LLD1.DesignPattern.Prototype.Example1;
//to call clone object we must implement cloneable
public class NetworkConnection implements Cloneable{
    private String ip;
    private String importantData;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadVeryImportantData() throws InterruptedException {
        this.importantData = "very very important data";
        Thread.sleep(5000);
        //it will take 5 min
    }

    @Override
    public String toString() {
        return this.ip + ": "+ this.importantData;
    }

    @Override //for call objedct we override clone
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
