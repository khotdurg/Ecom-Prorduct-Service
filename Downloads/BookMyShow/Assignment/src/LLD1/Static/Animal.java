package LLD1.Static;

public class Animal {
    static int a;
    int b;

    static {
        System.out.println("static block");
        a =10;
       // b=20;// here i am not able to call non static variable in static block
    }

    public static void dog(String name){
        System.out.println(name);
    }


    static class Tiger{  //static class
        private static String sher = "jungle ka raja";
        public void display(){
            System.out.println(sher);
        }
    }

    public static void main(String[] args) {
        Animal.Tiger praani = new Animal.Tiger();
        praani.display();
    }

}
