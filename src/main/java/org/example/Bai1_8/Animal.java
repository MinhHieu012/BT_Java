package org.example.Bai1_8;

public class Animal {
    private String name;
    private int numberLeg;
    private String color;

    public void sounding() {
        System.out.println("Hú hú hú!!!");
    }

    public Animal(String name, int numberLeg, String color) {
        this.name = name;
        this.numberLeg = numberLeg;
        this.color = color;
    }

//    // Khai báo phương thức getter để ra lấy dữ liệu của thuộc tính
//    public String getName() {
//        return this.name;
//    }
//
//    public int getNumberLeg() {
//        return this.numberLeg;
//    }
//
//    public String getColor() {
//        return this.color;
//    }
//
//    // Khai báo phương thức setter để gán dữ liệu của thuộc tính
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setNumberLeg(int numberLeg) {
//        this.numberLeg = numberLeg;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
}
