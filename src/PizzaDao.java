import java.util.ArrayList;
import java.util.List;

public class PizzaDao implements InterfaceDao<Pizza> {
    private List<Pizza> banco = new ArrayList<>();

    public void inserir(Pizza p) {
        banco.add(p);
    }

    public void alterar(Pizza p) {
        // Substitui na lista (simulando update)
        for (int i = 0; i < banco.size(); i++) {
            if (banco.get(i).getId().equals(p.getId())) {
                banco.set(i, p);
                break;
            }
        }
    }

    public void excluir(Long id) {
        banco.removeIf(p -> p.getId().equals(id));
    }

    public List<Pizza> listar() {
        return banco;
    }
}