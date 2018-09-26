import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Conferenceroom conferenceroom;
    DinningRoom dinningRoom;
    Bedroom bedroom1,bedroom2, bedroom3;

    @Before
    public void before(){
        hotel = new Hotel(conferenceroom, dinningRoom);
        conferenceroom = new Conferenceroom("White Lily", 80);
        dinningRoom = new DinningRoom();
        bedroom1 = new Bedroom("Double", 50);
        bedroom2 = new Bedroom("Single", 40);
        bedroom3 = new Bedroom("Double", 80);
    }

//  hotel should have a list of rooms are occupied(add room function and then if guest number is >=0

//    @Test
//    public void canCheckInGuestToRoom() {
//        hotel.checkInGuest();
//        assertEquals(1, bedroom1.getNumberOfGuest());
//    }
}
