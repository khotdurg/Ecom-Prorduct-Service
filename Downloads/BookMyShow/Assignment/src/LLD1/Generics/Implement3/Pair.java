package LLD1.Generics.Implement3;

public class Pair <L, R>{
    private L left;
    private R right;
    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }
    public L getLeft() {
        return left;
    }
    public R getRight() {
        return right;
    }

    public static void main(String[] args) {
        Pair<String, Double> pairLR = new Pair<>("Bhindi", 30.10);
        String leftValue = pairLR.left;
        double rightValue = pairLR.right;
        System.out.println(leftValue +" "+ rightValue); // we can change any no if we dont want Bhindi and 30.10
    }
}
