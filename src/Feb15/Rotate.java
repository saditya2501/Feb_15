package Feb15;

import java.util.Scanner;

public class Rotate
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int rot=sc.nextInt();

    int n2,r;
    n2=n1;
    int last=0;

    int rev=0;
    int f=0,sum=0;

    while (n1!=0)
    {
        rev=(n1%10);
        n1=n1/10;
        f++;
    }
    r=rot%f;
    System.out.println(r);
    int a=f-r;
    rev=0;
    while(r!=0)
    {
        rev=(n2%10);
        sum=(sum*10)+rev;
        n2=n2/10;
        // System.out.println(sum);
        r--;
    }
    last= (int) (sum*Math.pow(10,a)+n2);
    System.out.println(last);
    }
}

