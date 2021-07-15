public class Alarm {
    public static String getOccupationStatus(int numberOfPeople) {
        if(numberOfPeople > 30){
            return "Zu viele Personen";
        }else {
            return "Maximale Personenzahl nicht überschritten";
        }
    }
}
