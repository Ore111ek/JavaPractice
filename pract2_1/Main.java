package pract2_1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int str_num = in.nextInt();
        String[] array = new String[str_num];

        System.out.print("Введите строки: ");
        in.nextLine();
        for(int i = 0; i < str_num; i++){
            array[i] = in.nextLine();
        }

        // Нахождение самых длинной и короткой
        String max = array[0];
        String min = array[0];
        for(int i = 1; i < str_num; i++){
            if(array[i].length() > max.length()){ max = array[i]; }
            if(array[i].length() < min.length()){ min = array[i]; }
        }
        System.out.println("\nСамая длинная строка: " + max);
        System.out.println("Самая короткая строка: " + min);

        // Упорядочивание
        for(int j = str_num-1; j > 0; j--){
            for(int i = 0; i < j; i++) {
                if (array[i].length() > array[i+1].length()) {
                    String t = array[i];
                    array[i] = array[i+1];
                    array[i+1] = t;
                }
            }
        }

        System.out.print("\nУпорядоченные строки:\n");
        for(int i = 0; i < str_num; i++){
            System.out.print(array[i] + "\n");
        }

        System.out.println("\nРазработал: Арещенков Дмитрий Александрович");
        System.out.println("Задание выдано: 17.02.2023 17:25");
        System.out.println("Задание сдано: " + LocalDate.now() + " " + LocalTime.now());
    }
}
