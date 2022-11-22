package demo.parallel;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class ComplexTest {

    @Test
    void minus() {
        Complex test=new Complex(5,50);
        test=test.minus(new Complex(5,20));
        Assertions.assertTrue(test.getRe()==0&&test.getIm()==30);
    }

    @Test
    void divide() {
        Complex test=new Complex(1,3);
        test=test.divide(new Complex(2,1));
        Assertions.assertTrue(test.getRe()==1&&test.getIm()==1);
    }
}