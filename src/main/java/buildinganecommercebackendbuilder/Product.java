package buildinganecommercebackendbuilder;

import com.scaler.builderdesignpattern.databaseconfiguration.DatabaseConfiguration;
import lombok.Builder;

public class Product {
        // Required fields
        private final String name;
        private final double price;

        // Optional fields (with default values)
        private final String brand;
        private final String category;
        private final double discount;
        private final int stock;

        // Private constructor – only Builder can call this
        private Product(Builder builder) {
            this.name = builder.name;
            this.price = builder.price;
            this.brand = builder.brand;
            this.category = builder.category;
            this.discount = builder.discount;
            this.stock = builder.stock;
        }

        // Getters
        public String getName() { return name; }
        public double getPrice() { return price; }
        public String getBrand() { return brand; }
        public String getCategory() { return category; }
        public double getDiscount() { return discount; }
        public int getStock() { return stock; }

        // Helper method
        public double discountedPrice() {
            return price - (price * (discount / 100.0));
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", brand='" + brand + '\'' +
                    ", category='" + category + '\'' +
                    ", discount=" + discount +
                    ", stock=" + stock +
                    '}';
        }

        // Nested static Builder class
        public static class Builder {
            // Required
            private final String name;
            private final double price;

            // Optional fields with default values
            private String brand = null;
            private String category = null;
            private double discount = 0.0;
            private int stock = 0;

            // Constructor for required fields
            public Builder(String name, double price) {
                if (name == null || name.trim().isEmpty()) {
                    throw new IllegalArgumentException("Product name is required");
                }
                if (price < 0) {
                    throw new IllegalArgumentException("Price cannot be negative");
                }
                this.name = name;
                this.price = price;
            }

            // Setter-style methods for optional fields
            public Builder brand(String brand) {
                this.brand = brand;
                return this;
            }

            public Builder category(String category) {
                this.category = category;
                return this;
            }

            public Builder discount(double discount) {
                if (discount < 0 || discount > 100) {
                    throw new IllegalArgumentException("Discount must be between 0 and 100");
                }
                this.discount = discount;
                return this;
            }

            public Builder stock(int stock) {
                if (stock < 0) {
                    throw new IllegalArgumentException("Stock cannot be negative");
                }
                this.stock = stock;
                return this;
            }

            // The build() method returns the final Product
            public Product build() {
                return new Product(this);
            }
        }
    }


