import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacultryTest {

    @Test
    public void facultry0(){
        // Given
        int number = 0;

        // When
        int actual = Facultry.calculate(number);

        // Then
        assertEquals(1, actual);
    }

    @Test
    public void facultry1(){
        // Given
        int number = 1;

        // When
        int actual = Facultry.calculate(number);

        // Then
        assertEquals(1, actual);
    }

    @Test
    public void facultry2(){
        // Given
        int number = 2;

        // When
        int actual = Facultry.calculate(number);

        // Then
        assertEquals(2, actual);
    }

    @Test
    public void facultry3(){
        // Given
        int number = 3;

        // When
        int actual = Facultry.calculate(number);

        // Then
        assertEquals(6, actual);

    }

}