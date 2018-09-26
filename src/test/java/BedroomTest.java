import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1,guest2,guest3;

    @Before
    public void before(){
        bedroom = new Bedroom("Double", 30, 2, "001");
        guest1 = new Guest();
        guest2 = new Guest();
        guest3 = new Guest();
    }

    @Test
    public void canGetRoomType() {
        assertEquals("Double", bedroom.getType());
    }

    @Test
    public void canGetRoomCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void canGetRoomNightrate() {
        assertEquals(30, bedroom.getNightrate());
    }

    @Test
    public void roomStartWithEmptyGuest() {
        assertEquals(0,bedroom.getNumberOfGuest());
    }

    @Test
    public void canCheckInGuestToRoom() {
        bedroom.checkInGuest(guest1);
        //guest1.getARoom(bedroom);
        assertEquals(1, bedroom.getNumberOfGuest());
        //assertEquals("Double", guest1.getLivedInRoom());
    }

    @Test
    public void canCheckOutGuestFromRoom() {
        bedroom.checkInGuest(guest1);
        bedroom.checkInGuest(guest2);
        bedroom.checkOutGuest(guest1);
        assertEquals(1,bedroom.getNumberOfGuest());
        //assertEquals(null, guest1.getLivedInRoom());
    }
}
