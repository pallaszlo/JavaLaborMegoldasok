/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.fel3;

/**
 * @author pali
 */
abstract class Car {

    private String make;

    public abstract void start();

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    @Override
    public String toString() {
        return "Car{" + "make=" + make + '}';
    }

}

public class TestCar {

    public static void main(String args[]) {

        class Toyota extends Car {
            int batteryPower = 1000;

            @Override
            public void start() {
                batteryPower -= 100;
            }

            @Override
            public String toString() {
                return "Toyota{" +
                        "batteryPower=" + batteryPower +
                        '}';
            }
        }

        Car t = new Toyota();
        t.setMake("Toyota");
        System.out.println(t);

        Car bmw  = new Car(){
            int batteryPower = 2000;

            @Override
            public void start() {
                batteryPower -= 100;
            }

            @Override
            public String toString() {
                String s = super.toString();
                return s + "{" + "batteryPower=" + batteryPower + '}';
            }
        };
        bmw.setMake("BMW");
        bmw.start();
        System.out.println(bmw);


        Car hc = new Car() {
            int batteryPower = 3000;

            @Override
            public void start() {
                batteryPower -= 100;
            }

            @Override
            public String toString() {
                String s = super.toString();
                return s + "{" + "batteryPower=" + batteryPower + '}';
            }
        };

        hc.setMake("Toyota");
        hc.start();
        System.out.println(hc);


        Car hc2 = new Car() {
            int batteryPower = 3000;

            @Override
            public void start() {
                batteryPower -= 100;
            }

            @Override
            public String toString() {
                String s = super.toString();
                return s + "{" + "batteryPower=" + batteryPower + '}';
            }
        };
    }

}
