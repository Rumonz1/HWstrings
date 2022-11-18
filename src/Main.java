public class Main {
    public static void main(String[] args) {
        //Задание 1
        String firstName = "Семён";
        String secondName = "Иванов";
        String lastName = "Семёнович";
        String fullName = secondName+" "+firstName+" "+lastName;
        fullName = fullName.replace("ё","е");
        System.out.println("ФИО сотрудника- "+fullName);
        //Задание 2
        String nameBig = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчёта - "+nameBig);
        //Задание 3
    }
}