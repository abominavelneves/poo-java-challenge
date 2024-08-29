public class curso extends conteudo{
    private int cargaHoraria;
    public double calcularXp(){
        return xp_padrao*cargaHoraria;
    }

    public int getCarga(){
        return cargaHoraria;
    }
    public void setCarga(int carga){
        this.cargaHoraria=carga;
    }
}
