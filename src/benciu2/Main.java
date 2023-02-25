package benciu2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String path = "D:\\repos\\alex-benciu-face-java\\src\\benciu2\\in.txt";
        String outpath = "D:\\repos\\alex-benciu-face-java\\src\\benciu2\\out.txt";
        float medie = 0;
        int nrel=0;
        int nr=0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        String str;
        try {

            BufferedReader flux_in = new BufferedReader(new FileReader(path));
            BufferedWriter flux_out = new BufferedWriter(new FileWriter(outpath,true));
            while ((str=flux_in.readLine())!= null) {

                nrel++;
                System.out.println(str);
                medie += Float.parseFloat(str);
                if((nr = Integer.parseInt(str)) < min)
                    min = nr;
                if((nr = Integer.parseInt(str)) > max)
                    max = nr;
            }
            medie /= nrel;
            String scrie ="Media este: " + medie + "\n" +"Minimul este: " + min + "\n Maximul este: " + max;
            System.out.println(scrie);
            flux_out.write(scrie);
            flux_out.flush();
            flux_out.close();
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
