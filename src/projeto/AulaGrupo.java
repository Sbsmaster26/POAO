package projeto;

import java.time.LocalDateTime;
/**
 * @author DanielCintrão & SalvadorSimões
 * @version 1.0
 */

/**
 * 
 * SubClasse AulaGrupo que cria uma atividade do tipo aula grupo e calcula/retorna os respetivos dados, caso necessários
 */
public final class AulaGrupo extends Atividades{
    /**
     * capacidade máxima da aula de grupo
     */
    private int capMax;
    /**
     * tipo de atividade da aula de grupo
     */
    private TipoSessao tipoAtividade;
    /**
     * 
     * Enumeração do tipo TipoSessao que contém os tipos de sessão das aulas de grupo
     */
    public enum TipoSessao {
        yoga,
        spinning,
        zumba,
        crossfit
    }
    /**
     * construtor das aulas de grupo que inicializa os respetivos atributos
     * @param responsavel responsável da atividade
     * @param data data da atividade
     * @param duracaoMinutos duração (minutos) da atividade
     * @param capMax capacidade máxima da atividade
     * @param tipoAtividade tipo da atividade
     */
    public AulaGrupo(Instrutor responsavel, LocalDateTime data, int duracaoMinutos, int capMax, TipoSessao tipoAtividade){
        super("Aula de Grupo", responsavel, data, duracaoMinutos);
        this.capMax = capMax;
        this.tipoAtividade = tipoAtividade;
    }
    /**    (non-Javadoc)
     * método que retorna a capacidade máxima da atividade de grupo
     * @see projeto.Atividades#getCapMax()
     */
    public int getCapMax(){
        return capMax;
    }
    /**
     * método que retorna o tipo da atividade de grupo
     * @return tipoAtividade tipo da atividade
     */
    public TipoSessao getTipoAtividade(){
        return tipoAtividade;
    }
    /**    (non-Javadoc)
     * método que devolve o preço da sessão, dependendo do tipo
     * @see projeto.Atividades#precoSessao()
     * @return valor preço da sessão
     */
    public double precoSessao(){
        double valor = switch(this.tipoAtividade){
            case TipoSessao.yoga -> 8.0;
            case TipoSessao.spinning -> 9.0;
            case TipoSessao.zumba -> 8.5;
            case TipoSessao.crossfit -> 12;
            default ->{
                assert false: "Atividade desconhecida" + this.tipoAtividade;
                yield Double.NaN;
            }
        };
        return valor;
    }
    /**    (non-Javadoc)
     * método toString que retorna as informações da atividade aula de grupo
     * @see projeto.Atividades#toString()
     */
    public String toString(){
        return (super.toString() + "  A capacidade máxima é de " + capMax + " pessoas e é do tipo " + tipoAtividade);
    }
}
