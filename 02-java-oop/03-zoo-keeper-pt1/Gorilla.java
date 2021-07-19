public class Gorilla extends Mammal {
    public Gorilla (int energylevel) {
        super(energylevel);
    }
    public void throwSomething() {
        System.out.println("Gorilla has thrown something.");
        this.energylevel -= 5;
    }
    public void eatBananas() {
        System.out.println("Gorilla ate a banana.");
        this.energylevel += 10;
    }
    public void climb() {
        System.out.println("Gorilla has climbed a tree!");
        this.energylevel -= 10;
    }
}