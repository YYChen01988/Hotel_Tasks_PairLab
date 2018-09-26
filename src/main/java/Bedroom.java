import java.util.ArrayList;

public class Bedroom {
    private String type;
    private int nightrate;
    private ArrayList<Guest> bedroomGuestList;

    public Bedroom(String type, int nightrate){
        this.type = type;
        this.nightrate = nightrate;
        this.bedroomGuestList = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public int getNightrate() {
        return nightrate;
    }

    public int getNumberOfGuest() {
        return this.bedroomGuestList.size();
    }

    public void addGuest(Guest guest) {
        this.bedroomGuestList.add(guest);
//        guest.
    }

    public void removeGuest(Guest guest) {
        this.bedroomGuestList.remove(guest);
    }


//    public ArrayList<Guest> getBedroomGuestList() {
//        return bedroomGuestList;
//    }


}
