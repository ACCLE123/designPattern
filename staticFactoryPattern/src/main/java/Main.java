public class Main {
    public static void main(String[] args) {
        Product a = Product.create("A");
        Product b = Product.create("B");

        a.same();
        b.same();
        a.diff();
        b.diff();

    }
}
