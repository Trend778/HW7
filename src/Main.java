public class Main {
    public static void main(String[] args) {
        task1_2();
        task3();
    }

    public static void task1_2() {
        String firstName = "Ivan", secondName = "Ivanov", lastName = "Ivanovich", fullName = secondName + " " + firstName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase() +"\n");
    }

    public static void task3() {
        String fullName = "Иванов Семён Семёнович", expectedName=null;
        if (fullName.contains("ё")) {
            expectedName = fullName.replace("ё", "е");
        }
        System.out.println("Данные ФИО сотрудника — " + expectedName );
    }
}