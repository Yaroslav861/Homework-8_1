public class Main {
    public static void main(String[] args){
        task1();
        task2();
        task3();

    }

    private static void task1() {
        System.out.println("Задание 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName + ".");
    }

    private static void task2() {
        System.out.println("Задание 3");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        String uppFullName = fullName.toUpperCase();
        System.out.println("ФИО сотрудника - " + uppFullName + ".");
    }

    private static void task3() {
        System.out.println("Задание 4");
        String fullName = "Иванов Семён Семёнович";
        System.out.println(fullName);
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName + ".");

    }
}