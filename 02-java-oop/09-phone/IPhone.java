public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
        return this.getringTone();
    }
    @Override
    public String unlock() {
        // your code here
        return "Unlocked with facial scanner";
    }
    @Override
    public void displayInfo() {
        // your code here
        System.out.println("Version Number: " + this.getversionNumber());
        System.out.println("Battery Percentage: " + this.getbatteryPercentage());
        System.out.println("Carrier: " + this.getcarrier());
        System.out.println("Ringtone: " + this.getringTone());
    }
}