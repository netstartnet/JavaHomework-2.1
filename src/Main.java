public class Main {
    public static void main(String[] args) {
        int ticketPrice = 53290;
        int bonusScale = 20;
        int bonusMile = ticketPrice / bonusScale;

        System.out.println("При покупке билета стоимостью " + ticketPrice + " руб., Ваш бонусный счет составит " + bonusMile + " бонус миль.");
    }
}
