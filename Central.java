public class Central {
    public static void main(String[] args) {
    
        Cliente cliente = new Cliente();
        cliente.setCpf("05796042092");
        cliente.setNome("Josiéli");
        cliente.setEmail("josielisouzaderamos@gmail.com");
        cliente.setEndereco("Avenida Miguelzinho Lima 597, casa 13");

        Produto produto = new Produto();
        produto.setCodigo(54);
        produto.setNomeDoProduto("Camiseta");
        produto.setPreco(32.90);

    }
}
