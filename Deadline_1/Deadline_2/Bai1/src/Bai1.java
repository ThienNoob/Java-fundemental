// 1. Xây dựng lớp Point2D biểu diễn điểm trong mặt phẳng 2 chiều và
// các phương thức khởi tạo, lấy và thiết lập giá trị các thuộc tính, di
// chuyển, tính khoảng cách giữa 2 điểm, nhập, xuất. Trong hàm
// main cho phép nhập vào 2 điểm và một vector (để di chuyển) và
// xuất ra kết quả của việc di chuyển các điểm và khoảng cách giữa
// 2 điểm.
import java.util.Scanner;

class Point2D {
    private Double x, y;

    Point2D() {
        x = (double) 0;
        y = (double) 0;
    }

    Point2D(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public void inputPoint() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x, y: ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
    }

    public void displayPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public void movePoint(Double X, Double Y) {
        x += X;
        y += Y;
    }

    public Double distanceTo(Point2D point2d) {
        Double X = x - point2d.getX();
        Double Y = y - point2d.getY();
        return Math.sqrt(X * X + Y * Y);
    }

}

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input point A: ");
        Point2D pointA = new Point2D();
        pointA.inputPoint();

        System.out.println("Input point B: ");
        Point2D pointB = new Point2D();
        pointB.inputPoint();

        System.out.println("Input vector: ");
        Double xVector = scanner.nextDouble();
        Double yVector = scanner.nextDouble();

        // Di chuyển
        System.out.println("Point A before moving: ");
        pointA.displayPoint();
        pointA.movePoint(xVector, yVector);
        System.out.println("Point A after moving: ");
        pointA.displayPoint();

        System.out.println("Point B before moving: ");
        pointB.displayPoint();
        pointB.movePoint(xVector, yVector);
        System.out.println("Point B after moving: ");
        pointB.displayPoint();

        // Khoảng cách
        System.out.println("Distance between pointA and pointB is " + String.format("%.2f", pointA.distanceTo(pointB)));

    }

}