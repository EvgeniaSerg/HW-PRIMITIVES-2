public class Main {
    public static void main(String[] args) {

        int initial = 100;
        int replenishment = 1000;
        int bonus;

        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
            int result = initial + replenishment + bonus;

            System.out.println("Бонусные рубли: " + bonus);
            System.out.println("Итоговый счет: " + result);




    }
}