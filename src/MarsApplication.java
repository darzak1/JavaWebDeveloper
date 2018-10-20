public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();

        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttribute();

        System.out.println("Zwiększamy prędkość do 3.");

        spirit.speed = 3;
        spirit.showAttribute();

        System.out.println("Zmiana temperatury na -90");
        spirit.temperature = -90;
        spirit.showAttribute();
        System.out.println("Sprawdzenie temperatury");
        spirit.checkTemperature();
        spirit.showAttribute();

        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "eksploracja opportunity";
        opportunity.speed = 2;
        opportunity.temperature = -60;

        opportunity.showAttribute();
        System.out.println("Zwiększamy prędkość do 3. dla opportunity");

        opportunity.speed = 3;
        opportunity.showAttribute();

        System.out.println("Zmiana temperatury na -90 dla opportunity");
        opportunity.temperature = -90;
        opportunity.showAttribute();
        System.out.println("Sprawdzenie temperatury dla opportunity");
        opportunity.checkTemperature();
        opportunity.showAttribute();

        opportunity.checkStatus();



    }
}

