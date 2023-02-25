package Cosminutza1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
   static  Random rnd = new Random();
    int[] seq = new int[9];
    public static void main(String[] args) {
        int nr = rnd.nextInt(20);
        System.out.println("Numarul este " + nr);
        for(int i=0;i<9;i++)
            if(fibonacci(i) == nr)
            {
                System.out.println("Numarul " + nr+ " se gaseste in secventa fiboancci");
                return;
            }
        System.out.println("Numarul nu se gaseste in secventa fibonacci");
    }

    public static int fibonacci(int n)
    {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
