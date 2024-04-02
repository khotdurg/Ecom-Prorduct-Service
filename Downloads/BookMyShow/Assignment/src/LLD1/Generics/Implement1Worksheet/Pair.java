package LLD1.Generics.Implement1Worksheet;
// this class is only storing string type data
public class Pair {
    private String left;
    private String right;
    public Pair(String left, String right) {
        this.left = left;
        this.right = right;
    }
    public String getLeft() {
        return left;
    }
    public String getRight() {
        return right;
    }

    public static void main(String[] args) {
        Pair stringPair = new Pair("Hello", "India");
        //Pair stringPair1 = new Pair(1, 2); // Integer type data not accepted getting error
        System.out.println(stringPair.left +" "+ stringPair.right);
    }
}
