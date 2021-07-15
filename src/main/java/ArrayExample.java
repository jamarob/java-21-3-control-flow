public class ArrayExample {

    public static String[] generateStudentsArray(int numberOfStudents) {
        String[] students = new String[numberOfStudents];

        for(int i=0;i < students.length; i++){
            students[i] = "Student "+ (i+1);
        }

        return students;
    }
}
