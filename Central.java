import java.util.ArrayList;
import java.util.List;

public class Central {
    public static void main(String[] args){

        List<Cliente> cliente = new ArrayList<Cliente>();

        Cliente cliente01 = new Cliente();
        cliente01.setCpf("124.346.720-84");
        cliente01.setNome("Rodrigo Almeida");
        cliente01.setEmail("orodri@gmail.com");
        cliente01.setEndereco("Avenida quinzé");
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



