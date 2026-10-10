public class FirstClassReverseString
{
    public static void main (String[] args)
    {
        int k=1;

        for (int i = 1; i < 5; i++)
        {
//            System.out.print("outer loop started");
            for(int j = 1; j<=i; j++)
            {
//                System.out.print("Inner loop");
                System.out.print(k);
                System.out.print("\t");
                k++;

            }
            System.out.print("\n");
//            System.out.print("outer loop Finished");

        }
    }
}