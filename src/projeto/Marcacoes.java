package projeto;

import java.time.LocalDateTime;
/**
 * @author DanielCintrão & SalvadorSimões
 * @version 1.0
 */

/**
 * 
 * Classe Marcacoes que cria as marcações, associando um socio, atividade e data. Contém 
 * métodos retornam os respetivos dados, caso necessários
 */
public class Marcacoes {
    /**
     * socio associado à atividade
     */
    private Socio socio;
    /**
     * atividade associada à marcação
     */
    private Atividades atividade;
    /**
     * data da marcação
     */
    private LocalDateTime data;
    /**
     * Construtor de marcações que inicializa os atributos
     * @param socio socio que vai ser associado à marcação
     * @param atividade atividade que vai ser associado à marcação
     */
    public Marcacoes(Socio socio, Atividades atividade){
        this.socio = socio;
        this.atividade = atividade;
        this.data = atividade.getData();
    }
    /**
     * método que retorna o sócio associado à marcação
     * @return socio socio a ser retornado
     */
    public Socio getSocio(){
        return socio;
    }
    /**
     * método que retorna a data associada à marcação
     * @return data data a ser retornada
     */
    public LocalDateTime getData(){
        return data;
    }
    /**
     * método que retorna a atividade associada à marcação
     * @return atividade atividade a ser retornada
     */
    public Atividades getAtividade(){
        return atividade;
    }
    /**
     * método que calcula o valor final da marcação, aplicando o desconto do respetivo sócio
     * @return retorna o valor do custo final
     */
    public double custoFinal(){
        return (atividade.precoSessao() - (atividade.precoSessao() * (socio.getDesconto() / 100)));
    }
    /**    (non-Javadoc)
     * método toString que retorna as informações da marcação em questão
     * @see java.lang.Object#toString()
     */
    public String toString(){
        return "Marcação do sócio " + socio + ". " + atividade + " na data " + data + " com custo de " + custoFinal() + " euros";
    }
}
