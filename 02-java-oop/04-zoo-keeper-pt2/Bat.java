public class Bat extends Mammal {
    public Bat(int energylevel) {
        super(energylevel);
    }
    public void fly() {
        System.out.println("Swooooooooosssh!!!");
        this.energylevel -= 50;
    }
    public void eatHumans() {
        System.out.println("Bat has devoured a human!");
        this.energylevel += 25;
    }
    public void attackTown() {
        System.out.println("Kaboooom! Crackle!");
        this.energylevel -= 100;
    }
}