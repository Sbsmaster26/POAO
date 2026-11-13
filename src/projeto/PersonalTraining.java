package projeto;

import java.time.LocalDateTime;
/**
 * @author DanielCintrão & SalvadorSimões
 * @version 1.0
 */

/**
 * 
 * SubClasse PersonalTraining que cria uma atividade do tipo personal training e calcula/retorna os respetivos dados, caso necessários
 */
public final class PersonalTraining extends Atividades{
    /**
     * nível de treino da sessão de personal training
     */
    private TipoSessao nivelTreino;
    /**
     * 
     * Enumeração do tipo TipoSessao
     */
    public enum TipoSessao {
        iniciacao,
        intermedio,
        avancado
    }
    /**
     * construtor do personal training que inicializa os respetivos atributos
     * @param responsavel responsável do personal training
     * @param data data do personal training
     * @param duracaoMinutos duração do personal training
     * @param nivelTreino nivel de treino do personal training
     */
    public PersonalTraining(Instrutor responsavel, LocalDateTime data, int duracaoMinutos, TipoSessao nivelTreino){
        super("Personal Training", responsavel, data, duracaoMinutos);
        this.nivelTreino = nivelTreino;
    }
    /**
     * método que retorna o nivel de treino do personal training
     * @return nivelTreino nível do treino do personal training
     */
    public TipoSessao getTipoAtividade(){
        return nivelTreino;
    }
    /**    (non-Javadoc)
     * método que devolve o preço da sessão, dependendo do tipo
     * @see projeto.Atividades#precoSessao()
     * @return valor preço da sessão
     */
    public double precoSessao(){
        double valor = switch(this.nivelTreino){
            case TipoSessao.iniciacao -> 18.0;
            case TipoSessao.intermedio -> 22.0;
            case TipoSessao.avancado -> 28.0;
            default ->{
                assert false: "Atividade desconhecida" + this.nivelTreino;
                yield Double.NaN;
            }
        };
        return valor;
    }
    /**    (non-Javadoc)
     * método toString que retorna as informações do personal training
     * @see projeto.Atividades#toString()
     */
    public String toString(){
        return (super.toString() + " O nível de treino da sessão é " + nivelTreino);
    }
}
