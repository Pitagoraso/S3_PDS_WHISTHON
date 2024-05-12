package PatronBuilder;
public class Computadora {
    private String cpu;
    private String gpu;
    private int memoria;
    private int almacenamiento;

    public Computadora(String cpu, String gpu, int memoria, int almacenamiento) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.memoria = memoria;
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "Computadora{" +
               "cpu='" + cpu + '\'' +
               ", gpu='" + gpu + '\'' +
               ", memoria=" + memoria +
               ", almacenamiento=" + almacenamiento +
               '}';
    }
}



