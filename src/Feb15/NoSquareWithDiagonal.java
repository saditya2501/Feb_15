package Feb15;
public class NoSquareWithDiagonal
{
    public static void main(String[] args)
    {
        int x,a; x=5;
        a=1;
        for(int i=1;i<=x;i++)
        {
            for(int j=x;j>=1;j--)
            {
                if(i==a && j==a)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(j);
            }
            System.out.println();
            a++;
        }
    }
}