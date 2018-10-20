public class MarsRobot implements Robot{
    String status;
    int speed;
    float temperature;

    public void checkTemperature() {
        if (temperature < -80) {
            status = "powrtót do bazy";

            speed = 5;
        }
    }

    public void showAttribute() {
        System.out.println("Status: " + status);
        System.out.println("Prędkość: " + speed);
        System.out.println("Temperatura: " + temperature);

    }
    public void checkStatus () {

        System.out.println("Status: " + status);
        System.out.println("Prędkość: " + speed);
        System.out.println("Temperatura: " + temperature);
    }

}
