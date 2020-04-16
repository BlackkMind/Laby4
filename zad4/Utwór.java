package laby2;


import java.util.Date;
import java.util.UUID;

public class Utwór {
    Date wydanie;
    String autor;
    String wydawca;
    int cena;
    String tytul;
    UUID ID;
    Date datawydania;
    boolean Wypozyczony;
    public Utwór(Date wydanie, String autor, String wydawca, int cena, String tytul){
        this.wydanie = wydanie;
        this.autor = autor;
        this.wydawca = wydawca;
        this.cena = cena;
        this.tytul = tytul;
        this.ID = UUID.randomUUID();

    }





    public void wyp() {
        if (this.Wypozyczony) {
            System.out.println("Wypozyczone:" + this.tytul);
        } else {
            this.Wypozyczony = true;
            this.datawydania = new Date();
        }
    }
    public void zwrot(){
        if (this.Wypozyczony){
            this.Wypozyczony = false;
        }
        else {
            System.out.println("Zwrocona:" + this.tytul);
        }
    }


    public UUID getID() {
        return this.ID;
    }

    public String gTYTUL(){
        return this.tytul;
    }

    public void informacje(){
        System.out.println("tytuł "+this.tytul+"\n"+"wydanie "+this.wydanie+"\n" +"autor  " +this.autor+"\n"+ "wydawca "+ this.wydawca+"\n"+"cena "+ this.cena );
    }

}
