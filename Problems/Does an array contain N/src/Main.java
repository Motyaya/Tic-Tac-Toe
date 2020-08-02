import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] mass = new int[size];
        for (int i=0; i<size; i++){
            mass[i]=scanner.nextInt();
        }
        int chislo = scanner.nextInt();
        boolean tru = false;
        for (int chisl:mass) {
            if (chislo==chisl){
                tru=true;
            }
        }
        System.out.println(tru);
    }
}