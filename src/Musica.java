public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacao;
    int numAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println("Nome do título: " + titulo);
        System.out.println("Nome do artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avaliaMusica(double nota) {
        somaAvaliacao+= nota;
        numAvaliacoes++;
    }

    double pegaMedia() {
        return somaAvaliacao/numAvaliacoes;
    }
}