import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(), index=0, max=0;
        int[] mass = new int[size];
        for (int i = 0; i<size;i++){
            mass[i]=scanner.nextInt();
            if (mass[i]>max){
                max=mass[i];
                index=i;
            }
        }
        System.out.println(index);
    }
}