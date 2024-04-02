package LLD1.DesignPattern.Prototype.Example2;

public class Bird implements Cloneable{

    private String name;
    private String mail;
    private String number;

    Bird(String name, String mail, String number) {
        this.name = name;
        this.mail = mail;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Bird cloneBird(){

        return null;
    }
}
