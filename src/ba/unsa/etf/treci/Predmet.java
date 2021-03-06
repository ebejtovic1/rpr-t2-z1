package ba.unsa.etf.treci;

public class Predmet {
    private String nazivPredmeta;
    private int sifra_Predmeta, brojStudenata;
    private final int max_Br;
    protected Student [] nizStudenata = null;

    public Predmet (String nazivPredmeta, int sifra_Predmeta, int max_Br) {
        this.nazivPredmeta = nazivPredmeta;
        this.sifra_Predmeta = sifra_Predmeta;
        this.brojStudenata = 0;
        this.max_Br = max_Br;
        nizStudenata=new Student[50];
    }

    public String getNazivPredmeta ( ) {
        return nazivPredmeta;
    }

    public void setNazivPredmeta (String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getSifra_Predmeta ( ) {
        return sifra_Predmeta;
    }

    public void setSifra_Predmeta (int sifra_Predmeta) {
        this.sifra_Predmeta = sifra_Predmeta;
    }

    public int getBrojStudenata ( ) {
        return brojStudenata;
    }

    public void setBrojStudenata (int brojStudenata) {
        this.brojStudenata = brojStudenata;
    }

    public int getMax_Br ( ) {
        return max_Br;      
    }
    public void upisiStudenta(Student s){
        if(brojStudenata<max_Br){
            nizStudenata[brojStudenata]=s;
            brojStudenata++;
        }
        else {
            System.out.println("Predmet popunjen");
        }
    }

    public void ispisiStudenta(Student s){

        for(int i=0;i<brojStudenata-1;i++) {
            for(int j=i+1;j<brojStudenata;j++){
                if(s.getIndex()==nizStudenata[i].getIndex())nizStudenata[i]=nizStudenata[j];
            }

        }
        brojStudenata--;
    }
    public void obrisiPredmet() {
        this.nazivPredmeta = null;
        this.sifra_Predmeta = 0;
        this.nizStudenata = null;
        this.brojStudenata = 0;
    }


    @Override
    public String toString() {
        String s="";
        for(int i=0;i<brojStudenata;i++){

        s+= (i+1)+". " + nizStudenata[i].getPrezime() + " " + nizStudenata[i].getIme() + " (" + nizStudenata[i].getIndex() + ")" + "\n";
        }
        return s;
    }
}
