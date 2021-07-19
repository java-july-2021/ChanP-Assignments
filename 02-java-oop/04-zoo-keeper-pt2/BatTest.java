public class BatTest {
    public static void main(String[] args) {
        Bat terror = new Bat(300);
        terror.attackTown();
        terror.attackTown();
        terror.attackTown();
        terror.eatHumans();
        terror.eatHumans();
        terror.fly();
        terror.fly();
        System.out.println("Terror's Energy level: " + terror.energylevel);
    }
}