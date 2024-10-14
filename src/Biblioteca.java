import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livrosDisponiveis;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livrosDisponiveis = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livrosDisponiveis.add(livro);
        System.out.println("Livro adicionado à biblioteca: " + livro.getTitulo());
    }

    public boolean removerLivro(Livro livro) {
        return livrosDisponiveis.remove(livro);
    }

    public void exibirLivrosDisponiveis() {
        System.out.println("Livros disponíveis na " + nome + ":");
        for (Livro livro : livrosDisponiveis) {
            livro.exibirInformacoes();
        }
    }
}
