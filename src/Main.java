import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    /*
    Найти минимальное чётное число в последовательности положительных чисел или вывести -1,
    если такого числа не существует.
    Оценить временную и пространственную сложность алгоритма.

    Временная сложность алгоритма = O(n)
     */
    int count = 100;
    int[] arrayInt = new int[count]; //O(n)
    for (int i = 0; i < count; i++) { //O(n)
      arrayInt[i] = (int) (Math.random() * (9999 - 1 + 1) + 1); //O(1)
    }

    System.out.println(Arrays.toString(arrayInt)); //O(n)
    int minEven = -1;
    for (int i = 0; i < count; i++) { //O(n)
      if (arrayInt[i] % 2 == 0) { //O(1)
        if (minEven > 0 && minEven > arrayInt[i]) { //O(1)
          minEven = arrayInt[i]; //O(1)
        } else if (minEven < 0) { //O(1)
          minEven = arrayInt[i]; //O(1)
        }
      }
    }
    System.out.println(minEven); //O(1)
  }
  //=O(n)+O(n)+O(n)+O(n) = O(4n) = O(n)
}
