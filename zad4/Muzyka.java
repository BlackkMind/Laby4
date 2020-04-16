package laby2;


import java.util.Date;

public class Muzyka extends Utwór {
    int wielkosc;

    public Muzyka(Date wydanie, String autor,String wydawca, int cena, String tytul, int wielkosc){
        super(wydanie, autor, wydawca, cena, tytul);
        this.wielkosc = wielkosc;
    }
}