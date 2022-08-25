public class TrafficLightSwitch {

    public static void main(String args[]) {
        String color = null;
        switch(color) {
            case "Red":
                System.out.println("Next light is Red.");
                break;
            case "Yellow":
                System.out.println("Next light is Yellow.");
                break;
            case "Green":
                System.out.println("Next light is Green.");
                break;
            default:
                System.out.println("Invalid signal.");
                break;
        }
       
    }

}
