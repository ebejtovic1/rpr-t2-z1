package ba.unsa.etf.treci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getIme ( ) {
        Student s1 = new Student("Elma","Bejtovic",17770);
        assertEquals("Elma",s1.getIme() );
    }

    @Test
    void setIme ( ) {
        Student s1 = new Student("ElmaElma","Bejtovic",17770);
        s1.setIme("Elma");
        assertEquals("Elma",s1.getIme() );
    }

    @Test
    void getPrezime ( ) {
        Student s1 = new Student("Elma","Bejtovic",17770);
        assertEquals("Bejtovic",s1.getPrezime() );
    }

    @Test
    void setPrezime ( ) {
        Student s1 = new Student("Elma","ElmaBejtovic",17770);
        s1.setPrezime("Bejtovic");
        assertEquals("Bejtovic",s1.getPrezime() );
    }

    @Test
    void getIndex ( ) {
        Student s1 = new Student("Elma","Bejtovic",17770);
        assertEquals(17770,s1.getIndex() );
    }

    @Test
    void setIndex ( ) {
        Student s1 = new Student("Elma","Bejtovic",10);
        s1.setIndex(17770);
        assertEquals(17770,s1.getIndex() );
    }
}