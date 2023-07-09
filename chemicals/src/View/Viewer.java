package View;
import DataProcessing.Processing;

import java.util.*;

public class Viewer {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Processing processing = new Processing(); // создаём объект класса Processing
        Processing[] arrayOfObjects = new Processing[10];
        arrayOfObjects[0] = processing;
        processing.name = "untitled"; // задаем имя
        System.out.println("Задаём имя?: ");
        String allowName = in2.next();

        if (allowName.equals( "да")) {
            System.out.print("Имя вещества - ");
            processing.name = in.next();
        }
        processing.setWeight(1);
        processing.setVolume(1);

        processing.setAggregateState("none");



        System.out.println("Задаём вес?");
        String allowWeight = in.next();
        if (allowWeight.equals("да")) {
            System.out.print("Вес тела - ");
            double argument = in.nextDouble();
            processing.setWeight(argument);
        }

        System.out.println("Задаём объём на куб^3?");
        String allowVolume = in.next();

        if (allowVolume.equals("да")) {
            System.out.print("объём тела - ");
            double argument = in.nextDouble();
            processing.setVolume(argument);
        }

        System.out.println("Задаём объём по длине, широте и высоте?");
        String allowVolumeLWH = in.next();

        if (allowVolumeLWH.equals("да")) {
            System.out.print("длина, широта, высота.");
            double length = in.nextDouble();
            double width = in.nextDouble();
            double height = in.nextDouble();
            processing.setVolumeWithSizeInMeters(length, width, height);
        }

        System.out.println("Задаём Агрегатное состояние?");
        String allowAggregate = in.next();
        if (allowAggregate.equals("да")) {
            System.out.print("Агрегатное состояние тела - ");
            String argument = in.next();
            processing.setAggregateState(argument);
        }

        System.out.println("Находим плотность тела? ");
        String allowFindDensity = in.next();

        if (allowFindDensity.equals("да")) {
            processing.findOutTheDensity(processing.getWeight(), processing.getVolume());
        }

        processing.setDensity(processing.findOutTheDensity(processing.getWeight(), processing.getVolume()));
        System.out.println(arrayOfObjects[0]);

    }

}
