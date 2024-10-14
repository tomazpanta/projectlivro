import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void emprestarLivro(Biblioteca biblioteca, Livro livro) {
        if (biblioteca.removerLivro(livro)) {
            livrosEmprestados.add(livro);
            System.out.println(nome + " emprestou o livro: " + livro.getTitulo());
        } else {
            System.out.println("O livro " + livro.getTitulo() + " não está disponível.");
        }
    }

    public void devolverLivro(Biblioteca biblioteca, Livro livro) {
        if (livrosEmprestados.remove(livro)) {
            biblioteca.adicionarLivro(livro);
            System.out.println(nome + " devolveu o livro: " + livro.getTitulo());
        } else {
            System.out.println("O usuário " + nome + " não tem o livro " + livro.getTitulo() + " emprestado.");
        }
    }

    public void exibirLivrosEmprestados() {
        System.out.println("Livros emprestados por " + nome + ":");
        for (Livro livro : livrosEmprestados) {
            livro.exibirInformacoes();
        }
    }
}
