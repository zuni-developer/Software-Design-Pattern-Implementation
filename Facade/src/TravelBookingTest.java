public class TravelBookingTest {
    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacade();
        //client only interacts with the facade
        travelFacade.bookTrip("New York", "Los Angeles", 1200.50);
    }
}
