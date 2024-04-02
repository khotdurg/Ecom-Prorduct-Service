package LLD1.Immutable.example;

public class Film {
    public static void main(String[] args) {
        BMCM bmcm = new BMCM(1, "movie");
        System.out.println(bmcm.getId()+": "+bmcm.getName());

        BMCM bmcm1 = new BMCM(2, "film");
        System.out.println(bmcm1.getId()+": "+bmcm1.getName());
    }
}
