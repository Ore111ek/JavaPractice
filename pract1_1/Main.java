package pract1_1;

public class Main {
    public static void main(String[] args) {
        // Приветствие пользователя
        Hello.say_hello();
        // Вывод аргументов командной строки в обратном порядке
        System.out.print("Аргументы командной строки: ");
        for (int i = args.length-1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
    }
}

class Hello{
    public static void say_hello() {
        System.out.println("Приветствую, Пользователь!");
    }
}