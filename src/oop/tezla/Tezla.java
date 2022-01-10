package oop.tezla;

public class Tezla extends Automobile {
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public Tezla() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 11;
    }

    public void accelerateByAutopilot() { // исправьте метод для ускорения при автопилоте
        if (speed < autoPilotMaxSpeed) {
            speed += autoPilotAcceleration;// + 11 км в час каждую секунду
        } else {
            speed = autoPilotMaxSpeed; // 300 км в час...
        }
    }

    @Override
    public void accelerate() {  // переопределите метод для ускорения
        if (speed < maxSpeed) {
            speed += acceleration;
        } else {
            speed = maxSpeed;
        }
    }

    @Override// переопределите метод для торможения
    public void brake() {
        if (speed > 0) {
            speed -= brakingSpeed;
        } else {
            speed = 0;
        }
    }
}
