package com.Bridgelabz ;
import java.util.Scanner ;

public class ArmstrongNo {
    public static void main (String[] args) {
        int n, z, count = 0, pro, digit , i , sum = 0 ;
        System.out.println("********************************************");
        System.out.println(" Welcome to Armstrong Number.....");
        System.out.println("********************************************");

        System.out.println(" Please Enter A Number = ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        z = n;
        while (z > 0)
        {
            count = count + 1;
            z = z / 10;
        }

        z = n ;
        while ( z > 0)
        {
            digit = z % 10 ;
              pro = 1 ;

            for (i=1 ; i <= count; i++)
            {
                pro = pro * digit ;


            }
            sum = sum + pro ;
            z = z/10 ;
        }
        if ( n == sum )

            System.out.println("Given Number Is A Armstrong Number.");

        else

            System.out.println("Given Number Is Not A Armstrong Number.");



    }
}
