import java.time.LocalDate;

public class mentoria extends conteudo{
    private LocalDate data;
    public LocalDate getData(){
        return data;
    }
    public double  calcularXp(){
        return xp_padrao+20d;
    }
    public void setData(LocalDate data){
        this.data=data;
    } 
}
