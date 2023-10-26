package builder;

public class MainBuilder {
       public static void main(String[] args) {
            Product product1 = new Product.ProductBuilder("ABC", 42)
                    .withProperty3("Optional Property")
                    .build();

            Product product2 = new Product.ProductBuilder("XYZ", 17)
                    .build();

            // Accessing properties of the created products
            System.out.println("Product 1: " + product1.getProperty1() + ", " + product1.getProperty2() + ", " + product1.getProperty3());
            System.out.println("Product 2: " + product2.getProperty1() + ", " + product2.getProperty2() + ", " + product2.getProperty3());
        }
    }

