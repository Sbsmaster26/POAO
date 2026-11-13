package projeto;
import java.time.LocalDateTime;
/**
 * @author DanielCintrão & SalvadorSimões
 * @version 1.0
 */

/**
 * 
 * SubClasse SocioIndividual que cria um sócio individual e calcula e retorna os respetivos dados, caso necessários
 */
public final class SocioIndividual extends Socio {
    /**
     * ano de nascimento do sócio individual
     */
    private int anoNascimento;
    /**
     * construtor do sócio individual que inicializa os atributos
     * @param nome nome do sócio individual
     * @param identificacao identificação do sócio individual
     * @param email email do sócio individual
     * @param anoNascimento ano de nascimento do sócio individual
     */
    public SocioIndividual(String nome, int identificacao, String email, int anoNascimento){
        super(nome, identificacao, email);
        this.anoNascimento = anoNascimento;
    }
    /**
     * método que retorna o ano de nascimento do sócio individual
     * @return anoNascimento ano de nascimento do sócio individual
     */
    public int getAnoNascimento(){
        return anoNascimento;
    }
    /**    (non-Javadoc)
     * método que retorna o desconto do sócio individual
     * @see projeto.Socio#getDesconto()
     * @return retorna o valor do desconto dependendo da idade 
     */
    public double getDesconto(){
        if (LocalDateTime.now().getYear() - anoNascimento < 18) return 10.0; 
        if (LocalDateTime.now().getYear() - anoNascimento > 65) return 15.0;
        return 0.0;
    }
    /**    (non-Javadoc)
     * método que retorna as informações do sócio individual
     * @see projeto.Socio#toString()
     */
    public String toString(){
        return (super.toString() + " Sócio individual cujo ano de nascimento é " + anoNascimento);
    }
}
