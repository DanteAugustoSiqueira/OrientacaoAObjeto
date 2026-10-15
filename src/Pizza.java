// Subclasse
class Pizza extends Produto {
    private String sabor;
    private Tamanho tamanho;

    public String getSabor() { return sabor; }
    public void setSabor(String sabor) { this.sabor = sabor; }
    public Tamanho getTamanho() { return tamanho; }
    public void setTamanho(Tamanho tamanho) { this.tamanho = tamanho; }
}