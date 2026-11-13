package projeto;
/**
 * @author DanielCintrão & SalvadorSimões
 * @version 1.0
 */

/**
 * 
 * SuperClasse Socio que cria um sócio e retorna os respetivos dados, caso necessários
 */
public sealed class Socio permits SocioIndividual, SocioEmpresa{
    /**
     * nome do sócio
     */
    private String nome;
    /**
     * nº de identificação do sócio
     */
    private int identificacao;
    /**
     * email do sócio
     */
    private String email;
    /**
     * construtor do sócio base, com as informações comuns a ambos os tipos de sócio
     * @param nome nome do sócio
     * @param identificacao identificação do sócio
     * @param email email do sócio
     */
    public Socio(String nome, int identificacao, String email){
        this.nome = nome;
        this.identificacao = identificacao;
        this.email = email;
    }
    /**
     * método que retorna o nome do sócio
     * @return nome nome do sócio a retornar
     */
    public String getNome(){
        return nome;
    }
    /**
     * método que retorna a identificacão do sócio
     * @return identificacao identificação do sócio a retornar
     */
    public int getIdentificacao(){
        return identificacao;
    }
    /**
     * método que retorna o email do sócio
     * @return email email do sócio
     */
    public String getEmail(){
        return email;
    }
    /**
     * método que retorna o desconto do sócio
     * @return retorna o desconto do sócio
     */
    public double getDesconto(){
        return 0.0;
    }
    /**    (non-Javadoc)
     * método toString que retorna as informações do sócio
     * @see java.lang.Object#toString()
     */
    public String toString(){
        return ("Socio " + nome + " nº " + identificacao + ", email é " + email + ".");
    }
}
