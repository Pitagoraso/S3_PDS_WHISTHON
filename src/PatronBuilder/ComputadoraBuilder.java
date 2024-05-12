package PatronBuilder;
public class ComputadoraBuilder implements Builder {
    private String cpu;
    private String gpu;
    private int memoria;
    private int almacenamiento;

    @Override
    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setGPU(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public Computadora build() {
        return new Computadora(cpu, gpu, memoria, almacenamiento);
    }
}

