import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1,guest2,guest3;

    @Before
    public void before(){
        bedroom = new Bedroom("Double", 30);
        guest1 = new Guest(null);
        guest2 = new Guest(null);
        guest3 = new Guest(null);
    }

    @Test
    public void canGetRoomType() {
        assertEquals("Double", bedroom.getType());
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
    public void canAddGuestToRoom() {
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.getNumberOfGuest());
    }

    @Test
    public void canRemoveGuestFromRoom() {
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.removeGuest(guest1);
        assertEquals(1,bedroom.getNumberOfGuest());
    }
}
