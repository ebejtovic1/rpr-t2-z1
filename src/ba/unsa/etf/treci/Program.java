package ba.unsa.etf.treci;

public class Program {
    public static void main(String[] args) {
        Student s = new Student("Elma","Bejtović",17770);
        Student s1 = new Student("Elmaaaa","Bejdddtović",1722770);
        Predmet p =new Predmet("Matematija",10,10);
        p.upisiStudenta(s);
        p.upisiStudenta(s1);
        p.ispisiStudenta(s1);
        System.out.println(p);
        p=null;
        s=null;
        s1=null;
        System.exit(0);

    }
}
