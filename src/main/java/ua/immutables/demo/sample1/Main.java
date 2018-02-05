package ua.immutables.demo.sample1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        sampleClass();

//        sampleAnnotation();

        sampleInterface();
    }

    private static void sampleClass() {
        SampleClass sampleClass = ImmSampleClass.builder()
                .move(30)
                .text("Immutable class sample")
                .build();

        System.out.println(sampleClass.text());
        System.out.println(sampleClass.move());
    }

    private static void sampleAnnotation() {
        SampleAnnotation sampleAnnotation = ImmSampleAnnotation.builder()
                .name("FCRA Team")
                .type("Financial project")
                .build();

        System.out.println(sampleAnnotation.name());
        System.out.println(sampleAnnotation.type());
    }

    private static void sampleInterface() {
        SampleInterface sampleInterface = ImmSampleInterface.builder()
                .message("Immutable interface sample")
                .multiply(20)
                .addNums(34)
                .build();

        System.out.println(sampleInterface.message());
        System.out.println(sampleInterface.multiply());
    }

    private static void sampleInterface1() {
        SampleInterface sampleInterface = ImmSampleInterface.builder()
                .message("Immutable interface sample")
                .multiply(20)
                .addNums(5, 57, 98)
                .build();

        System.out.println(sampleInterface.message());
        System.out.println(sampleInterface.multiply());
        System.out.println(sampleInterface.nums());
    }

    private static void sampleInterface2() {
        SampleInterface sampleInterface = ImmSampleInterface.builder()
                .message("Immutable interface sample")
                .multiply(20)
                .addNums(5, 57, 98)
                .click(8)
                .truth("True")
                .up(Arrays.asList("Printer", "Monitor", "Keyboard"))
                .build();

        System.out.println(sampleInterface.onClick());
        System.out.println(sampleInterface.isTruth());
        System.out.println(sampleInterface.upset());
    }
}
