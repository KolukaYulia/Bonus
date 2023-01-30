public class Main {
    public static void main(String[] args) {
        int account = 100;
        int summa = 1001;
        int bonus = 100;


        if (summa > 1000) {
            System.out.println("Итоговый счет:" + (account + summa + summa / bonus));
            System.out.println("Сумма бонусных рублей:" + (summa / bonus));

        } else {
            System.out.println("Итоговый счет:" + (account + summa));
            System.out.println("Бонусы не начислены");
        }


    }
}