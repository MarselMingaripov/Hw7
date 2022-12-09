public class Main {
    public static void main(String[] args) {
        task1();
        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
    }
    public static void task1(){
        System.out.println("task 1");
        double total = 0;
        int month = 0;
        while (total <= 2459000){
            total += 15000;
            month++;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        System.out.println();
    }
    public static void task2(){
        System.out.println("task 2");
        int i = 1;
        while (i <= 10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--){
            System.out.print(j + " ");
        }
        System.out.println();
    }
}