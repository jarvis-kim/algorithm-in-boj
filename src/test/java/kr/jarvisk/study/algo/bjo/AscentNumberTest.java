package kr.jarvisk.study.algo.bjo;

import kr.jarvisk.study.algo.bjo.a11057_AscentNumber.AscentNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AscentNumberTest {

    @Test
    public void test() {
        assertEquals(10, AscentNumber.solve(1));
        assertEquals(55, AscentNumber.solve(2));
        assertEquals(220, AscentNumber.solve(3));
    }
}