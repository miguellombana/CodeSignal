package dad;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ejercicio5Test {

private Ejercicio5 add;

@Before

    public void setup(){

        add = new Ejercicio5();

    }
    @Test

    public void test1(){
    assertEquals(5,add.solution(2));

    }
    @Test
    public void test2(){
        assertEquals(13,add.solution(3));

    }
    @Test
    public void test3(){
        assertEquals(1,add.solution(1));

    }
    @Test
    public void test4(){
        assertEquals(41,add.solution(5));

    }
    @Test
    public void test5(){
        assertEquals(97986001,add.solution(7000));

    }
    @Test
    public void test6(){
        assertEquals(127984001,add.solution(8000));

    }
    @Test
    public void test7(){
        assertEquals(199940005,add.solution(9999));

    }
    @Test
    public void test8(){
        assertEquals(199900013,add.solution(9998));

    }
    @Test
    public void test9(){
        assertEquals(161946005,add.solution(8999));

    }
}
