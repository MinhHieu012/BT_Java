package org.example.Bai1_8;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Husky", 4, "White");
        Dogs dogs = new Dogs("Husky 1", 4, "White");

        Animal animal1 = new Dogs("Husky 2", 4, "White & Black");
        // animal1.sounding();

        // Gọi đến thuộc tính name của animal và name của dogs
        System.out.println(animal.getName() + "\n" + dogs.getName());

        // Comment giải thích tại sau lại gọi được hoặc không gọi được thuộc tính của Animals, Dogs
        /**
         * Ko gọi đến được các thuộc tính như name, numberLeg, color
         * => Vì ko khởi tạo phương thức getter để lấy và gọi đến được các thuộc tính
         * => Khi có phương thức getter để lấy và gọi đến các thuộc tính => Lấy, gọi đến được
         * => Ko lỗi
         */
    }
}