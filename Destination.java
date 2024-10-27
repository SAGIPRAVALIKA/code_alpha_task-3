package task3;

public class Destination {
	    private String name;
	    private String date;
	    private String preferences;

	    public Destination(String name, String date, String preferences) {
	        this.name = name;
	        this.date = date;
	        this.preferences = preferences;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getDate() {
	        return date;
	    }

	    public String getPreferences() {
	        return preferences;
	    }

	    @Override
	    public String toString() {
	        return "Destination: " + name + ", Date: " + date + ", Preferences: " + preferences;
	    }
	}


