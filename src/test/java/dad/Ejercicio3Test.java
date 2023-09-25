package dad;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Ejercicio3Test {

    private Ejercicio3 add;

    @Before
    public void setup(){

        add = new Ejercicio3();

    }

    @Test

    public void test1(){
        assertEquals(true,add.solution("abba"));

    }

    @Test

    public void test2(){
        assertEquals(false,add.solution("abac"));

    }
    @Test

    public void test3(){
        assertEquals(true,add.solution("a"));

    }
    @Test

    public void test4(){
        assertEquals(false,add.solution("az"));

    }
    @Test

    public void test5(){
        assertEquals(true,add.solution("abacaba"));

    }

    @Test

    public void test6(){
        assertEquals(true,add.solution("z"));

    }
    @Test

    public void test7(){
        assertEquals(false,add.solution("aaabaaaa"));

    }
    @Test

    public void test8(){
        assertEquals(false,add.solution("zzzazzazz"));

    }
    @Test

    public void test9(){
        assertEquals(true,add.solution("hlbeeykoqqqqokyeeblh"));

    }
    @Test

    public void test10(){
        assertEquals(true,add.solution("hlbeeykoqqqokyeeblh"));

    }




}
