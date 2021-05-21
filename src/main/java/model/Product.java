package model;

public class Product {
    int id;
    String name;

    public static class ProductBuilder {
        private int id = 0;
        private String name = "";

        public ProductBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public ProductBuilder setName(String name){
            this.name = name;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    private Product(ProductBuilder productBuilder) {
        this.id = productBuilder.id;
        this.name = productBuilder.name;
    }

}
