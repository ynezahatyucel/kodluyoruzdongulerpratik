package Giris;

import java.util.Scanner;

public class dongulerPratik {

    public static void main(String[] args) {
        int y;
        Scanner inp =new Scanner(System.in);

        System.out.print("Sınır sayısını giriniz : ");
        y=inp.nextInt();

        System.out.println(y +"sayısına kadar 4'ün katları :");
        for (int i=1;i<=y;i*=4){
            System.out.println(i);
        }
        System.out.println(y + "Sayısına kadar 5'in katları :");
        for (int i=1;i<=y;i*=5){
            System.out.println(i);
        }

    }
}