import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Conferenceroom conferenceroom;
    DinningRoom dinningRoom;
    Bedroom bedroom1,bedroom2, bedroom3;
    Guest guest;

    @Before
    public void before(){
        hotel = new Hotel(conferenceroom, dinningRoom);
        conferenceroom = new Conferenceroom("White Lily", 80, 70);
        dinningRoom = new DinningRoom();
        guest = new Guest();
        bedroom1 = new Bedroom("Double", 50, 2, "001");
        bedroom2 = new Bedroom("Single", 40, 1, "002");
        bedroom3 = new Bedroom("Double", 80, 2, "003");
    }

    @Test
    public void canGetNumberOfRooms() {
        assertEquals(0, hotel.getBedroomNumber());
    }

    @Test
    public void canAddRooms() {
        hotel.addRoom(bedroom1);
        assertEquals(1,hotel.getBedroomNumber());
    }

    @Test
    public void canCheckTheRoomIsEmpty() {
        hotel.addRoom(bedroom1);
        assertEquals(true, hotel.checkIfRoomIsEmpty(bedroom1));
    }

    @Test
    public void canCheckInGuestToRoom() {
        hotel.addRoom(bedroom1);
        hotel.addRoom(bedroom2);
        hotel.checkInGuest(guest);
        assertEquals(1, bedroom1.getNumberOfGuest());
    }

    @Test
    public void canCheckOutGuest() {
        hotel.addRoom(bedroom1);
        hotel.addRoom(bedroom2);
        hotel.checkInGuest(guest);
        hotel.checkOutGuest(guest);
        assertEquals(0, bedroom1.getNumberOfGuest());
    }

    @Test
    public void canSeeTheVacantRooms() {
        hotel.addRoom(bedroom1);
        hotel.addRoom(bedroom2);
        hotel.checkInGuest(guest);
        hotel.checkInGuest(guest);
        hotel.checkInGuest(guest);
        hotel.VacantRoomList();
        assertEquals(2, hotel.getBedroomNumber());
    }
}
