package mycountrygame;

public class DistanceRecord {
	
	/**
	 * A simple record-style class used to link a country's name to its calculated distance.
	 * Used exclusively for sorting the leaderboard.
	 */

	    String countryname;
	    double distance;

	    public DistanceRecord(String countryName, double distance) {
	        this.countryname = countryName;
	        this.distance = distance;
	    }
	}



