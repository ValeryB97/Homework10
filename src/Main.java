public class Main {
    public static void main(String[] args) {
        // Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        // Задание 2
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        // Задание 3
        String firstName1 = "Семён";
        String middleName1 = "Семёнович";
        String lastName1 = "Иванов";
        String fullName1 = lastName1 + " " + firstName1 + " " + middleName1;
        String fullNameTrue = fullName1.replace('ё', 'е');
        System.out.println("Данные Ф.И.О. сотрудника — " + fullNameTrue);
    }
}