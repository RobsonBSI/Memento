public class StutusSolteiro implements StausRelacionamento{
    private StutusSolteiro() {};
    private static StutusSolteiro instance = new StutusSolteiro();
    public static StutusSolteiro getInstance() {
        return instance;
    }

    @Override
    public String getNomeStatus() {
        return "Solteiro";
    }
}
