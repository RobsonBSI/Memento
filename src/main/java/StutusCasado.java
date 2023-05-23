public class StutusCasado implements StausRelacionamento{
    private StutusCasado() {};
    private static StutusCasado instance = new StutusCasado();
    public static StutusCasado getInstance() {
        return instance;
    }

    @Override
    public String getNomeStatus() {
        return "Casado";
    }
}
