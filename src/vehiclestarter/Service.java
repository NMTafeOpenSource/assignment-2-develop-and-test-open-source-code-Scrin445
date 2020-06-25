package vehiclestarter;

import java.util.Date;

public class Service {
    
    // Constant to indicate that the vehicle needs to be serviced every 10,000km
    public static final int SERVICE_KILOMETER_LIMIT = 10000;
    
    private int lastServiceOdometerKm=0;
    private int serviceCount=0;
    // TODO add lastServiceDate
    private String lastServiceDate;

    // return the last service
    public int getLastServiceOdometerKm()
    {
        return this.lastServiceOdometerKm;
    }    
    
    /**
     * The function recordService expects the total distance traveled by the car, 
     * saves it and increase serviceCount.
     * @param distance 
     */
    public void recordService(int distance)
    {
        Date date = new Date();
        this.lastServiceOdometerKm = distance;
        this.lastServiceDate = String.format("%1$s %2$tB %2$td, %2$tY", date);
        this.serviceCount ++;
    }
    
    // return how many services the car has had
    public int getServiceCount()
    {
        return this.serviceCount;
    }
    
    /**
     * Calculates the total services by dividing kilometers by
     * {@link #SERVICE_KILOMETER_LIMIT} and floors the value. 
     * 
     * @return the number of services needed per SERVICE_KILOMETER_LIMIT
     */
    public int getTotalScheduledServices() {
            return (int) Math.floor(lastServiceOdometerKm / SERVICE_KILOMETER_LIMIT);
    }
    
}
