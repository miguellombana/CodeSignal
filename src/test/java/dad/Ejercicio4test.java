package dad;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ejercicio4test {

    private Ejercicio4 add;

    @Before

    public void setup(){

        add = new Ejercicio4();

    }


    int[] test1 = {3, 6, -2, -5, 7, 3};
    @Test
    public void test1(){
        assertEquals(21,add.solution( test1));

    }

    int[] test2 = {-1, -2};
    @Test
    public void test2(){
        assertEquals(2,add.solution( test2));

    }

    int[] test3 = {5,1,2,3,1,4};
    @Test
    public void test3(){
        assertEquals(6,add.solution( test3));

    }

    int[] test4 = {1,2,3,0};
    @Test
    public void test4(){
        assertEquals(6,add.solution( test4));

    }
    int[] test5 = {9,5,10,2,24,-1,48};
    @Test
    public void test5(){
        assertEquals(50,add.solution( test5));

    }
    int[] test6 = {5, 6, -4, 2, 3, 2, -23};
    @Test
    public void test6(){
        assertEquals(30,add.solution( test6));

    }
    int[] test7 = {4, 1, 2, 3, 1, 5};
    @Test
    public void test7(){
        assertEquals(6,add.solution( test7));

    }
    int[] test8 = {-23, 4, -3, 8, -12};
    @Test
    public void test8(){
        assertEquals(-12,add.solution( test8));

    }

    int[] test9 = {1, 0, 1, 0, 1000};
    @Test
    public void test9(){
        assertEquals(0,add.solution( test9));

    }







}
