public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
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
        System.out.println();
    }
    public static void task3(){
        System.out.println("task 3");
        int bornPer1000 = 17;
        int deathPer1000 = 8;
        int population = 12000000;
        for (int i = 1; i <= 10; i++){
            population = population + (population / 1000) * bornPer1000 - (population / 1000) * deathPer1000;
            System.out.println("Год " + i + " численность населения составляет " + population);
        }
        System.out.println();
    }
    public static void task4(){
        System.out.println("task 4");
        double total = 15000;
        int month = 0;
        while (total <= 12000000){
            total = total + total * 0.07;
            month++;
            System.out.println("Месяц "+ month + " сумма накоплений " + total);
        }
        System.out.println(month + " месяцев для накопления 12000000");
        System.out.println();
    }
    public static void task5(){
        System.out.println("task 5");
        double total = 15000;
        int month = 0;
        while (total <= 12000000){
            total = total + total * 0.07;
            month++;
            if (month % 6 == 0)
                System.out.println("Месяц "+ month + " сумма накоплений " + total);
        }
        System.out.println(month + " месяцев для накопления 12000000");
        System.out.println();
    }
    public static void task6(){
        System.out.println("task6");
        double total = 15000;
        double percent = 0.07;
        int month = 0;
        int monthTotal = 9 * 12;
        while (month <= monthTotal) {
            total = total + total * percent;
            month++;
            if (month % 6 == 0) {
                System.out.print(total + " ");
                if (month == monthTotal / 2)
                    System.out.println();
            }
        }
        System.out.println();
    }

}