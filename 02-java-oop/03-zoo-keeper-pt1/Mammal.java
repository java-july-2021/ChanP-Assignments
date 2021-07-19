public class Mammal {
    protected int energylevel;
    public int displayEnergy() {
        System.out.println("Energy level: " + energylevel);
        return energylevel;
    }
    public Mammal(int energylevel) {
        this.energylevel = energylevel;
    }
}