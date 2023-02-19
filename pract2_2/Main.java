package pract2_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность матрицы: ");
        int n = in.nextInt();
        Matrix m = new Matrix(n);
        m.output();

        System.out.print("Введите номер (от нуля) столбца для сортировки: ");
        int col_num = in.nextInt();
        m.sort(col_num);
        m.output();

        System.out.print("Введите значение сдвига по горизонтали: ");
        int step = in.nextInt();
        m.shift(step,true); // Пусть сдвиг по горизонтали
        m.output();
    }
}

class Matrix {
    int[][] matrix;
    int n;
    // Инициализировать матрицу случайными числами от -size до size
    public Matrix(int size) {
        n = size;
        matrix = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = (int)(Math.random()*(2*n+1)) - n;
            }
        }
    }
    // Вывести матрицу в консоль
    public void output() {
        System.out.print("Матрица:");
        for(int i = 0; i < n; i++){
            System.out.println();
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
        System.out.println();
    }
    // Отсортировать строки матрицы,
    //   чтобы элементы столбца col_num были по возрастанию
    public void sort(int col_num){
        int j;
        int[] tmp = new int[n];
        for(int i = 0; i < n; i++){
            j = i;
            for(int k = i; k < n; k++){
                if(matrix[j][col_num] > matrix[k][col_num]){
                    j = k;
                }
            }
            tmp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = tmp;
        }
    }
    // Циклический сдвиг вправо/влево (direction = true),
    //                   вверх/вниз (direction = false)
    public void shift(int step, boolean direction){
        int[][] new_m = new int[n][n];
        if(direction) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int prev_j = (j-step)%n;
                    if(prev_j < 0){prev_j += n;}
                    new_m[i][j] = matrix[i][prev_j];
                }
            }
        } else{
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int prev_i = (i-step)%n;
                    if(prev_i < 0){prev_i += n;}
                    new_m[i][j] = matrix[prev_i][j];
                }
            }
        }
        matrix = new_m;
    }
}