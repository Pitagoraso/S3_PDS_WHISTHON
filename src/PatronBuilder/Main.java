package PatronBuilder;
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        ComputadoraBuilder computadoraBuilder = new ComputadoraBuilder();
        ManualBuilder manualBuilder = new ManualBuilder();

        director.construirComputadoraGaming(computadoraBuilder);
        Computadora computadora = computadoraBuilder.build();
        System.out.println(computadora);

        director.construirManualComputadoraGaming(manualBuilder);
        Manual manual = manualBuilder.build();
        System.out.println(manual);
    }
}

