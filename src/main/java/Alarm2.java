public class Alarm2 {
    public static String getOccupationStatus(String threatLevel, int numberOfPeople) {
        if(threatLevel.equals("Red")){
            return "Zu viele Personen";
        }

        int limit = getMaximumNumberOfPeople(threatLevel);

        if (numberOfPeople > limit) {
            return "Zu viele Personen";
        } else {
            return "Maximale Personenzahl nicht überschritten";
        }
    }

    private static int getMaximumNumberOfPeople(String threatLevel){
        switch (threatLevel) {
            case "Yellow":
                return 30;
            case "Green":
                return 60;
            default:
                return 0;
        }
    }

}
