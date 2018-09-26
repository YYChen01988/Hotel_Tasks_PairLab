import java.util.ArrayList;

public class Conferenceroom {
    private String name;
    private int dayrate;
    private ArrayList<Guest> conferenceroomGuestList;

    public Conferenceroom(String name, int dayrate){
        this.name = name;
        this.dayrate = dayrate;
        this.conferenceroomGuestList =new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getDayrate() {
        return dayrate;
    }

    public int getGuestSize() {
        return conferenceroomGuestList.size();
    }

    public void addGuest(Guest guest) {
        conferenceroomGuestList.add(guest);
    }

    public void removeGuest(Guest guest) {
        conferenceroomGuestList.remove(guest);
    }

//    public ArrayList<Guest> getConferenceroomGuestList() {
//        return conferenceroomGuestList;
//    }
}
