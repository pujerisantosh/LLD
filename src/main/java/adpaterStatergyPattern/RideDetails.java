package adpaterStatergyPattern;


import lombok.AllArgsConstructor;
import lombok.Getter;
public class RideDetails {
    private double distance; // Distance in kilometers
    private int duration; // Duration in minutes

    public RideDetails(double distance, int duration) {
        this.distance = distance;
        this.duration = duration;
    }

    public double getDistance() {
        return distance;
    }

    public int getDuration() {
        return duration;
    }
}
