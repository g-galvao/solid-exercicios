package solid_lsp_v1;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(1212, "Dev Jr", "Gabriel");
        Vendedor vendedor = new Vendedor(2323, "Vendedora Jr", "Frida", 456);
        Gerente gerente = new Gerente(4545, "Gerente Geral", "Benigna", 678);

        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        FolhaSalarial folhaSalarial = null;

        folhaSalarial.imprimirFolhaSalarial(funcionarios);
    }
}
