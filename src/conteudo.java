public abstract class conteudo {
    protected static final double xp_padrao=10d;
    private String descricao;
    private String titulo;
    public abstract double calcularXp(); 
    
    public String getTitulo(){
        return titulo;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
}
