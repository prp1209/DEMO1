package exp_package_Strings;


import java.util.LinkedHashMap;
import java.util.Map;

public class practice_06 {

    public static void main(String[] args) {


        // String s="OProgramming";
        // output :  duplicate char r=2,g=2,m=2;


        String str = "Programming";
        char[] ch=str.toCharArray();
//        Map<Character, Integer> map = new LinkedHashMap<>();
//
//        for (char ch : str.toCharArray()) {
//
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//        System.out.println("Duplicate characters:");
//        for (Map.Entry<Character,Integer> e : map.entrySet()){
//            if(e.getValue()>1){
//                System.out.println(e.getKey() + "=" + e.getValue());
//            }
//        }

        //Approach 2

        // using for loop

        for(int i=0;i<ch.length;i++){
            if(ch[i]=='0')
                continue;
                int count =1;
            for (int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]='0';
                }
            }
            if(count>1)
            System.out.println(ch[i] + "=" + count);
        }
    }
}