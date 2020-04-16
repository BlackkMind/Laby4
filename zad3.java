package lab4;


import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Scanner;


public class zad3 {

    public static void main(String[] args) {

        int[] tab = new int[10];
		
        int wyb = 0 ;
		
        boolean pow;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 10 cyfr:\n");
        for (int i = 0; i < 10; i++) {
            try {
                System.out.print((i + 1) + ": ");

                tab[i] = Integer.parseInt(scanner.next());

            } catch (NumberFormatException e) {
                System.out.println("Podaj libcze");
                i--;
            }

        }
        System.out.print("podaj ktora liczbe chcesz wyswietlic: ");

        do {
            
			
			try {

                wyb = Integer.parseInt(scanner.next());
                wyb--;
                System.out.println("Liczba o tych danych " + (wyb + 1) + " to " + tab[wyb]);
                pow = false;
           }
		   
		   
		   catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Podaj liczbe:");
                pow = true;

            }
			
			
			catch(NumberFormatException e){
                System.out.println("podaj liczbe");
                pow = true;
            }


        }
		
		while (pow);
    }

}
