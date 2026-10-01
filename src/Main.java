//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //Task 2
        System.out.println("task 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        //Task 3
        System.out.println("task 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        //Task 4
        System.out.println("task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //Task 5
        System.out.println("task 5");
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным");
        }
        //Task 6
        System.out.println("task 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i + " ");
        }
        //Task 7
        System.out.println("task 7");
        for (int i = 2; i <= 512; i *= 2) {
            System.out.println(i + " ");
        }
        //Task 8
        System.out.println("task 8");
        int monthSalary = 29000;
        int totalSalary = 0;
        for (int i = 1; i <= 12; i++) {
            totalSalary += monthSalary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSalary + " рублей");
        }
        //Task 9
        System.out.println("task 9");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += total / 100;
            total += salary;
            System.out.println("Месяц " + i + " сумма накоплений равна  рублей " + total);
        }
        //Task 10
        System.out.println("task 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }
        

    }
}
