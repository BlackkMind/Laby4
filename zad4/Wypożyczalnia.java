package laby2;
import java.util.Date;
import java.util.UUID;
import java.util.ArrayList;

public class Wypożyczalnia {
    ArrayList<Utwór> zbior;
    ArrayList<Klient> listaklientow;

    public void zaplata(long date1, long date2){

        long plac= date2-date1;
        if (plac>=1000){
            long owed = plac/100;
            System.out.println("Trzeba zaplacic "+owed+"zł");
        }
    }
    public Wypożyczalnia(){
        this.zbior = new ArrayList<>();
        this.listaklientow = new ArrayList<>();
    }
    public void add(Utwór x){
        zbior.add(x);
    }
    public void add(Książki x){
        zbior.add(x.utwór);
    }
    public void addUser(Klient x){
        listaklientow.add(x);
    }

    public void showWypożyczalnia() {
        for (Utwór x: this.zbior) {
            System.out.println(x.gTYTUL());
        }
    }
    long wyp(UUID IDu, UUID IDb) {
        Klient user = this.listaklientow.get(0);
        for (Klient x: this.listaklientow) {
            if (x.getID() == IDu) {
                user = x;
            }
        }
        Utwór item = this.zbior.get(0);
        for (Utwór y: this.zbior){
            if (y.getID() == IDb){
                item = y;
            }
        }
        Date rentDate = new Date();
        long date1= rentDate.getTime();

        user.wyp(IDb);
        item.wyp();
        return date1;
    }
    long zwrot (UUID IDu, UUID IDb){
        Klient user = this.listaklientow.get(0);
        for (Klient x: this.listaklientow) {
            if (x.getID() == IDu) {
                user = x;
            }
        }
        Utwór item = this.zbior.get(0);
        for (Utwór y: this.zbior){
            if (y.getID() == IDb){
                item = y;
            }
        }
        Date returnDate = new Date();
        long date2= returnDate.getTime();

        user.zwrot(IDb);
        item.zwrot();
        return date2;
    }


}
