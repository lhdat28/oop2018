package week3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax(){
        assertEquals(3,Week3.max(2,3));
        assertEquals(5,Week3.max(3,5));
        assertEquals(100,Week3.max(7,100));
        assertEquals(34,Week3.max(0,34));
        assertEquals(55,Week3.max(55,47));
    }
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray(){
        int a[] = {1,2,3,4,5};
        int b[] = {12,25,36,47,56};
        int c[] = {23,54,86,98,4};
        int d[] = {36,54,46,2,12};
        int e[] = {100,32,56,8,7};
        assertEquals(1,Week3.minOfArray(a));
        assertEquals(12,Week3.minOfArray(b));
        assertEquals(4,Week3.minOfArray(c));
        assertEquals(2,Week3.minOfArray(d));
        assertEquals(7,Week3.minOfArray(e));
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCalculateBMI(){
        assertEquals("Beo phi" , Week3.calculateBMI(100,1.78));
        assertEquals("Beo phi" , Week3.calculateBMI(78,1.6));
        assertEquals("Binh thuong" , Week3.calculateBMI(50,1.5));
        assertEquals("Binh thuong" , Week3.calculateBMI(63,1.7));
        assertEquals("Thieu can" , Week3.calculateBMI(39,1.57));

    }

}
