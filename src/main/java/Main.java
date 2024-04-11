import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da compra");
        Double valor = scanner.nextDouble();
        System.out.println("Digite a forma de pagamento [1] a vista [2] cartao");
        Integer formaDePagamento = scanner.nextInt();

        Compra compra = new Compra(valor, formaDePagamento);

        if (compra.getFormaDePagamento() == 1) {
            AvistaService avistaService = new AvistaService(compra);
            avistaService.processar();
            System.out.println("valor a pagar: " + avistaService.getValorFinal());
        } else if (compra.getFormaDePagamento() == 2) {
            System.out.println("digite a bandeira do cartao [1] visa [2] outros");
            Integer bandeira = scanner.nextInt();
            System.out.println("digite a quantidade de parcelas");
            Integer parcelas = scanner.nextInt();
            CartaoService cartaoService = new CartaoService(compra, parcelas, bandeira);
            cartaoService.processar();

            System.out.println("valor a pagar: " + cartaoService.getValorFinal() + " em " + cartaoService.getParcelas()
                    + " parcelas");
        }
    }

}