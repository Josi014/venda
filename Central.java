import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Central {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        List<Cliente> cliente = new ArrayList<Cliente>();

        Cliente cliente01 = new Cliente();
        System.out.println("Qual é o seu cpf?");
        cliente01.setCpf( entrada.nextLine());
        System.out.println("Qual é o seu nome");
        cliente01.setNome(entrada.nextLine());
        System.out.println("Qual é o seu e-mail?");
        cliente01.setEmail(entrada.nextLine());
        System.out.println("Qual é o seu endereço?");
        cliente01.setEndereco(entrada.nextLine());
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

        entrada.close();
    }

}



