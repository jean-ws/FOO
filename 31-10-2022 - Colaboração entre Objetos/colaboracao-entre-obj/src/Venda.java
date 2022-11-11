public class Venda {
    String dataVenda;
    double totalVenda;
    String numeroNF;

    Cliente cliente;
    Vendedor vendedor;
    Parcela p1, p2, p3;

    public Venda(){
        cliente = new Cliente();
        vendedor = new Vendedor();
        p1 = new Parcela();
        p2 = new Parcela();
        p2 = new Parcela();
    }
}
