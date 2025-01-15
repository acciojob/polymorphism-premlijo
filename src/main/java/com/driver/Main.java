package com.driver;

public class Main {
    static class Product {
        public int product(int x, int y) {
            return x * y;
        }
        public int product(int x, int y, int z) {
            return x * y * z;
        }
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        int result1 = p.product(5, 4);
        System.out.println("Product of two integers: " + result1);
        int result2 = p.product(5, 4, 3);
        System.out.println("Product of three integers: " + result2);
        double result3 = p.product(5.5, 4.5);
        System.out.println("Product of two doubles: " + result3);
    }
}