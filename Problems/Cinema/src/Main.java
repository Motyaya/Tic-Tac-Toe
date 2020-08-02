import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int row = 0;
        int seat = 0;
        int[][] mass = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mass[i][j] = scanner.nextInt();
            }
        }
        int kol = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                    if (mass[i][j] == 0) {
                        seat++;
                    } else{
                        seat = 0;
                    }
                    if (seat == kol) {
                        row = i + 1;
                        break;
                }
            }
            if (seat==kol) break;
                seat = 0;
            }
            System.out.println(row);
    }
}