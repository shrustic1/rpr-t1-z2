/*
Koristeći IntelliJ IDEA napraviti projekat pod nazivom "rpr-t1-z2".
Napravite program koji na ekranu ispisuje sve brojeve između 1 i n koji su djeljivi sa sumom svojih cifara,
pri čemu se n unosi sa tastature. U programu se obavezno treba nalaziti funkcija sumaCifara.
Po završetku zadatak treba postaviti na GitHub koristeći isključivo funkcionalnosti IntelliJ IDEA okruženja!
Nakon toga, potrebno je da uradite konverziju tog projekta u Maven projekat i da pokrenete iz Command Prompt-a.
* */

import java.util.Scanner;

public class Numbers {
    private static int sumOfDigits (int number){
        int sum=0;
        while(number!=0){
            sum=sum+number%10;
            number=number/10;
        }
        return sum;
    }

    private static boolean isDividableBySumOfDigits(int broj){
        return broj%sumOfDigits(broj)==0;
    }

    private static int[] getDigits(int number){
        int numberOfDigits = String.valueOf(number).length();
        int[] digits = new int[numberOfDigits];
        int i=0;
        while(number!=0){
            digits[i++]=number%10;
            number=number/10;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter integer number: ");
        int n = scanner.nextInt();
        int i;
        for (i=1; i<n; i++){
            if (isDividableBySumOfDigits(i)) System.out.println(i);
        }
    }
}