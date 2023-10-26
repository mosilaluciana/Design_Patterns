package builder;

class Product {
    private String property1;
    private int property2;
    private String property3;

    private Product(ProductBuilder builder) {
        this.property1 = builder.property1;
        this.property2 = builder.property2;
        this.property3 = builder.property3;
    }

    public String getProperty1() {
        return property1;
    }

    public int getProperty2() {
        return property2;
    }

    public String getProperty3() {
        return property3;
    }

    static class ProductBuilder {
        private String property1;
        private int property2;
        private String property3;

        public ProductBuilder(String property1, int property2) {
            this.property1 = property1;
            this.property2 = property2;
        }

        public ProductBuilder withProperty3(String property3) {
            this.property3 = property3;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}