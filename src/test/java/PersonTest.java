import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private Person person;

    @Before
    public void before(){
        person = new Person("Joey");
    }

    @Test
    public void hasName(){
        assertEquals("Joey", person.getName());
    }

    @Test
    public void canChangeName(){
        person.setName("Luke");
        assertEquals("Luke", person.getName());
    }

}
