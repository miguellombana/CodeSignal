package dad;

public class Ejercicio4 {
    int solution(int[] inputArray) {

        int maxProduct = inputArray[0] * inputArray[1];

        for (int i = 1; i < inputArray.length - 1; i++) {
            int currentProduct = inputArray[i] * inputArray[i + 1];
            if (currentProduct > maxProduct) {
                maxProduct = currentProduct;
            }
        }
        return maxProduct;
    }
}
