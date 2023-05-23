public class StutusNamorando implements StausRelacionamento{

    private StutusNamorando() {};
    private static StutusNamorando instance = new StutusNamorando();
    public static StutusNamorando getInstance() {
        return instance;
    }
    @Override
    public String getNomeStatus() {
        return "Relacionamento Serio";
    }
}
