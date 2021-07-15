
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {

    @Test
    public void thirtyPeopleIsOk(){
        // Given
        int numberOfPeople = 30;

        // When
        String actual = Alarm.getOccupationStatus(numberOfPeople);

        // Then
        assertEquals("Maximale Personenzahl nicht überschritten", actual);
    }

    @Test
    public void thirtyOnePeopleIsNotOk(){
        // Given
        int numberOfPeople = 31;

        // When
        String actual = Alarm.getOccupationStatus(numberOfPeople);

        // Then
        assertEquals("Zu viele Personen", actual);
    }


}