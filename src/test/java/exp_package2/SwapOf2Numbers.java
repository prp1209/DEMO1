package exp_package2;

import javax.sound.midi.Soundbank;

public class SwapOf2Numbers {
    //Java program to swap two numbers without using third variable

    public static void main(String[] args) {

        int n=67;
        int m=87;

        System.out.println("Before Swapping" + " " + n + " " + m);

        n=n+m; // output is 154
        m=n-m; // output is 67
        n=n-m; // output is 87

        System.out.println("After Swapping" + " " + n + " " + m);

    }
}
