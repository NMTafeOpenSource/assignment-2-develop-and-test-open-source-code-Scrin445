package vehiclestarter;


import java.text.DecimalFormat;

public class Vehicle {
	private String	manufacturer;
	private String	model;
	private int	makeYear;
        // TODO add Registration Number 
        // TODO add variable for OdometerReading (in KM), 
        // TODO add variable for TankCapacity (in litres)
    private String registrationNumber;
    private double odometerReading;
	private double tankCapacity;

	private FuelPurchase	fuelPurchase;
	private Service service = new Service();

	/**
	 * Class constructor specifying name of make (manufacturer), model and year
	 * of make.
	 * @param manufacturer
	 * @param model
	 * @param makeYear
	 */
	public Vehicle(String manufacturer, String model, int makeYear, String registrationNumber, double odometerReading, double tankCapacity) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.makeYear = makeYear;
		this.registrationNumber = registrationNumber;
		this.odometerReading = odometerReading;
		this.tankCapacity = tankCapacity;
		fuelPurchase = new FuelPurchase();
	}

        // TODO Add missing getter and setter methods
	public String getRegistrationNumber() { return this.registrationNumber; }
	public void setRegistrationNumber(String registrationNumber) {this.registrationNumber = registrationNumber; }
	public double getOdometerReading() { return this.odometerReading; }
	public void setOdometerReading(String registrationNumber) {this.odometerReading = odometerReading; }
	public double getTankCapacity() { return this.tankCapacity; }
	public void setTankCapacity(String registrationNumber) {this.tankCapacity = tankCapacity; }
        
	/**
	 * Prints details for {@link Vehicle}
	 */
	public void printDetails() {
		DecimalFormat formatter = new DecimalFormat("#0.00");
		System.out.println("Vehicle: "+ manufacturer + " " + model + " " + makeYear);
                // TODO Display additional information about this vehicle
		System.out.println("Registration No: " + this.registrationNumber);
		System.out.println("Total kilometres travelled: " + this.odometerReading + " km");
		System.out.println("Total services: " + service.getServiceCount());
		System.out.println("Revenue recorded: $" + formatter.format(fuelPurchase.getFuelEconomy() * this.odometerReading));
		System.out.println("Kilometres since last service: " + service.getLastServiceOdometerKm() + " km");
		System.out.println("Fuel economy: " + formatter.format(fuelPurchase.getFuelEconomy()) + " $/L");
		System.out.println("Requires a service: " + needService());
	}

        // TODO Create an addKilometers method which takes a parameter for distance travelled 
        // and adds it to the odometer reading.
	public void addKilometers (double distanceTravelled) { this.odometerReading += distanceTravelled; }

	public String needService() {
		if (service.getTotalScheduledServices() >= 1) { return "Yes"; }
		else { return "No"; }
	}

        // adds fuel to the car
        public void addFuel(double litres, double price){            
            fuelPurchase.purchaseFuel(litres, price);
        }        

}
