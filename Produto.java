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
            return calculaDesconto(25.00);
        }
        Double calculaDesconto(Double novoDesconto) {
            return this.preco - novoDesconto;
        }
        public String toString(){
            return("Código:" + this.codigo + ",Nome do produto:" + this.nomeDoProduto + ",Preço:" + this.preco);
        }    
}