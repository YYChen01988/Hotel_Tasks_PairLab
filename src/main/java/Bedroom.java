import java.util.ArrayList;

public class Bedroom {

    private int capacity;
    private String type;
    private int nightrate;
    private String roomNumber;
    private ArrayList<Guest> bedroomGuestList;

    public Bedroom(String type, int nightrate, int capacity, String roomNumber){
        this.capacity = capacity;
        this.type = type;
        this.nightrate = nightrate;
        this.roomNumber = roomNumber;
        this.bedroomGuestList = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNightrate() {
        return nightrate;
    }

    public int getNumberOfGuest() {
        return this.bedroomGuestList.size();
    }

    public void checkInGuest(Guest guest) {
        if (bedroomGuestList.size() <= capacity){
            this.bedroomGuestList.add(guest);
//            String status = guest.getLivedInRoom();
//            status = this.type;
        }
    }

    public void checkOutGuest(Guest guest) {
        this.bedroomGuestList.remove(guest);
//        String status = guest.getLivedInRoom();
//        status = null;
    }


//    public ArrayList<Guest> getBedroomGuestList() {
//        return bedroomGuestList;
//    }


}
