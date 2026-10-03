package exp_package_Strings;

import javax.swing.plaf.IconUIResource;

public class Practice_03 {
    public static void main(String[] args) {
//        String “GoodMorningGoodAfternoonGoodNight”
//        output = “GoodMorningGoodAfternoonBadNight”
//        Replace 3rd good with bad.

        String s = "GoodMorningGoodAfternoonGoodNight";

        String rev = "";
        int count = 0;

        char[] a1 = s.toCharArray();

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == 'G' && a1[i] == 'o' && a1[i] == 'o' && a1[i] == 'd') {
                count++;
                rev = a1[i] + rev;
            }
//            if(count==3){
//                for(int j=0;j<=a1.length;j++) {
//                    a1[j] = 'B';
//                    a1[j + 1] = 'a';
//                    a1[j + 2] = 'd';
//
//                    rev = a1[j] + rev;
//                }
//            }
//        }
            System.out.println(rev);


        }
    }}