import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] mass = new int[n][m];
        for (int i =0; i<n;i++){
            for (int j=0;j<m;j++){
                mass[i][j]=scanner.nextInt();
            }
        }
        int iswap = scanner.nextInt();
        int iswap1 = scanner.nextInt();
        int swap=0;
        for (int i =0; i<n;i++){
          swap = mass[i][iswap];
          mass[i][iswap]=mass[i][iswap1];
          mass[i][iswap1]=swap;
        }
        for (int i =0; i<n;i++){
            System.out.println();
            for (int j=0;j<m;j++){
                System.out.print(mass[i][j]+" ");
            }
        }
    }
}