package solid_srp_v1;

public class Fatura {

    private Livro livro;
    private int quantidade;
    private double porcDesconto;
    private double porcImposto;
    private double total;

    public Fatura(solid_srp_v1.Livro livro, int quantidade, double porcDesconto, double porcImposto, double total) {
        this.livro = livro;
        this.quantidade = quantidade;
        this.porcDesconto = porcDesconto;
        this.porcImposto = porcImposto;
        this.total = total;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPorcDesconto() {
        return porcDesconto;
    }

    public void setPorcDesconto(double porcDesconto) {
        this.porcDesconto = porcDesconto;
    }

    public double getPorcImposto() {
        return porcImposto;
    }

    public void setPorcImposto(double porcImposto) {
        this.porcImposto = porcImposto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double calcularTotal() {
        double preco = ((livro.preco - livro.preco * porcDesconto) * this.quantidade);
        double precoComImposto = preco * (1 + porcImposto);
        return precoComImposto;
    }
}