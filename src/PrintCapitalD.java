public class PrintCapitalD {
    public static void main(String[] args) {
        int height = 5;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                if (j == 1 || (i == 1 || i == height) && j <= height - 1 || j == height && i != 1 && i != height) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

