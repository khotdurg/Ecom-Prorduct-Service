package LLD1.Generics.Implement4;

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

    public static <L,R> Pair<R, L> swap(Pair<L, R> pair){
        return new Pair<>(pair.getRight(), pair.getLeft());
    }

    public static void main(String[] args) {
        Pair<String, String> pairLR = new Pair<>("hello", "Word");
        System.out.println("Before swapping: "+ pairLR.getLeft()+", "+ pairLR.getRight());

        Pair<String, String> swappedPair = Pair.swap(pairLR);
        System.out.println("After swapping: "+ swappedPair.getLeft()+", "+ swappedPair.getRight());

    }
}
