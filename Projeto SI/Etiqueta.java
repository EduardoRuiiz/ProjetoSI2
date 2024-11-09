
public class Etiqueta {

    private String validProduto;
    private String fabricProduto;
    private String nomeProduto;
    private String responsavel;
    private String numLote;

    public Etiqueta(String validProduto, String fabricProduto, String nomeProduto, String responsavel, String numLote) {
        this.validProduto = validProduto;
        this.fabricProduto = fabricProduto;
        this.nomeProduto = nomeProduto;
        this.responsavel = responsavel;
        this.numLote = numLote;
    }

    public String getValidProduto() {
        return validProduto;
    }

    public void setValidProduto(String validProduto) {
        this.validProduto = validProduto;
    }

    public String getFabricProduto() {
        return fabricProduto;
    }

    public void setFabricProduto(String fabricProduto) {
        this.fabricProduto = fabricProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getNumLote() {
        return numLote;
    }

    public void setNumLote(String numLote) {
        this.numLote = numLote;
    }

    public String exibirEtiqueta() {
        return "DADOS DA IMPRESSÃO \nValidade do Produto: " + getValidProduto() + "\nFabricação do Produto: " + getFabricProduto() + "\nNome do produto: "
                + getNomeProduto() + "\nEmissor da etiqueta: " + getResponsavel() + "\nLote: " + getNumLote();
    }

}
