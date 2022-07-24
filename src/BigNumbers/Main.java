package BigNumbers;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {
    public static void main (String[] args) {

        //EJERCICIO 1
        //Con setScale escojo la precisión de decimales
        BigDecimal number3 = new BigDecimal("4.2545");
        BigDecimal displayVal = number3.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(displayVal);

        //EJERCICIO 2
        BigDecimal number4 = new BigDecimal("1.2345");
        BigDecimal displayVal2 = number4.setScale(1, RoundingMode.HALF_EVEN);
        System.out.println(displayVal2.negate());



    }
}


