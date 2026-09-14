import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== CADASTRO DO PACOTE =====");

        System.out.print("Destino: ");
        String destino = sc.nextLine();

        System.out.print("Tipo de transporte: ");
        String tipoTransporte = sc.nextLine();

        System.out.print("Valor do transporte (US$): ");
        double valorTransporte = sc.nextDouble();
        sc.nextLine();

        System.out.print("Descrição da hospedagem: ");
        String descricaoHosp = sc.nextLine();

        System.out.print("Valor da diária (US$): ");
        double diaria = sc.nextDouble();

        System.out.print("Quantidade de dias: ");
        int dias = sc.nextInt();

        System.out.print("Margem de lucro (%): ");
        double margem = sc.nextDouble();

        System.out.print("Taxas adicionais (US$): ");
        double taxas = sc.nextDouble();

        Transporte transporte =
                new Transporte(tipoTransporte, valorTransporte);

        Hospedagem hospedagem =
                new Hospedagem(descricaoHosp, diaria);

        PacoteViagem pacote =
                new PacoteViagem(transporte,
                        hospedagem,
                        destino,
                        dias);

        double totalPacote =
                pacote.calcularTotalPacote(margem, taxas);

        System.out.println("\n===== PACOTE =====");

        System.out.println("Destino: " + destino);
        System.out.println("Transporte: " + tipoTransporte);
        System.out.println("Hospedagem: " + descricaoHosp);
        System.out.println("Dias: " + dias);

        System.out.printf("Valor do pacote: US$ %.2f%n",
                totalPacote);

        sc.nextLine();

        System.out.println("\n===== DADOS DA VENDA =====");

        System.out.print("Nome do cliente: ");
        String cliente = sc.nextLine();

        System.out.print("Forma de pagamento: ");
        String pagamento = sc.nextLine();

        System.out.print("Cotação do dólar: ");
        double cotacao = sc.nextDouble();

        Venda venda =
                new Venda(cliente,
                        pagamento,
                        pacote);

        venda.mostrarVenda(margem,
                taxas,
                cotacao);

        sc.close();
    }
}