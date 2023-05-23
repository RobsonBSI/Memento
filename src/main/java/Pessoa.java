import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private StausRelacionamento status;
    private List<StausRelacionamento> memento = new ArrayList<StausRelacionamento>();

    public StausRelacionamento getStatus() {
        return this.status;
    }

    public void setStatus(StausRelacionamento status) {
        this.status = status;
        this.memento.add(this.status);
    }

    public void restauraStatus(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.status = this.memento.get(indice);
    }

    public List<StausRelacionamento> getStatusRelacionamento() {
        return this.memento;
    }
}
