package ba.unsa.etf.treci;

public class Student {

    private String ime, prezime;
    private int index;

    public Student (String ime, String prezime, int index) {
        this.ime = ime;
        this.prezime = prezime;
        this.index = index;
    }

    public String getIme ( ) {
        return ime;
    }

    public void setIme (String ime) {
        this.ime = ime;
    }

    public String getPrezime ( ) {
        return prezime;
    }

    public void setPrezime (String prezime) {
        this.prezime = prezime;
    }

    public int getIndex ( ) {
        return index;
    }

    public void setIndex (int index) {
        this.index = index;
    }
    @Override
    public String toString() {
        return prezime +" "+ ime + " (" + index + ")";
    }
    public void obrisiStudenta() {
        this.ime = "";
        this.prezime = "";
        this.index = 0;
    }




}
