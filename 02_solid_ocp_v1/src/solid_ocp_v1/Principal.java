package solid_ocp_v1;

public class Principal {

    public static void main(String[] args) {

        Livro livro = new Livro("Sapiens: De animales a dioses", "Yuval Noah Harari", 2011, 88.99, "A1B2C3");
        Fatura fatura = new Fatura(livro, 1, 0.5, 0.1);
        PersistenciaDaFatura persistenciaDaFatura = new PersistenciaDaFatura(fatura);

        persistenciaDaFatura.salvarParaArquivoPdf("Sapiens.pdf");
        persistenciaDaFatura.salvarParaBancoDeDados();

    }
}
