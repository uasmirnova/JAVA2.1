public class Main {

    public static void main(String[] args) {

        int cost = 3000; //стоимость билета
        int rublePerMile = 20; // 1 миля за 20 рублей
        int bonus = cost / rublePerMile;

        System.out.println(bonus + " бонусных(ые) миль(ли)");
    }
}
