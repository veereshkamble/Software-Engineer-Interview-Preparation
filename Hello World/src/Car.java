/* A Car class to represent a class
/* A class is a blueprint to create objects
 A class has attributes and methods*/

import java.awt.*;

public class Car {

    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailLightsWorking;

    public Car(double inputAverageMPG,
               String inputLicensePlate,
               Color inputPaintColor,
               boolean inputAreTailLightsWorking) {
        this.averageMilesPerGallon = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailLightsWorking = inputAreTailLightsWorking;
    }

    public void changePaintColor(Color newPaintColor) {
        this.paintColor = newPaintColor;
    }

    public double speedingUp(double currentSpeed) {
        currentSpeed += 100;
        return currentSpeed;
    }

}
