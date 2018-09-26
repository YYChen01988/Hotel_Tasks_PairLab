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


//    public void checkInGuest() {
//
//    }
}
