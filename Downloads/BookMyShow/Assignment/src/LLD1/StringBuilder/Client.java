package LLD1.StringBuilder;

public class Client {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //same as StingBuilder
        System.out.println(sb.capacity());


        String s = new String("Durgesh");
        System.out.println(s);

        String s1 = new String("Durgesh");
        System.out.println(s1);

        s1.concat("Khot");
        System.out.println(s1);
    }
}

