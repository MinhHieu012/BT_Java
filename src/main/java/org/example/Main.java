package org.example;

import org.example.Bai_1.oop_encapsulation.CircleEncapsulation;
import org.example.Bai_1.oop_encapsulation.RectangleEncapsulation;
import org.example.Bai_1.oop_encapsulation.SquareEncapsulation;
import org.example.Bai_1.oop_encapsulation.TrapezoidEncapsulation;
import org.example.Bai_1.oop_extends.Circle;
import org.example.Bai_1.oop_extends.Rectangle;
import org.example.Bai_1.oop_extends.Square;
import org.example.Bai_1.oop_extends.Trapezoid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numberChooose;

        System.out.println("Choose 1 of 4 OOP Properties:");
        System.out.println("1. Extends");
        System.out.println("2. Encapsulation");

        // Tạo đối tượng Scanner để nhận dữ liệu từ keyboard
        Scanner scanner = new Scanner(System.in);
        // Đọc dữ liệu nhận từ bàn phím và ép kiểu sang int và lưu vào biến numberChooose
        numberChooose = Integer.parseInt(scanner.nextLine());

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
                break;
        }
    }
}