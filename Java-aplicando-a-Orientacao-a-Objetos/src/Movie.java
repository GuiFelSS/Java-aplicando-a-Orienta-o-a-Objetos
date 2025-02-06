public class Movie {
    String nome;
    int andDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvalialoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de lançamento: " + andDeLancamento);
    }

    void avalia(double note) {
        somaDasAvaliacoes += note;
        totalDeAvalialoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvalialoes;
    }
}
