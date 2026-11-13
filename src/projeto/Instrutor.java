package projeto;
/**
 * @author DanielCintrão & SalvadorSimões
 * @version 1.0
 */

/**
 * 
 * Classe Instrutor que cria um instrutor e retorna os respetivos dados, caso necessários
 */
public final class Instrutor{
    /**
     * nome do instrutor
     */
    private String nome;
    /**
     * género do instrutor
     */
    private String genero;
    /**
     * formações do instrutor
     */
    private String formacoes;
    /**
     * construtor do instrutor que inicializa os atributos
     * @param nome nome do instrutor
     * @param genero género do instrutor
     * @param formacoes formações do instrutor
     */
    public Instrutor(String nome, String genero, String formacoes){
        this.nome = nome;
        this.genero = genero;
        this.formacoes = formacoes;
    }
    /**
     * método que retorna o nome do instrutor
     * @return nome nome do instrutor a retornar
     */
    public String getNome(){
        return nome;
    }
    /**
     * método que retorna o género do instrutor
     * @return genero género do instrutor a retornar
     */
    public String getGenero(){
        return genero;
    }
    /**
     * método que retorna as formações do instrutor
     * @return formacoes formações do instrutor a retornar
     */
    public String getFormacoes(){
        return formacoes;
    }
    /**    (non-Javadoc)
     * método toString que retorna as informações do instrutor
     * @see java.lang.Object#toString()
     */
    public String toString(){
        return nome + " do género " + genero + " com formações em " + formacoes;
    }
}
