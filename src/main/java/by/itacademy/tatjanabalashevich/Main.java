package by.itacademy.tatjanabalashevich;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "Misha";
        user1.password = "Hgf45_!";

        User user2 = new User();
        user2.name = "Nadja";
        user2.password = "Hgf47_!";

        String greetings = "Hello World!";
        System.out.println(greetings);
        System.out.println(user1);
        System.out.println(user2);

        int number = 5;
        String str = "your result is:";
        System.out.println(str + number);
        System.out.println("----------");

        String[] names = {"Alexa", "Maria", "Olga"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("Respected " + names[i] + " - is Good!");
        }

        System.out.println("----------");
        Account account1 = new Account();
        account1.name = "Olga";
        account1.number = 1;
        account1.value = 10;

        Account account2 = new Account();
        account2.name = "Alina";
        account2.number = 2;
        account2.value = 20;

        System.out.println(account1);
        System.out.println(account2);
    }
}
