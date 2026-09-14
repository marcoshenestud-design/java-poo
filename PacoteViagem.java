public class PacoteViagem {

    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int quantidadeDias;

    public PacoteViagem(Transporte transporte,
                         Hospedagem hospedagem,
                         String destino,
                         int quantidadeDias) {

        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.quantidadeDias = quantidadeDias;
    }

    public double calcularHospedagem() {
        return quantidadeDias * hospedagem.getValorDiaria();
    }

    public double calcularLucro(double valor, double margem) {
        return valor + (valor * margem / 100);
    }

    public double calcularTotalPacote(double margemLucro,
                                      double taxasAdicionais) {

        double subtotal = transporte.getValor() + calcularHospedagem();

        double comLucro = calcularLucro(subtotal, margemLucro);

        return comLucro + taxasAdicionais;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public String getDestino() {
        return destino;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }
}