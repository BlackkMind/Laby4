package laby2;
import java.util.Date;
import java.util.UUID;

// public class Książki extends Utwór {
//     int Iloscstron;
//     public Książki(Date wydanie, String autor,String wydawca, int cena, String tytul, int Iloscstron ){
//         super(wydanie, autor,wydawca, cena, tytul);
//         this.Iloscstron = Iloscstron;

//     }
// }

public class Książki {
    public Utwór utwór;
    int Iloscstron;
    public Książki(Date wydanie, String autor,String wydawca, int cena, String tytul, int Iloscstron ){
        utwór = new Utwór(wydanie, autor,wydawca, cena, tytul);
        this.Iloscstron = Iloscstron;

    }

    public void wyp() {
        if (this.utwór.Wypozyczony) {
            System.out.println("Wypozyczone:" + this.utwór.tytul);
        } else {
            this.utwór.Wypozyczony = true;
            this.utwór.datawydania = new Date();
        }
    }
    public void zwrot(){
        if (this.utwór.Wypozyczony){
            this.utwór.Wypozyczony = false;
        }
        else {
            System.out.println("Zwrocona:" + this.utwór.tytul);
        }
    }


    public UUID getID() {
        return this.utwór.ID;
    }

    public String gTYTUL(){
        return this.utwór.tytul;
    }

    public void informacje(){
        System.out.println("tytuł "+this.utwór.tytul+"\n"+"wydanie "+this.utwór.wydanie+"\n" +"autor  " +this.utwór.autor+"\n"+ "wydawca "+ this.utwór.wydawca+"\n"+"cena "+ this.utwór.cena );
    }
}