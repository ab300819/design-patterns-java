package guru.refactoring.bridge.example;

import guru.refactoring.bridge.example.devices.Device;
import guru.refactoring.bridge.example.devices.Radio;
import guru.refactoring.bridge.example.devices.Tv;
import guru.refactoring.bridge.example.remotes.AdvancedRemote;
import guru.refactoring.bridge.example.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
