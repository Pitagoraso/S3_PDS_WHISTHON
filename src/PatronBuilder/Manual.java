package PatronBuilder;
public class Manual {
    private String cpuInfo;
    private String gpuInfo;
    private String memoriaInfo;
    private String almacenamientoInfo;

    public void setCpuInfo(String cpuInfo) {
        this.cpuInfo = cpuInfo;
    }

    public void setGpuInfo(String gpuInfo) {
        this.gpuInfo = gpuInfo;
    }

    public void setMemoriaInfo(String memoriaInfo) {
        this.memoriaInfo = memoriaInfo;
    }

    public void setAlmacenamientoInfo(String almacenamientoInfo) {
        this.almacenamientoInfo = almacenamientoInfo;
    }

    @Override
    public String toString() {
        return "Manual{" +
               "cpuInfo='" + cpuInfo + '\'' +
               ", gpuInfo='" + gpuInfo + '\'' +
               ", memoriaInfo='" + memoriaInfo + '\'' +
               ", almacenamientoInfo='" + almacenamientoInfo + '\'' +
               '}';
    }
}


