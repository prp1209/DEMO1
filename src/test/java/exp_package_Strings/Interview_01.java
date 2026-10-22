package exp_package_Strings;

public class Interview_01 {

    public static void main(String[] args) {

        // String occurance with the count

        String str="Java";

        String[] s=str.replace(" ","").split("");

        for(int i=0;i<s.length;i++){

            if(s[i].equals("0"))
                continue;
            int count=1;

            for(int j=i+1;j<s.length;j++){
                if(s[i].equals(s[j])){
                    count++;
                    s[j]="0";
                }
            }
            System.out.println("String occurance : " + s[i] + "=" + count);
        }
    }
}
