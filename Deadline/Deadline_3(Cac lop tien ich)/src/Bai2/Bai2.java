// Bài 2 (Enum, Random)
// a. Tạo một enum Color có miền giá trị là {RED, ORANGE, YELLOW, GREEN,
// BLUE, INDIGO, VIOLET}.
// b. Tạo một enum Size có miền giá trị là {S,M,L,XL,XXL}
// c. Tạo một class Shirt có 2 thuộc tính là color kiểu Color và size kiểu Size.
// d. Trong hàm main, xây dựng chương trình tạo và xuất ra danh sách N áo- có color và
// size ngẫu nhiên. N là ngẫu nhiên, 5<= N <=15

import java.util.Random;
public class Bai2 {
    public enum Color {
        RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
    }
    public enum Size {
        S, M, L, XL, XXL
    }
    /**
     * Shirt
     */
    public static class Shirt {
        private Color color;
        private Size size;
        public Shirt() {
            Random random = new Random();
            color = Color.values()[random.nextInt(Color.values().length)];
            size = Size.values()[random.nextInt(Size.values().length)];
        }
        @Override
        public String toString() {
            return "Shirt [color=" + color + ", size=" + size + "]";
        }
    }


    public static void main(String[] args) {
        Random random = new Random();
        int N = random.nextInt(11) + 5;
        for (int i = 0; i < N; i++) {
            Shirt shirt = new Shirt();
            System.out.println(shirt.toString());
        }
    }
    
    
}