public class Main {
    public static void main(String[] args) {

        int price = 20_576;// стоимость билета
        int bonus = 20;// тариф расчета бонусных миль

        int result = price / bonus;

        System.out.println("Расчет бонусных миль: " + result);
    }
}