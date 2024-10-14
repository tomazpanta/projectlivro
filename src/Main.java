public class Main {
    public static void main(String[] args) {
        // Criando livros
        Livro livro1 = new Livro("1984", "George Orwell", 1949);
        Livro livro2 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);

        // Criando usuário
        Usuario usuario1 = new Usuario("Ana");

        // Criando biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // Exibindo livros disponíveis
        biblioteca.exibirLivrosDisponiveis();

        // Usuário empresta um livro
        usuario1.emprestarLivro(biblioteca, livro1);

        // Exibindo livros emprestados pelo usuário
        usuario1.exibirLivrosEmprestados();

        // Exibindo livros disponíveis após o empréstimo
        biblioteca.exibirLivrosDisponiveis();

        // Usuário devolve o livro
        usuario1.devolverLivro(biblioteca, livro1);

        // Exibindo livros disponíveis após a devolução
        biblioteca.exibirLivrosDisponiveis();
    }
}
