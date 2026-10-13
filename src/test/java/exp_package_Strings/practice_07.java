package exp_package_Strings;

public class practice_07 {
    public static void main(String[] args) {


        String s = "Java Programming Java";

        String[] str = s.split(" ");
        int length = str.length;
        System.out.println(length);

        for(int i=0;i<length;i++){
            if(str[i]== "0")
                continue;
            int count=1;
            for(int j=i+1;j<length;j++){
                if(str[i].equals(str[j])){
                    count++;
                    str[j]="0";
                }
            }
            if(count>1){
                System.out.print(str[i]);
            }
        }

    }
}
