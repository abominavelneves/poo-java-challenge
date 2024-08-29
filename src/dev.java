import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
public class dev {
    private String nome;
    private Set<conteudo> cursosInscritos=new LinkedHashSet<>();
    private Set<conteudo> cursosFinalizados=new LinkedHashSet<>();
    public Set<conteudo> getCursosInscritos(){
        return cursosInscritos;
    }
    public Set<conteudo> getCursosFinalizados(){
        return cursosFinalizados;
    }
    public void setCursosInscritos(Set<conteudo> cursoInscrito){
        this.cursosInscritos=cursoInscrito;
    }
    public void setCursosFinalizados(Set<conteudo> cursoFinalizado){
        this.cursosFinalizados=cursoFinalizado;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void inscreverBootcamp(bootcamp novoBootcamp){
        this.cursosInscritos.addAll(novoBootcamp.getConteudos());
        novoBootcamp.getInscritos().add(this);
    }
    public double calcularTotalXp(){
        return this.cursosFinalizados.stream().mapToDouble(conteudo ->conteudo.calcularXp()).sum();
    }
    public void progredir(){
        Optional<conteudo> conteudo =this.cursosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.cursosFinalizados.add(conteudo.get());
            this.cursosInscritos.remove(conteudo.get());
        }
        else{
            System.err.println("Você não está matriculado.");
        }
    }
}
