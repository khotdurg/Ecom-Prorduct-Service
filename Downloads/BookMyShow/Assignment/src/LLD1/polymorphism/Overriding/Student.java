package LLD1.polymorphism.Overriding;

public class Student extends User{
    private String batchName;
    private double psp;
    @Override
    public void printUser() {
        System.out.println("Name:" +name+" Email "+ email+ " Batch: "+ batchName+" PSP: "+psp);
    }


}
