package benciu4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int nr = rnd.nextInt(29)+1;

        System.out.println(nr);
        int nr2 = rnd.nextInt(29)+1;

        System.out.println(nr2);

        while (nr2 != 0 ){
            int r = nr % nr2;
            nr= nr2;
            nr2 =r;
        }
        System.out.println("cmmdc: "+ nr);
    }
}
