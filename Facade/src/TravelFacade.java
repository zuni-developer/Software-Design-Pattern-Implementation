public class TravelFacade {
    private FlightBooking flightBooking;
    private HotelBooking hotelBooking;
    private CarRental carRental;
    private PaymentProcessor paymentProcessor;

    public TravelFacade() {
        flightBooking = new FlightBooking();
        hotelBooking = new HotelBooking();
        carRental = new CarRental();
        paymentProcessor = new PaymentProcessor();
    }

    public void bookTrip(String from, String to, double amount) {
        System.out.println("Starting trip booking process...\n");
        flightBooking.bookFlight(from, to);
        hotelBooking.reserveHotel(to);
        carRental.rentCar(to);
        paymentProcessor.makePayment(amount);
        System.out.println("\nTrip booked successfully!");
    }
}
