package LLD1.Generics.Implement2;

public class Pair <Type>{
    private Type left;
    private Type right;
    public Pair(Type left, Type right) {
        this.left = left;
        this.right = right;
    }
    public Type getLeft() {
        return left;
    }
    public Type getRight() {
        return right;
    }

    public static void main(String[] args) {
        Pair<String> typePair = new Pair<>("Age", "25");
        String leftValue = typePair.getLeft();
        String rightValue = typePair.getRight();
        System.out.println(leftValue +" "+ rightValue);  // Print Age and 25
    }
}
