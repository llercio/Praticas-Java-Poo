public class Carro {
    String modelo;
    int anoLancamento;
    String corDoCarro;

    void exibirFichaTecnica() {
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano do carro: " + anoLancamento);
        System.out.println("Cor do carro: " + corDoCarro);
    }

    int calcularIdade(int anoAtual) {
        return anoAtual - anoLancamento;
    }
}
