package dad;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Ejercicio2Test {

    private Ejercicio2 add;

    @Before

    public void setup(){

        add = new Ejercicio2();

    }

    @Test

    public void test1(){
        assertEquals(20,add.solution(1905));

    }
    @Test
    public void test2(){
        assertEquals(17,add.solution(1700));

    }
    @Test
    public void test3(){
        assertEquals(20,add.solution(1988));

    }
    @Test
    public void test4(){
        assertEquals(20,add.solution(2000));

    }
    @Test
    public void test5(){
        assertEquals(21,add.solution(2001));

    }
    @Test
    public void test6(){
        assertEquals(2,add.solution(200));

    }
}
