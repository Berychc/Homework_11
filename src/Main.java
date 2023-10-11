public class Main {

    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();

    } public static void task1() {
        int year = 2020;
        checkLeapYear(year);

    } public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.printf("%d год — високосный год",year);
        } else {
            System.out.printf("%d год — невисокосный год",year);
        }

    } public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2010;
        suggestAppVersion(clientOS, clientDeviceYear);

    } public static void suggestAppVersion(int clientOS, int clientDeviceYear) {
        int currentYear = 2013;
        if (clientDeviceYear < currentYear) {
            if (clientDeviceYear < 2015 && clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientDeviceYear < 2015 && clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Error!");
            }
        } else {
            System.out.println("У вас уже установлена последняя версия приложения.");
        }

    } public static void task3() {
        int deliveryDistance = 95;
        int deliveryTime = deliveryTimeCalculator(deliveryDistance);
        System.out.printf("Потребуется дней: %d", deliveryTime);

    } public static int deliveryTimeCalculator(int deliveryDistance) {
        int deliveryTime = 0;
        if (deliveryDistance < 20) {
            deliveryTime = 1;
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            deliveryTime = 2;
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            deliveryTime = 3;
        } else {
            System.out.println("Доставки нету!");
        }
        return deliveryTime;
    }
}
