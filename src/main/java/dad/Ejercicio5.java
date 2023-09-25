package dad;

public class Ejercicio5 {

    int solution(int n) {

        int suma = 0;
        for (int i = n; i > 0 ; i -- ){

            int aux = i * 2 - 1 ;

            suma = suma +aux;
        }



        return (suma * 2 ) - (n * 2 - 1)  ;


    }

}
