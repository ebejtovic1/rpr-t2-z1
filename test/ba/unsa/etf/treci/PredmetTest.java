package ba.unsa.etf.treci;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void getNazivPredmeta ( ) {
        Predmet novi= new Predmet("RPR",170,50);
        assertEquals("RPR",novi.getNazivPredmeta());
    }

    @Test
    void setNazivPredmeta ( ) {
        Predmet novi=new Predmet("ASP",120, 40);
        novi.setNazivPredmeta("RPR");
        assertEquals("RPR",novi.getNazivPredmeta());
    }

    @Test
    void getSifra_Predmeta ( ) {
        Predmet novi= new Predmet("RPR",170,50);
        assertEquals(170,novi.getSifra_Predmeta());
    }

    @Test
    void setSifra_Predmeta ( ) {
        Predmet novi=new Predmet("ASP",120, 40);
        novi.setSifra_Predmeta(170);
        assertEquals(170,novi.getSifra_Predmeta());
    }

    @Test
    void getBrojStudenata ( ) {
        Student s = new Student("Elma","Bejtović",17770);
        Student s1 = new Student("Elmaaaa","Bejdddtović",1722770);
        Predmet p =new Predmet("Matematika",10,10);
        p.upisiStudenta(s);
        p.upisiStudenta(s1);
        assertEquals(2,p.getBrojStudenata());
    }

    @Test
    void getMax_Br ( ) {
        Predmet novi=new Predmet("ASP",120, 40);
        assertEquals(40,novi.getMax_Br());
    }

    @Test
    void upisiStudenta ( ) {
        Student s1 = new Student("Elmaaaa","Bejdddtović",1722770);
        Predmet p =new Predmet("Matematika",10,10);
        p.upisiStudenta(s1);
        assertEquals("Elmaaaa",p.nizStudenata[0].getIme());
    }

    void toStringTest(){
        Predmet p = new Predmet("RPR",100,100);
        Student s1 = new Student("Elma","Bejtovic",17770);
        Student s2 = new Student("Anida","Mujezin",17772);
        Student s3 = new Student("Merima","Sehic",17771);
        p.upisiStudenta(s1);
        p.upisiStudenta(s2);
        p.upisiStudenta(s3);
        assertAll("TestiranjeToString",
                () -> assertEquals("1. Bejtovic Elma(17770)\n2. Mujezin Anida(17772)\n3. Sehic Merima (17771)\n", p.toString()),
                () -> assertNotEquals("1. Elma Bejtovic (17770)\n2. Anida Mujezin (17772)\n3. Merima Sehic (17771)\n", p.toString())
        );

    }
}