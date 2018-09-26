import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedroomList;
    private Conferenceroom conferenceroom;
    private DinningRoom dinningRoom;

    public Hotel(Conferenceroom conferenceroom, DinningRoom dinningRoom){
        this.conferenceroom = conferenceroom;
        this.dinningRoom = dinningRoom;
        this.bedroomList = new ArrayList<>();
    }

    public ArrayList<Bedroom> getBedroomList() {
        return bedroomList;
    }

    public int getBedroomNumber() {
        return bedroomList.size();
    }

    public void addRoom(Bedroom bedroom) {
        bedroomList.add(bedroom);
    }

    public void checkInGuest(Guest guest) {
        for (int i= 0; i< bedroomList.size(); i++){
            if (bedroomList.get(i).getNumberOfGuest()> 0){
                bedroomList.get(i).checkInGuest(guest);
            }
        }
    }


}
