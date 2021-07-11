public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double c = 1.0;
        c = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
        c = Math.sqrt((legA * legA) + (legB * legB));
        return c;
    }
}