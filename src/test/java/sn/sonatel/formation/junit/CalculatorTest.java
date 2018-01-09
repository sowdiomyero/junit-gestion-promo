package sn.sonatel.formation.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ext_sow18 on 03/01/2018.
 */
public class CalculatorTest {


    @Test
    public void shoudReturn20(){
        int valeurDeRetour = 40/5;
        assertEquals(8, valeurDeRetour);
    }

    @Test
    public void shoudReturn8(){
        int valeurDeRetour = 4*2;
        assertEquals(8, valeurDeRetour);
    }

    @Test
    public void shoudReturnZero(){
        int valeurDeRetour = 4%2;
        assertEquals(0, valeurDeRetour);
    }
}
