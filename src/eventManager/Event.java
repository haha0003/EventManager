package eventManager;

public class Event {
    String name;
    String date;
    String place;
    int participants;

    @Override
    public String toString() {
        return "Event" +
                "name: " + name +
                ", date: " + date +
                ", place: " + place +
                ", participants: " + participants;
    }
}


