import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
public class bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial=LocalDate.now();
    private final LocalDate dataFinal=dataInicial.plusDays(45);
    private Set<dev> devsIncritos=new HashSet<>();
    private Set<conteudo> conteudosBootcamp = new HashSet<>();
    public String getNome(){
        return nome;
    }
    public String getDescricao(){
        return descricao;
    }
    public LocalDate getDataInicial(){
        return dataInicial;
    }
    public LocalDate getDataFinal(){
        return dataFinal;
    }
    public Set<dev> getInscritos(){
        return devsIncritos;
    }
    public Set<conteudo> getConteudos(){
        return conteudosBootcamp;
    }
}
