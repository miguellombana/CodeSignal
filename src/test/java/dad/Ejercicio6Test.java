package dad;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ejercicio6Test {

private Ejercicio6 add;

@Before

    public void setup(){

        add = new Ejercicio6();

    }
    int [] statues1 = {6, 2, 3, 8};
    @Test

    public void test1(){
    assertEquals(3,add.solution(statues1));

    }
    int [] statues2 = {0, 3};
    @Test


    public void test2(){
        assertEquals(2,add.solution(statues2));

    }
    int [] statues3 = {5, 4, 6};
    @Test


    public void test3(){
        assertEquals(-0,add.solution(statues3));

    }
    int [] statues4 = {6, 3};
    @Test

    public void test4(){
        assertEquals(2,add.solution(statues4));

    }
    int [] statues5 = {1};
    @Test
    public void test5(){
        assertEquals(0,add.solution(statues5));

    }
}
