import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

class Booking {
    private Train train;
    private user_detail user_detail;
    private String bookingNumber;

    public Booking(Train train, user_detail user_detail, String bookingNumber) {
        this.train = train;
        this.user_detail = user_detail;
        this.bookingNumber = bookingNumber;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public user_detail getUser_detail() {
        return user_detail;
    }

    public void setUser_detail(user_detail user_detail) {
        this.user_detail = user_detail;
    }

    // Getters for train and passenger
}

class user_detail {
    private String name;
    private int age;
    private String gender;
    private long phone_number;
    private long aadhar_number;

    user_detail(String name, int age, String gender, long phone_number, long aadhar_number) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone_number = phone_number;
        this.aadhar_number = aadhar_number;
    }

    public long getAadhar_number() {
        return aadhar_number;
    }

    public void setAadhar_number(long aadhar_number) {
        this.aadhar_number = aadhar_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

}

class Train {
    private String trainName;
    private String source;
    private String destination;
    private String trainNumber;
    private int seatAvailable;

    Train(String trainName, String source, String destination, String trainNumber, int seatAvailable) {
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.seatAvailable = seatAvailable;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public int getSeatAvailable() {
        return seatAvailable;
    }

    public void setSeatAvailable(int seatAvailable) {
        this.seatAvailable = seatAvailable;
    }

}

class ReservationSystem {
    private List<Train> trains;// has trai details
    private Map<String, Booking> BookedPassengers;

    ReservationSystem() {
        trains = new ArrayList<>();
        BookedPassengers = new HashMap<>();
    }

    public void addTrains(List<Train> newTrains) {
        trains.addAll(newTrains);
    }

    public static String generateBookingNumber() {
        // Get current timestamp in milliseconds
        long timestamp = System.currentTimeMillis();

        // Append a random 6-digit number to the timestamp
        Random random = new Random();
        int randomSuffix = random.nextInt(900000) + 100000; // Generates a random 6-digit number
        String bookingNumber = Long.toString(timestamp) + Integer.toString(randomSuffix);

        // Ensure the booking number is exactly 12 digits long
        if (bookingNumber.length() > 12) {
            bookingNumber = bookingNumber.substring(0, 12);
        } else if (bookingNumber.length() < 12) {
            // If the generated number is less than 12 digits, pad it with zeros
            bookingNumber = String.format("%012d", Long.parseLong(bookingNumber));
        }

        return bookingNumber;
    }

    public List<Train> displayAvailableTrains(String source, String destination) {
        List<Train> availableTrains = new ArrayList<>();
        System.out.println("-----------------------------------------------");
        for (Train train : trains) {
            // System.out.println(train.getTrainName());
            if (train.getSource().equalsIgnoreCase(source) && train.getDestination().equalsIgnoreCase(destination)) {
                availableTrains.add(train);
            }

        }
        return availableTrains;
    }

    public int checkSeatAvailability(String trainNumber) {
        for (Train train : trains) {
            if (train.getTrainNumber().equalsIgnoreCase(trainNumber)) {
                return train.getSeatAvailable();
            }
        }
        return -1;
    }

    public String BookTicket(String trainNumber) {
        Scanner scanner = new Scanner(System.in);
        for (Train train : trains) {
            if (train.getTrainNumber().equalsIgnoreCase(trainNumber) && train.getSeatAvailable() > 0) {
                System.out.println("inside book ticket");
                System.out.println("Enter the name of the passenger:");
                String name = scanner.nextLine();
                System.out.println("Enter age:");
                int age = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                System.out.println("Enter gender:");
                String gender = scanner.nextLine();
                System.out.println("Enter Aadhar number:");
                long aadharNumber = scanner.nextLong();
                scanner.nextLine(); // Consume newline character
                System.out.println("Enter phone number:");
                long phone_number = scanner.nextLong();
                user_detail user_detail = new user_detail(name, age, gender, phone_number, aadharNumber);
                String bookingNumber = generateBookingNumber();
                Booking details = new Booking(train, user_detail, bookingNumber);
                BookedPassengers.computeIfAbsent(bookingNumber, k -> details);
                getBookingByNumber(bookingNumber);
                train.setSeatAvailable(train.getSeatAvailable() - 1);

                return bookingNumber;
            }
        }
        return null;

    }

    public void getBookingByNumber(String bookingNumber) {

        Booking booking = BookedPassengers.get(bookingNumber);
        if (booking != null) {
            Train train = booking.getTrain();
            user_detail passenger = booking.getUser_detail();

            // Print booking details
            System.out.println("----------------Receipt-----------------");
            System.out.println("Booking Number: " + bookingNumber);
            System.out.println("Train Name: " + train.getTrainName());
            System.out.println("Source: " + train.getSource());
            System.out.println("Destination: " + train.getDestination());

            // Print passenger details
            System.out.println("Passenger Name: " + passenger.getName());
            System.out.println("Age: " + passenger.getAge());
            System.out.println("Gender: " + passenger.getGender());
            System.out.println("Aadhar Number: " + passenger.getAadhar_number());
            System.out.println("Phone Number: " + passenger.getPhone_number());
            System.out.println("--------------------------------------------");
        } else {
            System.out.println("Booking not found with the provided booking number.");
        }
    }

    public Boolean CancleTicket(String trainNumber) {
        for (Train train : trains) {
            if (train.getTrainNumber().equalsIgnoreCase(trainNumber)) {
                train.setSeatAvailable(train.getSeatAvailable() + 1);
                return true;
            }
        }
        return false;
    }

