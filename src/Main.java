public class Main {
    public static void main(String[] args) {
        // task1();
        //task2();
        //task3();
        //task4();
        task5();
    }


    public static void task1() {
        int clientOS = 0;

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }


    public static void task2() {
        int clientOS = 1;
        int clientDeviceYear = 2013;

        if (clientOS == 1 && clientDeviceYear <= 2014) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear <= 2014) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }


    public static void task3() {
        int year = 1600;

        if ((year % 100 != 0 || year % 400 == 0) && (year % 4 == 0)) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");
    }


    public static void task4() {
        int deliveryDistance = 95;
        int deliveryMinDistance = 20;
        int deliveryInterval = 40;
        int deliveryTimeD = 1;

        if (deliveryDistance <= deliveryMinDistance) {
            System.out.println("Потребуется дней: " + deliveryTimeD);
        } else System.out.println("Потребуется дней: " + (deliveryTimeD + (deliveryDistance/deliveryInterval)));
    }


    public static void task5() {
        int monthNumber = 12;

        if ((monthNumber >= 1 && monthNumber <= 2) || (monthNumber == 12))  {
            System.out.println("Зима");
        } else if (monthNumber >= 3 && monthNumber <= 5) {
            System.out.println("Весна");
        } else if (monthNumber >= 6 && monthNumber <= 8) {
            System.out.println("Лето");
        } else if (monthNumber >= 9 && monthNumber <= 11) {
            System.out.println("Осень");
        } else System.out.println("Некорректный номер месяца");
    }



}
