package task3;

public class MainClass {
	    public static void main(String[] args) {
	        // Create a new travel itinerary planner
	        TravelItiniraryPlanner planner = new TravelItiniraryPlanner();
	        
	        // Add destinations
	        planner.addDestination("Paris", "2024-05-10", "Eiffel Tower, Museums");
	        planner.addDestination("Tokyo", "2024-05-20", "Temples, Sushi, Anime");
	        planner.addDestination("New York", "2024-05-30", "Broadway, Central Park");

	        // Set budget
	        planner.setBudget(1000, 1500, 800, 600);

	        // Show the complete itinerary
	        planner.showItinerary();
	        
	        // Optionally, get the total budget
	        System.out.println("Total Budget: $" + planner.getTotalBudget());
	    }
	}

