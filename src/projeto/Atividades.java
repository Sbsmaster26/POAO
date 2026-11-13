package projeto;

import java.time.LocalDateTime;
/**
 * @author DanielCintrão & SalvadorSimões
 * @version 1.0
 */


/**
 * 
 * SuperClasse Atividades que cria uma atividade e retorna os respetivos dados, caso necessários
 */
public sealed class Atividades permits AulaGrupo, PersonalTraining{
    /**
     * nome da atividade
     */
    private String nomeAtividade;
    /**
     * responsável da atividade
     */
    private Instrutor responsavel;
    /**
     * data da atividade
     */
    private LocalDateTime data;
    /**
     * duração em minutos da atividade
     */
    private int duracaoMinutos;
    /**
     * construtor das atividades base que inicializa os atributos comuns a ambas subclasses da classe atividades
     * @param nomeAtividade nome da atividade
     * @param responsavel responsavel da atividade
     * @param data data da atividade
     * @param duracaoMinutos duração (em minutos) da atividade
     */
    public Atividades(String nomeAtividade, Instrutor responsavel, LocalDateTime data, int duracaoMinutos){
        this.nomeAtividade = nomeAtividade;
        this.responsavel = responsavel;
        this.data = data;
        this.duracaoMinutos = duracaoMinutos;
    }
    /**
     * método que retorna a capacidade máxima da atividade
     * @return retorna a capacidade máxima, 1 se for personal training e a respetiva variável se for aula de grupo
     */
    public int getCapMax(){
        return 1;
    }
    /**
     * método que retorna a duração da atividade
     * @return duracaoMinutos duração da atividade
     */
    public int getDuracaoMinutos(){
        return duracaoMinutos;
    }
    /**
     * método que retorna o nome da atividade
     * @return nomeAtividade nome da atividade
     */
    public String getNomeAtividade(){
        return nomeAtividade;
    }
    /**
     * método que retorna o instrutor responsável da atividade
     * @return responsavel instrutor responsável pela atividade
     */
    public Instrutor getResponsavel(){
        return responsavel;
    }
    /**
     * método que retorna a data da atividade
     * @return data data da atividade
     */
    public LocalDateTime getData(){
        return data;
    }
    /**
     * método que retorna o preço da sessão da atividade
     * @return retorna 0 pois a função que calcula o preço está dentro de cada uma das subclasses
     */
    public double precoSessao(){
        return 0.0;
    }
    /**    (non-Javadoc)
     * método toString que retorna as informações base da atividade
     * @see java.lang.Object#toString()
     */
    public String toString(){
        return "Atividade é " + nomeAtividade + " encarregue ao responsável " + responsavel + " na data " + data + " com uma duração de " + duracaoMinutos + " minutos.";
    }
}
