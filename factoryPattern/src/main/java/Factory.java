public abstract class Factory {
    public abstract Product create();

    public void product() {
        Product product = create();
        product.product();
    }
}
