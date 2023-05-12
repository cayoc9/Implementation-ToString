public class Carro {
    String modelo;
    int anoFabricacao;
    double valor;

    public Carro(String modelo, int anoFabricacao, double valor) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carro {" +
                "modelo= '" + modelo + '\'' +
                ", Ano de Fabricacao= " + anoFabricacao +
                ", Valor= R$" + valor +
                "}";
    }
}
