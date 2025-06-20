package RandomClass;

import java.util.Random;
import java.util.Scanner;

public class StrikeGame{
    public static void main(String[] args){
        Random r=new Random();
        Scanner sc=new Scanner(System.in);

        while (true){
            int r1=Math.abs(r.nextInt()) % 9 + 1;
            int r2=Math.abs(r.nextInt()) % 9 + 1;
            int r3=Math.abs(r.nextInt()) % 9 + 1;

            System.out.println("Enter three numbers: ");
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int n3=sc.nextInt();
            sc.nextLine(); 

            int strikes=0,goals=0;

            if (n1==r1) 
                strikes++;
            if (n2==r2)
                strikes++;
            if (n3==r3) 
                strikes++;

            if (n1==r2 || n1== r3)
                goals++;
            if (n2==r1 || n2==r3)
                goals++;
            if (n3==r1 || n3==r2)
                goals++;

            System.out.println(strikes+" Strike "+goals+ " Goals");

            System.out.println("To continue press -> y \nTo exit press n : ");
            String s=sc.nextLine();

            if(s.equalsIgnoreCase("n")){
                System.out.println("Game Over");
                break;
            }
        }
        sc.close();
    }
}
