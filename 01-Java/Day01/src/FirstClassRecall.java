//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FirstClassRecall {
    public static void main(String[] args) {
        int k=1;

        for (int i = 0; i <= 4; i++)
        {
            for(int j = 1; j<=4-i; j++)
            {
                System.out.print(k);
                System.out.print("\t");
                k++;

            }
            System.out.print("\n");

        }
    }
}