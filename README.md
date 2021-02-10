# Практична робота "Масиви, вирази, керування виконанням програми", Завданян №2

``` java
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
        int n = (int) Math.ceil(array.length / 2.0) - 1;
        
        for (int i = 0; i < n; i++) {
            array[i] = n - i;
            array[array.length - i - 1] = array[i];
        }
    }
}
```

```java
package test;

import domain.Exercise;
import java.util.Scanner;
import java.util.Arrays;

public class TestResult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        fillArray(array);
        System.out.println("Array: " + Arrays.toString(array));
    }
}
```

###Результат роботы
