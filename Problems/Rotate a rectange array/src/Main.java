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
        int[][] newmass = new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0, k = n-1; j<n && k>=0;j++,k--){
                newmass[i][j] = mass[k][i];
            }
        }
        for (int i =0; i<m;i++){
            System.out.println();
            for (int j=0;j<n;j++){
                System.out.print(newmass[i][j]+" ");
            }
        }
    }
}