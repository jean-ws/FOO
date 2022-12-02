public class App {
    public static void main(String[] args) {
        Venda venda = new Venda();
        venda.p1.dataVencimento = "12/08/2003";
        venda.cliente.endereco.cidade = "londrina";
        System.out.println(venda.p1.dataVencimento + ' ' + venda.cliente.endereco.cidade);
    }
}
