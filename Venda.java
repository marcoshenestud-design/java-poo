public class Venda {

    private String nomeCliente;
    private String formaPagamento;
    private PacoteViagem pacote;

    public Venda(String nomeCliente,
                 String formaPagamento,
                 PacoteViagem pacote) {

        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.pacote = pacote;
    }

    public double converterParaReal(double valorDolar,
                                    double cotacaoDolar) {

        return valorDolar * cotacaoDolar;
    }

    public void mostrarVenda(double margemLucro,
                             double taxas,
                             double cotacao) {

        double totalDolar = pacote.calcularTotalPacote(margemLucro, taxas);
        double totalReal = converterParaReal(totalDolar, cotacao);

        System.out.println("\n========= VENDA =========");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Forma de pagamento: " + formaPagamento);

        System.out.println("\nDestino: " + pacote.getDestino());
        System.out.println("Transporte: " + pacote.getTransporte().getTipo());
        System.out.println("Hospedagem: " + pacote.getHospedagem().getDescricao());
        System.out.println("Dias: " + pacote.getQuantidadeDias());

        System.out.printf("\nTotal em dólar: US$ %.2f%n", totalDolar);
        System.out.printf("Total em reais: R$ %.2f%n", totalReal);
    }
}