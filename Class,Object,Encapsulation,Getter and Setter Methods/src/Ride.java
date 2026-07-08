// 10. Ride Sharing Fare System (Hard)
//A ride-sharing company calculates ride fare. Create a class Ride with private variables:
//customerName
//distanceTravelled
//pricePerKm
//surgeMultiplier
//Using getters calculate fare:
//baseFare = distanceTravelled × pricePerKm
//finalFare = baseFare × surgeMultiplier
//Rules:
//If distance > 20 km → 10% discount
//If surgeMultiplier > 1.5 → add ₹50 extra service charge
//Display customer name and final fare.
public class Ride {
    private String customerName;
    private double distanceTravelled;
    private double pricePerKm;
    private double surgeMultiplier;

    public void setData(String n, double d, double p, double s)
    {
        customerName = n;
        distanceTravelled = d;
        pricePerKm = p;
        surgeMultiplier = s;
    }

    public double getFare()
    {
        double baseFare = distanceTravelled * pricePerKm;

        double finalFare = baseFare * surgeMultiplier;

        if(distanceTravelled > 20)
        {
            finalFare = finalFare - (finalFare * 10 / 100);
        }

        if(surgeMultiplier > 1.5)
        {
            finalFare = finalFare + 50;
        }

        return finalFare;
    }

    public void display()
    {
        System.out.println("Customer Name = " + customerName);
        System.out.println("Final Fare = " + getFare());
    }

    public static void main(String args[])
    {
        Ride r = new Ride();

        r.setData("Nandini",25,10,2);

        r.display();
    }

}
