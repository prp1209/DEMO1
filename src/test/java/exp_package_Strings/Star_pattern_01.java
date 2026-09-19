package exp_package_Strings;

public class Star_pattern_01 {
    public static void main(String[] args) {

        // *
        // **
        // ***
        // ****
        // *****

        int row=5;
//        for(int i=0;i<row;i++)
//        {
//            for(int j=0;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Another way to print the same pattern
        // *****
        // ****
        // ***
        // **
        // *

        for(int i=row;i>0;i--)
        {
            for(int j=1;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
