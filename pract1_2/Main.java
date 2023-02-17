package pract1_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int array_size = in.nextInt();
        int[] array = new int[array_size];

        System.out.print("Введите элементы массива: ");
        for(int i = 0; i < array_size; i++){
            array[i] = in.nextInt();
        }

        // Вывод чётных чисел
        System.out.print("Чётные числа: ");
        for(int i = 0; i < array_size; i++){
            if(array[i] % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }
        // Вывод нечётных чисел
        System.out.print("\nНечётные числа: ");
        for(int i = 0; i < array_size; i++){
            if(array[i] % 2 != 0){
                System.out.print(array[i] + " ");
            }
        }
        // Нахождение наибольшего и наименьшего
        int max = array[0];
        int min = array[0];
        for(int i = 1; i < array_size; i++){
            if(array[i] > max){ max = array[i]; }
            if(array[i] < min){ min = array[i]; }
        }
        System.out.println("\nНаибольшее число: " + max);
        System.out.println("Наименьшее число: " + min);
    }
}
