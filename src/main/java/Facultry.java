public class Facultry {

    public static int calculate(int i) {
        int result = 1;
        for(int j=2; j <= i; j++){
            result *= j;
        }
        return result;
    }
}
