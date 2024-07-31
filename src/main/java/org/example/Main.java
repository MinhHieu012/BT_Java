package org.example;

import org.example.Bai_1.Shape;
import org.example.Bai_1.oop_encapsulation.CircleEncapsulation;
import org.example.Bai_1.oop_encapsulation.RectangleEncapsulation;
import org.example.Bai_1.oop_encapsulation.SquareEncapsulation;
import org.example.Bai_1.oop_encapsulation.TrapezoidEncapsulation;
import org.example.Bai_1.oop_extends_abstraction.Circle;
import org.example.Bai_1.oop_extends_abstraction.Rectangle;
import org.example.Bai_1.oop_extends_abstraction.Square;
import org.example.Bai_1.oop_extends_abstraction.Trapezoid;
import org.example.Bai_1.oop_polymorphism.CirclePolymorphism;
import org.example.Bai_1.oop_polymorphism.RectanglePolymorphism;
import org.example.Bai_1.oop_polymorphism.SquarePolymorphism;
import org.example.Bai_1.oop_polymorphism.TrapezoidPolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Tạo biến lưu trữ giá trị nhập từ bàn phím
        int numberChooose;

        System.out.println("Choose 1 of 4 OOP Properties:");
        System.out.println("1. Extends & Abstraction");
        System.out.println("2. Encapsulation");
        System.out.println("3. Polymorphism");

        // Tạo đối tượng Scanner để nhận dữ liệu từ keyboard
        Scanner scanner = new Scanner(System.in);
        // Đọc dữ liệu nhận từ bàn phím và ép kiểu sang int và lưu vào biến numberChooose
        numberChooose = Integer.parseInt(scanner.nextLine());

        /**
         * Sử dụng switch-case để bắt từng trường hợp input để hiển thị
         */
        switch (numberChooose) {
            case 1:
                System.out.println("Extends");
                Circle circle = new Circle(4.2,4.3);
                System.out.println("Chu vi hình tròn: " + circle.perimeter());
                System.out.println("Diện tích hình tròn: " + circle.area());

                Square square = new Square(7.1);
                System.out.println("Chu vi hình vuông: " + square.perimeter());
                System.out.println("Diện tích hình vuông: " + square.area());

                Rectangle rectangle = new Rectangle(3.2, 6.7);
                System.out.println("Chu vi hình chữ nhật: " + rectangle.perimeter());
                System.out.println("Diện tích hình chữ nhật: " + rectangle.area());

                Trapezoid trapezoid = new Trapezoid(4, 7, 5, 6, 5);
                System.out.println("Chu vi hình thang: " + trapezoid.perimeter());
                System.out.println("Diện tích hình thang: " + trapezoid.area());

                // Sử dụng break để dừng chạy khi đã hết case 1
                break;

            case 2:
                System.out.println("Encapsulation");
                CircleEncapsulation circleEncapsulation = new CircleEncapsulation(5.2, 6.3);
                System.out.println("Chu vi hình tròn: " + circleEncapsulation.perimeter());
                System.out.println("Diện tích hình tròn: " + circleEncapsulation.area());

                SquareEncapsulation squareEncapsulation = new SquareEncapsulation(5.5);
                System.out.println("Chu vi hình vuông: " + squareEncapsulation.perimeter());
                System.out.println("Diện tích hình vuông: " + squareEncapsulation.area());

                RectangleEncapsulation rectangleEncapsulation = new RectangleEncapsulation(5, 8);
                System.out.println("Chu vi hình chữ nhật: " + rectangleEncapsulation.perimeter());
                System.out.println("Diện tích hình chữ nhật: " + rectangleEncapsulation.area());

                TrapezoidEncapsulation trapezoidEncapsulation = new TrapezoidEncapsulation(4, 7, 5, 6, 5);
                System.out.println("Chu vi hình thang: " + trapezoidEncapsulation.perimeter());
                System.out.println("Diện tích hình thang: " + trapezoidEncapsulation.area());

                // Sử dụng break để dừng chạy khi đã hết case 2
                break;

            case 3:
                /**
                 * Sử dụng Shape thay vì CirclePolymorphism
                 * Vì sử dụng CirclePolymorphism => Ko tham chiếu được đến các phương thức, hàm ngoài class đó
                 * Sử dụng Shape vì là class cha được class các con kế thừa
                 * => Sẽ tham chiếu đc đến các phương thức, hàm của các class con đó
                 *
                 * => Thể hiện tính đa hình (circlePolymorphism có nhiều hình thái khác nhau)
                 * => Lúc là hình tròn, lúc là hình vuông, hình chữ nhật, hình thang
                 */
                Shape circlePolymorphism = new CirclePolymorphism(5.3, 10.6);
                System.out.println("Chu vi hình tròn: " + circlePolymorphism.perimeter());
                System.out.println("Diện tích hình tròn: " + circlePolymorphism.area());

                circlePolymorphism = new SquarePolymorphism(11);
                System.out.println("Chu vi hình vuông: " + circlePolymorphism.perimeter());
                System.out.println("Diện tích hình vuông: " + circlePolymorphism.area());

                circlePolymorphism = new RectanglePolymorphism(6, 9);
                System.out.println("Chu vi hình chữ nhật: " + circlePolymorphism.perimeter());
                System.out.println("Diện tích hình chữ nhật: " + circlePolymorphism.area());

                circlePolymorphism = new TrapezoidPolymorphism(4, 7, 5, 6, 5);
                System.out.println("Chu vi hình thang: " + circlePolymorphism.perimeter());
                System.out.println("Diện tích hình thang: " + circlePolymorphism.area());
        }
    }
}