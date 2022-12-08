package solid_srp_v1;

public class Principal {

    public static void main(String[] args) {

        Livro livro = new Livro("Sapiens", "Yuval Noah Harari", 2011, 88.26, "9780062316097");
        Fatura fatura = new Fatura(livro, 1, 0.5, 0.1, 90);
        //fatura.calcularTotal();
        ImpressaoDeFatura impressaoDeFatura = new ImpressaoDeFatura(fatura);
        impressaoDeFatura.imprimir();

    }
}
