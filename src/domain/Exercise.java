package domain;
/**
 * Class that represent an exercise
 * @author DevShade
 */
public class Exercise {
    
    /**
     * Method that fills the array
     * @param array integer array
     */
    public static void fillArray(int[] array){
        int a = (int) Math.ceil(array.length / 2.0) - 1;
        
        for (int i = 0; i < a; i++) {
            array[i] = a - i;
            array[array.length - i - 1] = array[i];
        }
    }
}
