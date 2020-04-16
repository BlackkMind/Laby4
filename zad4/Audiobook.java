package laby2;

import java.util.Date;

public class Audiobook extends Utwór {
    int dlugosc;
    int wielkosc;
    public Audiobook(Date wydanie, String autor, String wydawca, int cena, String tytul,int dlugosc, int wielkosc)
    {
        super(wydanie, autor, wydawca, cena, tytul);
        this.dlugosc = dlugosc;
        this.wielkosc = wielkosc;
    }
}