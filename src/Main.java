public class Main {
    public static void main(String[] args) {



        System.out.println("Задача 1");
        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.\n\nЗадача 2");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.\n\nЗадача 2");
        }



        int clientDeviceYear = 2015;

        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.\n\nЗадача 3");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.\n\nЗадача 3");
            }
        } else {
            System.out.println("Для пользователей телефонов 2015 года выпуска и позже нужно обновить приложение.\n\nЗадача 3");
        }



        int year = 2021;

        if (year >= 1584) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным.\n\nЗадача 4");
            } else {
                System.out.println(year + " год не является високосным.\n\nЗадача 4");
            }
        }



        int deliveryDistance = 95;
        int total = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + total + "\n\nЗадача 5");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + total*2 + "\n\nЗадача 5");
        } else if  (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + total*3 + "\n\nЗадача 5");
        } else {
            System.out.println("Свыше 100 км доставки нет.\n\nЗадача 5");
        }



        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println("1-й месяц (он же январь) принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("2-й месяц (он же февраль) принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("3-й месяц (он же март) принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("4-й месяц (он же апрель) принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("5-й месяц (он же май) принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("6-й месяц (он же июнь) принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("7-й месяц (он же июль) принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("8-й месяц (он же август) принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("9-й месяц (он же сентябрь) принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("10-й месяц (он же октябрь) принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("11-й месяц (он же ноябрь) принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("12-й месяц (он же декабрь) принадлежит к сезону зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}