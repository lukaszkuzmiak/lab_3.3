public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                int result = i * j;
                System.out.printf("%4d", result);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}