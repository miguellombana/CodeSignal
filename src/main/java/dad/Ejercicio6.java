package dad;

import java.util.Arrays;

public class Ejercicio6 {

    int solution(int[] statues) {

        int num = statues.length;

        Arrays.sort(statues);

        int small = statues[0];
        int big = statues[num-1];
        return big -small - num + 1;


    }
}
