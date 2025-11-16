package buildinganecommercebackendbuilder;

public class MainApp {
    public static void main(String[] args) {
        Product laptop = new Product.Builder("Laptop", 85000.0)
                .brand("Dell")
                .category("Electronics")
                .discount(10.0)
                .stock(25)
                .build();

        Product book = new Product.Builder("System Design Book", 799.0)
                .category("Books")
                .build();

        System.out.println(laptop);
        System.out.println("Laptop discounted price: " + laptop.discountedPrice());
        System.out.println(book);
    }

}
