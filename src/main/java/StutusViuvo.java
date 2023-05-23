public class StutusViuvo implements StausRelacionamento{

    private StutusViuvo() {};
    private static StutusViuvo instance = new StutusViuvo();
    public static StutusViuvo getInstance() {
        return instance;
    }

    @Override
    public String getNomeStatus() {
        return "Viuvo";
    }
}
