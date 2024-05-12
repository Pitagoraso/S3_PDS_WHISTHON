package PatronBuilder;
public class ManualBuilder implements Builder {
    private Manual manual;

    public ManualBuilder() {
        this.manual = new Manual();
    }

    @Override
    public void setCPU(String cpu) {
        manual.setCpuInfo("Informacion del CPU: " + cpu);
    }

    @Override
    public void setGPU(String gpu) {
        manual.setGpuInfo("Informacion del GPU: " + gpu);
    }

    @Override
    public void setMemoria(int memoria) {
        manual.setMemoriaInfo("Informacion de la memoria: " + memoria + "GB");
    }

    @Override
    public void setAlmacenamiento(int almacenamiento) {
        manual.setAlmacenamientoInfo("Informacion del almacenamiento: " + almacenamiento + "GB");
    }

    public Manual build() {
        return manual;
    }
}

