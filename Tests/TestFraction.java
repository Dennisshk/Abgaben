import org.junit.jupiter.api.*;
import worksheet5.task3.Fraction;

import static org.junit.jupiter.api.Assertions.*;

public class TestFraction {
    private Fraction f1;
    private Fraction f2;

    @BeforeEach
    public void initialize(){
        f1=new Fraction(3,4);
        f2=new Fraction(1,2);
    }
    @AfterEach
    public void afterEach(){
        f1=null;
        f2=null;
    }


    @Test
    @DisplayName("Nenner darf nicht 0 sein")
    @Disabled("Es muss auf 0 geprüft werden")
    public void constructor(){
        assertThrows(IllegalArgumentException.class, () -> new Fraction(2,0));
        assertThrows(IllegalArgumentException.class, () -> new Fraction(0,0));
    }


    @Test
    @Disabled("Es wird auf das falsche Objekt zugegriffen")
    public void multiplikation(){
        f1.multiplikation(f2);
        //same ist mit ==
        assertSame(3,f1.getZaehler());
        assertSame(8,f1.getNenner());
    }


    @Test
    @Disabled("Zähler überschreibt Nenner")
    public void kehrwert(){
        f1.Kehrwert();
        assertEquals(4,f1.getZaehler());
        assertEquals(3,f1.getNenner());
    }

    @Test
    public void kehrwert2(){
        f2.setNenner(1);
        f2.Kehrwert();
        assertEquals(1,f2.getZaehler());
        assertEquals(1,f2.getNenner());
    }

    @Test
    @Disabled("neuer Zähler wird zu spät initialisiert")
    public void addition(){
        f1.addition(f2);
        assertEquals(5,f1.getZaehler());
        assertEquals(4,f1.getNenner());
    }

    @Test
    public void addition2(){
        f2.setNenner(4);
        f1.addition(f2);
        assertTrue(4==f1.getZaehler()||1==f1.getZaehler());
        assertTrue(4==f1.getNenner()||1==f1.getNenner());
    }

   @Test
   @Disabled("Mal statt geteilt")
    public void kuerzen(){
        Fraction f3 = new Fraction(5,10);
        f3.kuerzen();
        assertSame(1,f3.getZaehler());
        assertSame(2,f3.getNenner());
   }

    @Test
    @Disabled("Mal statt geteilt")
    public void kuerzen2(){
        Fraction f3 = new Fraction(21,7);
        f3.kuerzen();
        assertSame(3,f3.getZaehler());
        assertSame(1,f3.getNenner());
    }

    @Test
    @Timeout(10000)
    @Disabled("Mal statt geteilt")
    public void kuerzen3(){
        Fraction f3 = new Fraction(10,10);
        f3.kuerzen();
        assertSame(1,f3.getZaehler());
        assertSame(1,f3.getNenner());
    }
}







