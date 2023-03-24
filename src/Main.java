public class Main {
    public static void main(String[] args) {
        checkAge(-4);

    }

    public static void checkAge(int age) {
        try {
            check(age);
        } catch (AgeException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static void check(int age) throws AgeException {
        if (age < 0) {
            throw new AgeException("Неверно введен возраст");
        } else if (age < 18) {
            System.out.println("Несовершеннолетний");
        } else System.out.println("Совершеннолетний");
    }
}