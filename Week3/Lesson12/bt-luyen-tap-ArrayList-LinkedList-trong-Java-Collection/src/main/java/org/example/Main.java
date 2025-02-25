package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        // Thêm sản phẩm
        manager.addProduct(new Product(1, "Product A", 75000));
        manager.addProduct(new Product(2, "Product B", 120000));
        manager.addProduct(new Product(3, "Product C", 213000));

        // Hiển thị danh sách sản phẩm
        System.out.println("Danh sách sản phẩm:");
        manager.displayProducts();

        // Sửa sản phẩm
        manager.updateProduct(2, "Updated Product B", 134000);
        System.out.println("Sau khi sửa:");
        manager.displayProducts();

        // Xóa sản phẩm
        manager.deleteProduct(1);
        System.out.println("Sau khi xóa:");
        manager.displayProducts();

        // Tìm kiếm sản phẩm
        System.out.println("Tìm kiếm sản phẩm 'Product C':");
        manager.searchProductByName("Product C")
                .ifPresent(System.out::println);

        // Sắp xếp sản phẩm
        System.out.println("Sắp xếp sản phẩm theo giá tăng dần:");
        manager.sortProductsAscending();
        manager.displayProducts();

        System.out.println("Sắp xếp sản phẩm theo giá giảm dần:");
        manager.sortProductsDescending();
        manager.displayProducts();
    }
}