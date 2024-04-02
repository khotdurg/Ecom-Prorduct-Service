package LLD1.Generics.Implement5;

public class Pair<L, R> {
    private L left;
    private R right;
    public Pair(L left, R right) {
        if (left == null || right == null) {
            throw new IllegalArgumentException("Left and right values cannot be null");
        }
        this.left = left;
        this.right = right;
    }
    public L getLeft() {
        return left;
    }
    public R getRight() {
        return right;
    }
}