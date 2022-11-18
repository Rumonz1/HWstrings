public class Main {
    public static void main(String[] args) {
        //Задание 1
        String firstName = "Ivan";
        String secondName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = secondName+" "+firstName+" "+lastName;
        System.out.println("ФИО сотрудника- "+fullName);
        //Задание 2
        String nameBig = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчёта - "+nameBig);
    }
}