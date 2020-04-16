package zad2;

import java.util.Scanner;

public class zad2  {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lit;
        System.out.println("Konwenter lit na liczby \n wpisz LITERY:  ");


                try {
                    lit = Integer.parseInt(scanner.next(), 36);
                    System.out.println("a to twoje literki w formie cyfrto:\n" + lit);
                }
                catch (NumberFormatException e) {
                    System.out.println("wprowadzony został zły format");
                }
            }
    }
