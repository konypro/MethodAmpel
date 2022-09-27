public class Main {
    public static void main(String[] args) {

        System.out.println(alarm(40, "Grün"));

    }

    public static String alarm(int personenzahl, String alarmstufe) {
        int i = 60;
        switch (alarmstufe) {
            case "Rot":
                i = 0;
                break;
            case "Gelb":
                i = 30;
                break;
            case "Grün":
                i = 60;
        }
                if (personenzahl > i) {
                    return "Personenzahl grosser als 30";
                } else {
                    return "Personenzahl ist kleiner als 30";
                }

    }

}