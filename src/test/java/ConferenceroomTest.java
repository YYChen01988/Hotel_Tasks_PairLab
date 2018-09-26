import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceroomTest {
    Conferenceroom conferenceroom;
    Guest guest1, guest2, guest3;

    @Before
    public void before(){
        conferenceroom = new Conferenceroom("White Elizabeth", 100);
        guest1 = new Guest(null);
        guest2 = new Guest(null);
        guest3 = new Guest(null);
    }

    @Test
    public void canGetConferenceRoomName() {
        assertEquals("White Elizabeth", conferenceroom.getName());
    }

    @Test
    public void canGetCoferenceRoomDayrate() {
        assertEquals(100, conferenceroom.getDayrate());
    }

    @Test
    public void conferenceRoomStartWithEmptyGuest() {
        assertEquals(0, conferenceroom.getGuestSize());
    }

    @Test
    public void canAddGuestToRoom() {
        conferenceroom.addGuest(guest1);
        assertEquals(1, conferenceroom.getGuestSize());
    }

    @Test
    public void canRemoveGuestFromRoom() {
        conferenceroom.addGuest(guest1);
        conferenceroom.addGuest(guest2);
        conferenceroom.removeGuest(guest1);
        assertEquals(1,conferenceroom.getGuestSize());
    }
}
