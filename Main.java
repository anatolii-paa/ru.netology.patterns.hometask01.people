package ru.netology;

public class Main {
    public static void main(String[] args)  {
        Person father = new PersonBuilder()
                .setName("Anatolii")
                .setSurname("Pavlinov")
                .setAge(39)
                .setAddress("Moscow")
                .build();
        System.out.println(father);
        Person daughter = father.newChildBuilder()
                .setName("Kseniia")
                .setAge(13)
                .build();
        System.out.println(daughter);

        System.out.println("Father " + father + " have daughter " + daughter);

        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder().setAge(-1).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}