public class StutusDivorciado implements StausRelacionamento{

    private StutusDivorciado() {};
    private static StutusDivorciado instance = new StutusDivorciado();
    public static StutusDivorciado getInstance() {
        return instance;
    }

    @Override
    public String getNomeStatus() {
        return "Divorciado";
    }
}
