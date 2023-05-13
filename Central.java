import java.util.ArrayList;
import java.util.List;

public class Central {
    public static void main(String[] args){

        List<Cliente> cliente = new ArrayList<Cliente>();

        Cliente cliente01 = new Cliente();
        cliente01.setCpf("057.960.420-92");
        cliente01.setNome("Josiéli de Souza de Ramos");
        cliente01.setEmail("josielisouzaderamos@gmail.com");
        cliente01.setEndereco("Avenida Miguelzinho Lima 597, casa 13");
        cliente.add(cliente01);

        List<Produto> produtos = new ArrayList<Produto>();

        Produto produto01 = new Produto();
        produto01.setCodigo(54);
        produto01.setNomeDoProduto("Camiseta");
        produto01.setPreco(32.00);
        produto01.calculaDesconto();
        produtos.add(produto01);
        
        System.out.println(cliente);
        System.out.println(produtos);

    }

}



