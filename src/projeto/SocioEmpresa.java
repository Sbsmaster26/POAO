package projeto;
/**
 * @author DanielCintrão & SalvadorSimões
 * @version 1.0
 */

/**
 * 
 * SubClasse SocioEmpresa que cria um sócio empresa e retorna os respetivos dados, caso necessários
 */
public final class SocioEmpresa extends Socio {
    /**
     * nome da empresa do sócio empresa
     */
    private String nomeEmpresa;
    /**
     * nif (nº de identificação fiscal) do sócio empresa
     */
    private int nif;
    /**
     * construtor do sócio empresa que inicializa os atributos
     * @param nome nome do sócio empresa
     * @param identificacao identificação do sócio empresa
     * @param email email do sócio empresa
     * @param nomeEmpresa nome da empresa do sócio empresa
     * @param nif nif (nº de identificação) do sócio empresa
     */
    public SocioEmpresa(String nome, int identificacao, String email, String nomeEmpresa, int nif){
        super(nome, identificacao, email);
        this.nomeEmpresa = nomeEmpresa;
        this.nif = nif;
    }
    /**
     * método que retorna o nome da empresa do sócio empresa
     * @return nomeEmpresa nome da empresa do sócio empresa
     */
    public String getNomeEmpresa(){
        return nomeEmpresa;
    }
    /**
     * método que retorna o nif do sócio empresa
     * @return nif nif do sócio empresa
     */
    public int getNif(){
        return nif;
    }
    /**    (non-Javadoc)
     * método que retorna o desconto (fixo) do sócio empresa
     * @see projeto.Socio#getDesconto()
     * @return 20
     */
    public double getDesconto(){
        return 20.0;
    }
    /**    (non-Javadoc)
     * método toString que retorna as informações do sócio empresa
     * @see projeto.Socio#toString()
     */
    public String toString(){
        return (super.toString() + " Empresa " + nomeEmpresa + ", cujo NIF é " + nif);
    }
}
