public class Produto{
    private int codigo;
    private String nomeDoProduto;
    private Double preco;    
    
    
    public int getCodigo() {
        return codigo;
        }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
        }
    public String getNomeDoProduto() {
        return nomeDoProduto;
        }
    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
        }
    public Double getPreco() {
        return preco;
        }
    public void setPreco(Double preco) {
        this.preco = preco;
        }

        Double calculaDesconto() {
            return calculaDesconto(5.00);
        }
        Double calculaDesconto(Double novoDesconto) {
            return this.preco - (this.preco * novoDesconto/100);
        }

        Produto() {
            this(00);
        }
        Produto(int codigo){
            this(codigo, "Nome do Produto");
        }
        Produto(int codigo, String nomeDoProduto) {
            this(codigo, nomeDoProduto, 1.00);
        }
        Produto(int codigo, String nomeDoProduto, Double preco) {
            this.codigo = codigo;
            this.nomeDoProduto = nomeDoProduto;
            this.preco = preco;
        }

        public String toString(){
            return " Código: " + this.codigo +"," + " Nome do produto: " + this.nomeDoProduto +"," + " Preço: R$" + this.preco +","+ " Valor com desconto: R$" + this.calculaDesconto();
        }    
}