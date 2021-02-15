package Feb15;

public class TillitPyramid
{
    public static void main(String[] args)
    {
        int n = 5;
        for (int i= 0; i<= n-1 ; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print(i+1 +" ");
                if(j!=i )
                    System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i=n-1; i>=0; i--)
        {
            for(int j=0; j <= i-1;j++)
            {
                System.out.print(i+" ");
                if(j!=i-1)
                    System.out.print("* ");
            }
        System.out.println("");
    }
}
}
