package projeto;

import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 * @author DanielCintrão & SalvadorSimões
 * @version 1.0
 */

/**
 * 
 * Classe Ginasio para gerir o ginásio, que contém os métodos principais
 */
public class Ginasio {
    /**
     * Lista dos sócios individuais
     */
    private ArrayList<Socio> sociosIndividual;
    /**
     * Lista dos sócios empresa
     */
    private ArrayList<Socio> sociosEmpresa;
    /**
     * Lista das atividades de aula de grupo
     */
    private ArrayList<Atividades> atividadesAulaGrupo;
    /**
     * Lista das atividades de personal training
     */
    private ArrayList<Atividades> atividadesPersonalTraining;
    /**
     * Lista dos instrutores
     */
    private ArrayList<Instrutor> instrutores;
    /**
     * Lista das marcações
     */
    private ArrayList<Marcacoes> marcacoes;
    /**
     * construtor do ginásio que inicializa os arrays
     */
    public Ginasio(){
        sociosIndividual = new ArrayList<Socio>();
        sociosEmpresa = new ArrayList<Socio>();
        atividadesAulaGrupo = new ArrayList<Atividades>();
        atividadesPersonalTraining = new ArrayList<Atividades>();
        instrutores = new ArrayList<Instrutor>();
        marcacoes = new ArrayList<Marcacoes>();
    }
    /**
     * método para carregar dados para os testes do programa
     */
    public void carregarDados(){
        SocioIndividual socioIndividual1 = new SocioIndividual("Daniel", 111, "daniel@gmail.com", 1950);
        SocioIndividual socioIndividual2 = new SocioIndividual("Bernardo", 112, "bernardo@gmail.com", 2002);
        SocioIndividual socioIndividual3 = new SocioIndividual("André", 113, "andre@gmail.com", 2011);
        SocioEmpresa socioEmpresa1 = new SocioEmpresa("Salvador", 221, "salvas@gmail.com", "MarmeladaLDA", 234234234);
        SocioEmpresa socioEmpresa2 = new SocioEmpresa("Pedro", 222, "pedro@gmail.com", "MarmeladaLDA", 245245245);
        SocioEmpresa socioEmpresa3 = new SocioEmpresa("Rodrigo", 223, "rodrigo@gmail.com", "MarmeladaLDA", 256256256);

        Instrutor instrutor1 = new Instrutor("Miguel", "Masculino", "Ginástica e atletismo");
        Instrutor instrutor2 = new Instrutor("Manel", "Masculino", "Professor ef");
        Instrutor instrutor3 = new Instrutor("Bruno", "Masculino", "Nutricionista");

        AulaGrupo atividade1 = new AulaGrupo(instrutor1, LocalDateTime.of(2026, 11, 24, 16, 0), 60, 10, AulaGrupo.TipoSessao.yoga);
        AulaGrupo atividade2 = new AulaGrupo(instrutor1, LocalDateTime.of(2026, 11, 25, 16, 0), 60, 5, AulaGrupo.TipoSessao.spinning);
        AulaGrupo atividade3 = new AulaGrupo(instrutor2, LocalDateTime.of(2026, 11, 26, 16, 0), 60, 5, AulaGrupo.TipoSessao.zumba);
        AulaGrupo atividade4 = new AulaGrupo(instrutor3, LocalDateTime.of(2026, 11, 27, 16, 0), 60, 8, AulaGrupo.TipoSessao.crossfit);
        AulaGrupo atividade5 = new AulaGrupo(instrutor2, LocalDateTime.of(2026, 11, 28, 16, 30), 60, 10, AulaGrupo.TipoSessao.yoga);
        PersonalTraining atividade6 = new PersonalTraining(instrutor2, LocalDateTime.of(2026, 11, 25, 18, 0), 60, PersonalTraining.TipoSessao.iniciacao);
        PersonalTraining atividade7 = new PersonalTraining(instrutor3, LocalDateTime.of(2026, 11, 26, 18, 0), 60, PersonalTraining.TipoSessao.intermedio);
        PersonalTraining atividade8 = new PersonalTraining(instrutor3, LocalDateTime.of(2026, 11, 27, 18, 30), 60, PersonalTraining.TipoSessao.avancado);

        Marcacoes marcacao1 = new Marcacoes(socioIndividual1, atividade1);
        Marcacoes marcacao2 = new Marcacoes(socioIndividual2, atividade2);
        Marcacoes marcacao3 = new Marcacoes(socioIndividual3, atividade3);
        Marcacoes marcacao4 = new Marcacoes(socioEmpresa1, atividade4);
        Marcacoes marcacao5 = new Marcacoes(socioEmpresa2, atividade5);
        Marcacoes marcacao6 = new Marcacoes(socioEmpresa3, atividade6);

        registarSocioIndividual(socioIndividual1);
        registarSocioIndividual(socioIndividual2);
        registarSocioIndividual(socioIndividual3);
        registarSocioEmpresa(socioEmpresa1);
        registarSocioEmpresa(socioEmpresa2);
        registarSocioEmpresa(socioEmpresa3);

        registarInstrutor(instrutor1);
        registarInstrutor(instrutor2);
        registarInstrutor(instrutor3);

        registarAtividadeAulaGrupo(atividade1);
        registarAtividadeAulaGrupo(atividade2);
        registarAtividadeAulaGrupo(atividade3);
        registarAtividadeAulaGrupo(atividade4);
        registarAtividadeAulaGrupo(atividade5);
        registarAtividadePersonalTraining(atividade6);
        registarAtividadePersonalTraining(atividade7);
        registarAtividadePersonalTraining(atividade8);
        
        criarMarcacao(marcacao1);
        criarMarcacao(marcacao2);
        criarMarcacao(marcacao3);
        criarMarcacao(marcacao4);
        criarMarcacao(marcacao5);
        criarMarcacao(marcacao6);
    }
    /**
     * recebe um valor da identificação para procurar e retorna um sócio
     * @param id valor da identificação
     * @return socio retorna um sócio caso seja encontrado, em contrário retorna null
     */
    public Socio encontrarSocio(int id){
        for (Socio socio: sociosIndividual){
            if (socio.getIdentificacao() == id) return socio;
        }
        for (Socio socio: sociosEmpresa){
            if (socio.getIdentificacao() == id) return socio;
        }
        return null;
    }
    /**
     * recebe um nome para procurar no array dos instrutores
     * @param nome nome do instrutor
     * @return instrutor retorna um instrutor caso seja encontrado, em contrário retorna null
     */
    public Instrutor encontrarInstrutor(String nome){
        for (Instrutor instrutor: instrutores){
            if (instrutor.getNome().equalsIgnoreCase(nome)) return instrutor;
        }
        return null;
    }
    /**
     * recebe um indice de uma atividade de uma lista impressa e procura-a nos arrays de atividades
     * @param indiceAtividade indice da atividade
     * @return atividade retorna uma atividade casa seja encontrada, em contrário retorna null
     */
    public Atividades encontrarAtividade(int indiceAtividade){
        int i = 1;
        for (Atividades atividade: atividadesAulaGrupo){
            if (i == indiceAtividade) return atividade;
            i++;
        }
        for (Atividades atividade: atividadesPersonalTraining){
            if (i == indiceAtividade) return atividade;
            i++;
        }
        return null;
    }
    /**
     * recebe um sócio e adiciona-o ao array de sócios individuais
     * @param socio socio a adicionar
     */
    public void registarSocioIndividual(Socio socio){
        boolean flag = true;
        for (Socio socio1: sociosIndividual){
            if (socio1.getIdentificacao() == socio.getIdentificacao()) flag = false;
        }
        for (Socio socio2: sociosEmpresa){
            if (socio2.getIdentificacao() == socio.getIdentificacao()) flag = false;
        }
        if (flag){
            sociosIndividual.add(socio);
            System.out.println("Sócio registado!");
        }
        else System.out.println("Esse nº de sócio já existe!");
    }
    /**
     * recebe um sócio e adiciona-o ao array de sócios empresa
     * @param socio socio a adicionar
     */
    public void registarSocioEmpresa(Socio socio){
        boolean flag = true;
        for (Socio socio1: sociosIndividual){
            if (socio1.getIdentificacao() == socio.getIdentificacao()) flag = false;
        }
        for (Socio socio2: sociosEmpresa){
            if (socio2.getIdentificacao() == socio.getIdentificacao()) flag = false;
        }
        if (flag){
            sociosEmpresa.add(socio);
            System.out.println("Sócio registado!");
        }
            
        else System.out.println("Esse nº de sócio já existe!");
    }
    /**
     * recebe um instrutor e adiciona-o ao array de instrutores
     * @param instrutor instrutor a adicionar
     */
    public void registarInstrutor(Instrutor instrutor){
        instrutores.add(instrutor);
    }
    /**
     * recebe uma atividade para contar o número de pessoas inscritas na atividade em questão
     * @param atividade atividade para contar lugares ocupados
     * @return contador retorna o contador que reprensenta a quantidade de pessoas inscritas na atividade em questão
     */
    private int verificarCapMax(Atividades atividade){
        int contador =  0;
        for (Marcacoes marcacao: marcacoes){
            if (marcacao.getAtividade().equals(atividade)) contador++;
        }
        return contador;
    }
   /**
    * recebe uma atividade para verificar se já existe alguma atividade com o mesmo instrutor, inserido pelo utilizador, 
    * na data da nova atividade
    * @param atividade atividade para verificar instrutor
    * @return flag retorna uma flag para saber se o instrutor/responsável está disponível para criar uma atividade
    * numa dada data
    */ 
    private boolean verificarResponsavel(Atividades atividade){
        boolean flag = true;
        for (Atividades atividade1: atividadesAulaGrupo){
            if ((atividade1.getResponsavel().equals(atividade.getResponsavel())) && (atividade1.getData().equals(atividade.getData()))) flag = false;
        }
        for (Atividades atividade2: atividadesPersonalTraining){
            if ((atividade2.getResponsavel().equals(atividade.getResponsavel())) && (atividade2.getData().equals(atividade.getData()))) flag = false;
        }
        return flag;
    }
    /**
     * método que recebe uma atividade para adicionar ao array de atividades de aula de grupo
     * @param atividade atividade a adicionar
     */
    public void registarAtividadeAulaGrupo(Atividades atividade){
        if (verificarResponsavel(atividade)){
            if (atividade.getData().isBefore(LocalDateTime.now())) System.out.println("Data inválida!");
            else{
                atividadesAulaGrupo.add(atividade);
                System.out.println("Atividade registada!");
            } 
        }
        else System.out.println("Esse instrutor já está ocupado!");
    }
    /**
     * método que recebe uma atividade para adicionar ao array de atividades de personal training
     * @param atividade atividade a adicionar
     */
    public void registarAtividadePersonalTraining(Atividades atividade){
        if (verificarResponsavel(atividade)){
            if (atividade.getData().isBefore(LocalDateTime.now())) System.out.println("Data inválida!");
            else{
                atividadesPersonalTraining.add(atividade);
                System.out.println("Atividade registada!");
            } 
        }
        else System.out.println("Esse instrutor já está ocupado!");
    }
    /**
     * método que recebe uma marcação para adicionar ao array de marcacões
     * @param marcacao marcação a adicionar
     */
    public void criarMarcacao(Marcacoes marcacao){
        boolean flag = true;
        for (Marcacoes marcacao2: marcacoes){
            if (marcacao2.getAtividade() == marcacao.getAtividade()){
                if (marcacao2.getSocio() == marcacao.getSocio()) flag = false;
            } 
        }
        if (flag){
            if (verificarCapMax(marcacao.getAtividade()) >= marcacao.getAtividade().getCapMax()) System.out.println("A Aula de grupo em questão está cheia. Lamentamos muito!");
            else{
                marcacoes.add(marcacao);
                System.out.println("Marcação registada!");
            }
        } 
        else System.out.println("Essa marcação já existe!");
    }
    /**
     * método sem parâmetros e returns, serve apenas para listar os instrutores
     */
    public void listarInstrutores(){
        int i = 1;
        System.out.println("---------INSTRUTORES---------");
        for (Instrutor instrutor: instrutores){
            System.out.println(i + " - " + instrutor + "\n");
            i++;
        }
    }
    /**
     * método sem parâmetros e returns, serve apenas para listar os sócios
     */
    public void listarSocios(){
        int i = 1;
        System.out.println("---------SÓCIOS---------");
        for (Socio socio: sociosIndividual){
            System.out.println(i + " - " + socio.toString() + "\n");
            i++;
        }
        for (Socio socio: sociosEmpresa){
            System.out.println(i + " - " + socio.toString() + "\n");
            i++;
        }
        if (sociosIndividual.size() == 0 && sociosEmpresa.size() == 0) System.out.println("Ainda não há sócios inscritos!");
    }
    /**
     * método sem parâmetros e returns, serve apenas para listar as atividades
     */
    public void listarAtividades(){
        int i = 1;
        System.out.println("---------ATIVIDADES---------");
        for (Atividades atividade: atividadesAulaGrupo){
            System.out.println(i + " - " + atividade.toString() + "\n");
            i++;
        }
        for (Atividades atividade: atividadesPersonalTraining){
            System.out.println(i + " - " + atividade.toString() + "\n");
            i++;
        }
        if (atividadesAulaGrupo.size() == 0 && atividadesPersonalTraining.size() == 0) System.out.println("Ainda não há atividades marcadas!");
    }
    /**
     * método sem parâmetros e returns, serve apenas para listar as marcações
     */
    public void listarMarcacoes(){
        int i = 1;
        System.out.println("---------MARCAÇÕES---------");
        for (Marcacoes marcacao: marcacoes){
            System.out.println(i + " - " + marcacao.toString() + "\n");
            i++;
        }
        if (marcacoes.size() == 0) System.out.println("Ainda não há marcações!");
    }
    /**
     * método sem parâmetros e returns, serve apenas para apresentar a quantidade de sócios e atividades registadas
     */
    public void resumoAtividades(){
        System.out.println("---------RESUMO DAS ATIVIDADES---------");
        System.out.println("Sócios individuais: " + sociosIndividual.size() + ", Sócios empresa: "
        + sociosEmpresa.size() + " Aulas de grupo: " + atividadesAulaGrupo.size() +  ", Sessões de PT: "
        + atividadesPersonalTraining.size());
    }
    /**
     * método sem parâmetros e returns, serve apenas para apresentar a atividade mais popular
     */
    public void maisPopular(){
        System.out.println("---------ATIVIDADE MAIS POPULAR---------");
        if (atividadesAulaGrupo.size() == atividadesPersonalTraining.size()) System.out.println("Não há uma atividade mais popular!");
        
        if (atividadesAulaGrupo.size() > atividadesPersonalTraining.size()) System.out.println("A atividade mais popular é a Aula de Grupo!");
        else if (atividadesAulaGrupo.size() < atividadesPersonalTraining.size()) System.out.println("A atividade mais popular é o Personal Training!");
    }
    /**
     * método para mostrar a quantidade gasta e poupada de um sócio, através de um nº de identicação
     * @param identificacao nº de identificação do sócio alvo
     */
    public void valoresSocio(int identificacao){
        double valTotalSemDesconto = 0;
        double valTotalComDesconto = 0;
        double totalPoupado = 0;

        for (Socio socio: sociosIndividual){
            if (socio.getIdentificacao() == identificacao){
                for (Marcacoes marcacao: marcacoes){
                    if (marcacao.getSocio().getIdentificacao() == identificacao){
                        valTotalSemDesconto += marcacao.getAtividade().precoSessao();
                        valTotalComDesconto += marcacao.custoFinal();
                    }
                }
            }
        }
        for (Socio socio: sociosEmpresa){
            if (socio.getIdentificacao() == identificacao){
                for (Marcacoes marcacao: marcacoes){
                    if (marcacao.getSocio().getIdentificacao() == identificacao){
                        valTotalSemDesconto += marcacao.getAtividade().precoSessao();
                        valTotalComDesconto += marcacao.custoFinal();
                    }
                }
            }
        }
        totalPoupado = valTotalSemDesconto - valTotalComDesconto;
        System.out.println("Este sócio já gastou " + String.format("%.2f", valTotalComDesconto) +
        " euros e poupou um total de " + String.format("%.2f", totalPoupado) + " euros");
    }
}