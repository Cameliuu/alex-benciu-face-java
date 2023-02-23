package benciu;

import benciu.Dreptunghi;

import java.util.Scanner;
public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
            System.out.println("Introduceti latimea: ");
            int a=scan.nextInt();
            System.out.println("Introduceti lungimea: ");
            int b = scan.nextInt();
            Dreptunghi d = new Dreptunghi(a,b);
        System.out.println("Perimetrul este : "+d.GetPerimetru() +"\n Aria este :" +d.GetArie());
        }
    }
