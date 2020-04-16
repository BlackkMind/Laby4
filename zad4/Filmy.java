package laby2;

import java.util.Date;

public class Filmy extends Utwór {
    int dlugosc;


    public Filmy(Date wydanie, String autor,String wydawca, int cena, String tytul, int wielkosc){
        super(wydanie, autor, wydawca, cena, tytul);
        this.dlugosc = dlugosc;
    }
}