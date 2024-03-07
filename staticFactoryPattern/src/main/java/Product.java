public abstract class Product {
    public void same() {
        System.out.println("product");
    }

    public abstract void diff();

    public static Product create(String type) {
        if (type.equals("A")) {
            return new ProductA();
        } else if (type.equals("B")) {
            return new ProductB();
        }
        throw new RuntimeException("invalid type to create Product");
    }
}
