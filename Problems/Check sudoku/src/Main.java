import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean rez = true;
        int[][] mass = new int[n * n][n * n];
        for (int i = 0; i < n * n; i++) {
            for (int j = 0; j < n * n; j++) {
                mass[i][j] = scanner.nextInt();
                if (mass[i][j]<=0 || mass[i][j]>n*n){
                    rez = false;
                }
            }
        }
        for (int i = 0; i < n * n - 1; i++) {
            for (int j = 0; j < n * n - 1; j++) {
                int chislo = mass[i][j];
                for (int m = j + 1; m < n * n; m++) {
                    if (chislo == mass[i][m]) rez = false;
                }
                for (int k = i + 1; k < n * n; k++) {
                    if (chislo == mass[k][j]) rez = false;
                }
                int startRow = i-(i%n);
                int startCol = j-(j%n);
                for (int r=startRow;r<startRow+n;r++){
                    for (int c=startCol;c<startCol+n;c++){
                        if((i!=r || j!=c) && mass[i][j]==mass[r][c]) rez=false;
                    }
                }
            }
        }
        if (rez == true) System.out.println("YES");
        else System.out.println("NO");
    }
}