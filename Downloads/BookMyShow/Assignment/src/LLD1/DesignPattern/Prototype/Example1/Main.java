package LLD1.DesignPattern.Prototype.Example1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        NetworkConnection networkConnection = new NetworkConnection();//object
        //load important data
        networkConnection.setIp("192.167.1");
        networkConnection.loadVeryImportantData();
        System.out.println(networkConnection);

        try{
            NetworkConnection networkConnection1 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection1);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
