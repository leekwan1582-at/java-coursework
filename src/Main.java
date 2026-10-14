public class Main {
    public static void main(String[] args) {
        PhysicalProduct p = new PhysicalProduct("Widget", 19.99, "SKU123", 1.5, "10x5x2", 0.08);
        System.out.println(p);
        System.out.println("Sales tax: " + p.calculateSalesTax());
    }
}