    public void displayTicketDetails(String trainNumber) {
        for (Train train : trains) {
            if (train.getTrainNumber().equalsIgnoreCase(trainNumber)) {
                System.out.println("Train Name: " + train.getTrainName());
                System.out.println("Train departure at: " + train.getSource());
                System.out.println("Train destination at: " + train.getDestination());
                System.out.println("Tarin Number: " + train.getTrainNumber());
                System.out.println("Seat available: " + train.getSeatAvailable());
            }
        }
    }
}

public class RailwayRegistration {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
        List<Train> importedTrains = importTrainsFromCSV("All_Indian_Trains.csv");
        System.out.println("importTrainsFromCSV");
        reservationSystem.addTrains(importedTrains);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Display available trains");
            System.out.println("2. Check seat availability");
            System.out.println("3. Book a ticket");
            System.out.println("4. Cancel a ticket");
            System.out.println("5. Display ticket details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    int result = availabileTrain(reservationSystem);

                    if (result == 1) {
                        TrainTicketBooking(reservationSystem);
                    } else {
                        System.out.println("Exiting...");
                    }
                    System.out.println("-----------------------------------------------");
                    break;
                case 2:
                    int result1 = CheckSeat(reservationSystem);
                    if (result1 == 1) {
                        TrainTicketBooking(reservationSystem);
                    } else {
                        System.out.println("Exiting...");
                    }
                    System.out.println("-----------------------------------------------");

                    break;
                case 3:
                    TrainTicketBooking(reservationSystem);// reservationSystem has tarin details

                    System.out.println("-----------------------------------------------");

                    break;
                case 4:
                    System.out.print("Enter train number to cancel ticket: ");
                    String trainNumberCancellation = scanner.nextLine();
                    if (reservationSystem.CancleTicket(trainNumberCancellation)) {
                        System.out.println("Ticket cancelled successfully for train " + trainNumberCancellation);
                    } else {
                        System.out.println("Failed to cancel ticket for train " + trainNumberCancellation);
                    }
                    break;
                case 5:
                    System.out.print("Enter train number to display ticket details: ");
                    String trainNumberDetails = scanner.nextLine();
                    reservationSystem.displayTicketDetails(trainNumberDetails);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);
    }

    public static List<Train> importTrainsFromCSV(String filename) {
        List<Train> trains = new ArrayList<>();
        String line = "";
        String delimiter = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            // Skip header line
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] trainData = line.split(delimiter);
                String trainNumber = trainData[1];
                String trainName = trainData[2];
                String source = trainData[3];
                String destination = trainData[4];
                // int totalSeats = Integer.parseInt(trainData[4]);
                // int availableSeats = Integer.parseInt(trainData[5]);

                Train train = new Train(trainName, source, destination, trainNumber, 100);
                trains.add(train);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return trains;
    }

    static void TrainTicketBooking(ReservationSystem reservationSystem) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter train number to book ticket: ");
        String trainNumberBooking = scanner.nextLine();
        int count = reservationSystem.checkSeatAvailability(trainNumberBooking);// check seat availability returns
                                                                                // number of seats and 0 for NO TRAIN
        if (count > 0) {
            System.out.println(
                    "Seat is available for train number: " + trainNumberBooking + " with seat count of:" + count);
            System.out.println("Enter the number of tickets need to be booked:\n Enter 0 to exit,");
            int ticketCount = scanner.nextInt();
            scanner.nextLine();
            if (ticketCount > 0) {
                for (int i = 0; i < ticketCount; i++) {
                    String BookedPassengers = reservationSystem.BookTicket(trainNumberBooking);
                }
                System.out.println("Ticket booked successfully for train " + trainNumberBooking);
                // reservationSystem.displayTicketDetails(trainNumberBooking);
            } else if (ticketCount == 0) {
                System.out.println("Thank you for visiting ....");
            }
        } else if (count == 0) {
            System.out.println("No seats available for selected train.. Sorry for inconvenience");
        } else {
            System.out.println(
                    "No train with train number: " + trainNumberBooking + " Please enter correct train number.");
        }
        // return 0;
    }

    static int availabileTrain(ReservationSystem reservationSystem) {
        System.out.print("Enter source: ");
        Scanner scanner = new Scanner(System.in);
        String source = scanner.nextLine();
        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();
        List<Train> availableTrains = reservationSystem.displayAvailableTrains(source, destination);
        for (Train train : availableTrains) {
            System.out.println("--------------------Available Trains-------------------------");
            System.out.println("Train Number:" + train.getTrainNumber() + "\nAvailable Seats: "
                    + train.getSeatAvailable() + "\nTrain Name:" + train.getTrainName() + "\nSources: "
                    + train.getSource() + "\n Destinations: " + train.getDestination());
            System.out.println("-----------------------------------------------------------");
        }
        if (availableTrains.size() == 0) {
            System.out.println("No Train Available");
            return 0;
        }
        System.out.println("Do you want to book ticket from above list of Train:");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    static int CheckSeat(ReservationSystem reservationSystem) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter train number: ");
        String trainNumberAvailability = scanner.nextLine();
        if (reservationSystem.checkSeatAvailability(trainNumberAvailability) > 0) {
            System.out.println("Seats available for train " + trainNumberAvailability);
            System.out.println("Do you want to book ticket:");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            return choice;
        } else {
            System.out.println(
                    "No train with train number: " + trainNumberAvailability + " Please enter correct train number.");
            return 0;
        }

    }
}
