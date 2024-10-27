package task3;

import java.util.ArrayList;

public class TravelItiniraryPlanner {
	
	    private ArrayList<Destination> destinations;
	    private Budget budget;

	    public TravelItiniraryPlanner() {
	        destinations = new ArrayList<>();
	    }

	    // Add a destination to the itinerary
	    public void addDestination(String name, String date, String preferences) {
	        destinations.add(new Destination(name, date, preferences));
	    }

	    // Set the budget for the trip
	    public void setBudget(double transportation, double accommodation, double food, double activities) {
	        budget = new Budget(transportation, accommodation, food, activities);
	    }

	    // Display the entire itinerary with destinations and budget
	    public void showItinerary() {
	        System.out.println("Travel Itinerary:");
	        for (Destination destination : destinations) {
	            System.out.println(destination);
	        }
	        if (budget != null) {
	            System.out.println(budget);
	        } else {
	            System.out.println("Budget not set.");
	        }
	    }

	    // Optionally, a method to get total budget
	    public double getTotalBudget() {
	        if (budget != null) {
	            return budget.getTotalBudget();
	        }
	        return 0.0;
	    }
	}


