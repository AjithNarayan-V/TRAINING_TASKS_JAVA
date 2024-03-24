import java.util.*;

class Train {
    private String trainNumber;
    private String source;
    private String destination;
    private int totalSeats;
    private int availableSeats;

   
    // Constructor
    public Train(String trainNumber, String source, String destination, int totalSeats, int availableSeats) {
        this.trainNumber = trainNumber;
        this.source = source;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
    }

    // Getters and setters

    public String getTrainNumber() {
        return trainNumber;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    
}

class ReservationSystem {
    private List<Train> trains;

    // Constructor
    public ReservationSystem() {
        trains = new ArrayList<>();
       
    }

    // Method to display available trains based on source and destination
    public List<Train> displayAvailableTrains(String source, String destination) {
        List<Train> availableTrains = new ArrayList<>();
        for (Train train : trains) {
            if (train.getSource().equalsIgnoreCase(source) && train.getDestination().equalsIgnoreCase(destination)) {
                availableTrains.add(train);
            }
        }
        return availableTrains;
    }

    // Method to check seat availability 
    public boolean checkSeatAvailability(String trainNumber) {
        for (Train train : trains) {
            if (train.getTrainNumber().equalsIgnoreCase(trainNumber) && train.getAvailableSeats() > 0) {
                return true;
            }
        }
        return false;
    }

    // Method to book a ticket
    public boolean bookTicket(String trainNumber) {
        for (Train train : trains) {
            if (train.getTrainNumber().equalsIgnoreCase(trainNumber) && train.getAvailableSeats() > 0) {
                train.setAvailableSeats(train.getAvailableSeats() - 1);
                return true;
            }
        }
        return false;
    }

    // Method to cancel a ticket
    public boolean cancelTicket(String trainNumber) {
        for (Train train : trains) {
            if (train.getTrainNumber().equalsIgnoreCase(trainNumber)) {
                train.setAvailableSeats(train.getAvailableSeats() + 1);
                return true;
            }
        }
        return false;
    }

    // Method to display ticket details
    public void displayTicketDetails(String trainNumber) {
        for (Train train : trains) {
            if (train.getTrainNumber().equalsIgnoreCase(trainNumber)) {
                System.out.println("Train Number: " + train.getTrainNumber());
                System.out.println("Source: " + train.getSource());
                System.out.println("Destination: " + train.getDestination());
                System.out.println("Total Seats: " + train.getTotalSeats());
                System.out.println("Available Seats: " + train.getAvailableSeats());
                return;
            }
        }
        System.out.println("Train with number " + trainNumber + " not found.");
    }
}

public class access4 {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
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
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter source: ");
                    String source = scanner.nextLine();
                    System.out.print("Enter destination: ");
                    String destination = scanner.nextLine();    
                    List<Train> availableTrains = reservationSystem.displayAvailableTrains(source, destination);
                    for (Train train : availableTrains) {
                        System.out.println(train.getTrainNumber() + ", Available Seats: " + train.getAvailableSeats());
                    }
                    break;
                case 2:
                    System.out.print("Enter train number: ");
                    String trainNumberAvailability = scanner.nextLine();
                    if (reservationSystem.checkSeatAvailability(trainNumberAvailability)) {
                        System.out.println("Seats available for train " + trainNumberAvailability);
                    } else {
                        System.out.println("No seats available for train " + trainNumberAvailability);
                    }
                    break;
                case 3:
                    System.out.print("Enter train number to book ticket: ");
                    String trainNumberBooking = scanner.nextLine();
                    if (reservationSystem.bookTicket(trainNumberBooking)) {
                        System.out.println("Ticket booked successfully for train " + trainNumberBooking);
                    } else {
                        System.out.println("Failed to book ticket for train " + trainNumberBooking);
                    }
                    break;
                case 4:
                    System.out.print("Enter train number to cancel ticket: ");
                    String trainNumberCancellation = scanner.nextLine();
                    if (reservationSystem.cancelTicket(trainNumberCancellation)) {
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

        scanner.close();
    }
}







// import java.util.*;

// public class ReservationSystem {
//     private List<Train> trains;

//     // Constructor
//     public ReservationSystem() {
//         trains = new ArrayList<>();
//         // Initialize trains here or load from a database/file
//     }

//     // Method to add trains to the system
//     public void addTrains(List<Train> newTrains) {
//         trains.addAll(newTrains);
//     }

//     // Other methods implementation
// }
















// import java.util.List;

// public class Main {
//     public static void main(String[] args) {
//         ReservationSystem reservationSystem = new ReservationSystem();

//         // Import train details from CSV file or any other source
//         List<Train> importedTrains = importTrainsFromCSV("train_details.csv");
//         reservationSystem.addTrains(importedTrains);

//         // Now you can use the reservation system with the imported train details
//         // ...
//     }

//     public static List<Train> importTrainsFromCSV(String filename) {
//         // Implement method to read train details from CSV file and return a list of Train objects
//         // This can be similar to the importTrainsFromCSV method shown in the previous response
//         // ...
//         return null; // Placeholder
//     }
// }
