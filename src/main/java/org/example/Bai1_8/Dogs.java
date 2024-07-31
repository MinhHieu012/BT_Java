package org.example.Bai1_8;

public class Dogs extends Animal {
    /**
     * Khai báo hàm khởi tạo constructor cho Dogs
     * Vì là class con kế thừa từ animal
     * => Khởi tạo constructor => Sử dụng super để tham chiếu đến các thuộc tính của class cha
     *
     * => Nếu ko tự khởi tạo -> Java tự tạo constructor mặc định ko tham số => Lỗi
     * => Vì class cha có constructor có tham số
     */
    public Dogs(String name, int numberLeg, String color) {
        super(name, numberLeg, color);
    }

    // Ghi đè triển khai lại phương thức của class cha cho class con
    @Override
    public void sounding() {
        System.out.println("Gâu gâu gâu!!!");
    }

    // Overload nạp chồng - Cùng tên hàm khác tham số
    public String sounding(String randomString) {
        return randomString;
    }
}
