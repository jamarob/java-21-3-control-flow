import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExampleTest {

    @Test
    public void generateStudentsArray(){
        // Given
        int numberOfStudents = 3;

        // When
        String[] actual = ArrayExample.generateStudentsArray(numberOfStudents);

        // Then
        String[] expected = {"Student 1", "Student 2", "Student 3"};
        assertArrayEquals(expected, actual);
    }

}