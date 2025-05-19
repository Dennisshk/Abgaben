import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import worksheet5.task3.Fraction;

public class TestFraction {
    private Fraction f1;
    private Fraction f2;

    @BeforeEach
    public void initialize(){
        f1=new Fraction(3,4);
        f2=new Fraction(1,2);
    }
}
