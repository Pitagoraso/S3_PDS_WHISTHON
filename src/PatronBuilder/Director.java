package PatronBuilder;
public class Director {
    public void construirComputadoraGaming(Builder builder) {
        builder.setCPU("Intel i9");
        builder.setGPU("NVIDIA RTX 3080");
        builder.setMemoria(32);
        builder.setAlmacenamiento(1000);
    }

    public void construirManualComputadoraGaming(Builder builder) {
        builder.setCPU("Intel i9");
        builder.setGPU("NVIDIA RTX 3080");
        builder.setMemoria(32);
        builder.setAlmacenamiento(1000);
    }
}

