import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(), count1 = 1, sr=0, max=1, i=0;
        int[] mass = new int[size];
       while (i!=size){
           mass[i]=scanner.nextInt();
           if (i==0) sr=mass[i]; else sr=mass[i-1];
           if (mass[i]>sr){
               count1++;
               if (count1>max) max=count1;
           } else count1=1;
           i++;
       }
        if(size!=1){
            System.out.println(max);
        } else System.out.println(1);
    }
}