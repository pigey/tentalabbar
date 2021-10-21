package se.filip;

public class ToyCar {
    private int distance;
    private int battery;
    private int count;

    public void batteryDisaply(){
        battery = 100 - count;
        if (battery == 0) {
            System.out.println("Battery empty");
        }
        else
            System.out.println("Battery at " + battery+ "%");
    }
    public void distanceDisplay(){
       System.out.println("Driven " + distance+" meters");
    }
    public void drive(){
        if (battery == 0) {
            System.out.println("Can't drive no battery");
        }
        else{
            distance += 20;
            count=0;
            count++;
        }
    }
}
