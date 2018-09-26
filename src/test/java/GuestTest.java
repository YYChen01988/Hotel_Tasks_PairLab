import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    Guest guest;
    Bedroom bedroom1, bedroom2;

    @Before
    public void before(){
        guest = new Guest(null);
        bedroom1 = new Bedroom("Double", 30);
        bedroom2 = new Bedroom("Single",15);
    }

    @Test
    public void canGetARoom() {
        guest.getARoom(bedroom1);
        assertEquals("Double", guest.getLivedInRoom());
    }
}
