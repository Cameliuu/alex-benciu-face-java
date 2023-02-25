package benciu3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nr= ");
        int divizori=0;
        int nr = scan.nextInt();
        for(int i=2;i<=nr/2;i++)
        {
            if(nr%i==0)
            {
                divizori++;
                System.out.println(i);
            }
        }
        if(divizori==0)
            System.out.println("Nr prim");
    }
}
