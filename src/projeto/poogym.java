package projeto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @author DanielCintrão & SalvadorSimões
 * @version 1.0
 */

/**
 * 
 * Classe poogym para executar o programa principal
 */
public class poogym {
    public static void main(String[] args){
        /**
         * criação do ginásio
         */
        Ginasio ginasio = new Ginasio();
        /**
         * Scanner para ler informações do terminal
         */
        ginasio.carregarDados();
        Scanner sc = new Scanner(System.in);
        int menuNum = 99;

        while (menuNum != 0) {
            
            System.out.println("------------MENU------------");
            System.out.println("1 - Registar sócio");
            System.out.println("2 - Registar instrutor");
            System.out.println("3 - Registar atividade");
            System.out.println("4 - Listar sócios");
            System.out.println("5 - Listar atividades");
            System.out.println("6 - Criar marcação");
            System.out.println("7 - Listar marcações");
            System.out.println("8 - Resumo das atividades");
            System.out.println("9 - Atividade mais popular");
            System.out.println("10 - Valor gasto e poupado de um Sócio");
            System.out.println("0 - Terminar o programa");
            System.out.print("Opção: ");

            menuNum = sc.nextInt();
            sc.nextLine();
            switch (menuNum) {
                case 1 -> {
                    int numSocio = 0;
                    System.out.println("Sócio individual (1) ou sócio empresa (2) ?");
                    numSocio = sc.nextInt();
                    sc.nextLine();
                    if (numSocio == 1){
                        System.out.println("Indique o nome, nº de identificação, email e ano de nascimento do sócio.");
                        String nome = sc.nextLine();
                        int identificacao = sc.nextInt();
                        sc.nextLine();
                        String email = sc.nextLine();
                        int anoNascimento = sc.nextInt();
                        SocioIndividual socioIndividual = new SocioIndividual(nome, identificacao, email, anoNascimento);
                        ginasio.registarSocioIndividual(socioIndividual);
                    }
                    else{
                        System.out.println("Indique o nome, nº de identificação, email, nome da empresa e NIF do sócio");
                        String nome = sc.nextLine();
                        int identificacao = sc.nextInt();
                        sc.nextLine();
                        String email = sc.nextLine();
                        String nomeEmpresa = sc.nextLine();
                        int nif = sc.nextInt();
                        sc.nextLine();
                        SocioEmpresa socioEmpresa = new SocioEmpresa(nome, identificacao, email, nomeEmpresa, nif);
                        ginasio.registarSocioEmpresa(socioEmpresa);
                    }
                    System.out.print("\nClique enter para retornar ao menu");
                    sc.nextLine();
                }
                case 2 -> {
                    System.out.println("Indique o nome, género e formações do instrutor");
                    String nome = sc.nextLine();
                    String genero = sc.nextLine();
                    String formacoes = sc.nextLine();
                    Instrutor instrutor = new Instrutor(nome, genero, formacoes);
                    ginasio.registarInstrutor(instrutor);
                    System.out.println("Instrutor registado!");
                    System.out.print("\nClique enter para retornar ao menu");
                    sc.nextLine();
                }
                case 3 ->{
                    System.out.println("Aula de grupo (1) ou Personal trainging (2) ?");
                    int numAtividade = sc.nextInt();
                    sc.nextLine();
                    if (numAtividade == 1){
                        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                        ginasio.listarInstrutores();
                        System.out.println("Indique o nome do responsável, data (dd/mm/yyyy hh:mm), capacidade máxima, tipo/nível e duração da atividade");
                        String responsavel = sc.nextLine();
                        Instrutor instrutorResponsavel = ginasio.encontrarInstrutor(responsavel);
                        if (instrutorResponsavel == null) System.out.println("Não existe um instrutor com esse nome!");
                        else{
                            String dataLida = sc.nextLine();
                            int capMax = sc.nextInt();
                            sc.nextLine();
                            String tipoSessao = sc.nextLine();
                            tipoSessao = tipoSessao.trim().toLowerCase();
                            int duracaoAula = sc.nextInt();
                            sc.nextLine();
                            LocalDateTime dataConvertida = LocalDateTime.parse(dataLida, formatador);
                            AulaGrupo.TipoSessao tipoSessaoFinal = switch(tipoSessao){
                                case "yoga" -> AulaGrupo.TipoSessao.yoga;
                                case "spinning" -> AulaGrupo.TipoSessao.spinning;
                                case "zumba" -> AulaGrupo.TipoSessao.zumba;
                                case "crossfit" -> AulaGrupo.TipoSessao.crossfit;
                                default ->{
                                    assert false: "Atividade desconhecida" + tipoSessao;
                                    yield null;
                                }
                            };
                            AulaGrupo aulaGrupo = new AulaGrupo(instrutorResponsavel, dataConvertida, duracaoAula, capMax, tipoSessaoFinal);
                            ginasio.registarAtividadeAulaGrupo(aulaGrupo);
                        }
                    }
                    else{
                        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                        ginasio.listarInstrutores();
                        System.out.println("Indique o nome do responsável, data (dd/mm/yyyy hh:mm), duração da aula e tipo/nível da atividade");
                        String responsavel = sc.nextLine();
                        Instrutor instrutorResponsavel = ginasio.encontrarInstrutor(responsavel);
                        if (instrutorResponsavel == null) System.out.println("Não existe um instrutor com esse nome!");
                        else{
                            String dataLida = sc.nextLine();
                            int duracaoAula = sc.nextInt();
                            sc.nextLine();
                            String tipoSessao = sc.nextLine();
                            tipoSessao = tipoSessao.trim().toLowerCase();
                            LocalDateTime dataConvertida = LocalDateTime.parse(dataLida, formatador);
                            PersonalTraining.TipoSessao tipoSessaoFinal = switch(tipoSessao){
                                case "iniciacao" -> PersonalTraining.TipoSessao.iniciacao;
                                case "intermedio" -> PersonalTraining.TipoSessao.intermedio;
                                case "avancado" -> PersonalTraining.TipoSessao.avancado;
                                default ->{
                                    assert false: "Atividade desconhecida" + tipoSessao;
                                    yield null;
                                }
                            };
                            PersonalTraining personalTraining = new PersonalTraining(instrutorResponsavel, dataConvertida, duracaoAula, tipoSessaoFinal);
                            ginasio.registarAtividadePersonalTraining(personalTraining);
                        }
                    }
                    System.out.print("\nClique enter para retornar ao menu");
                    sc.nextLine();
                }
                case 4 ->{
                    ginasio.listarSocios();
                    System.out.print("\nClique enter para retornar ao menu");
                    sc.nextLine();
                }
                case 5 ->{
                    ginasio.listarAtividades();
                    System.out.print("\nClique enter para retornar ao menu");
                    sc.nextLine();
                }
                case 6 ->{
                    System.out.println("Indique o nº de identificação do sócio");
                    int idSocio = sc.nextInt();
                    sc.nextLine();
                    Socio socioParaMarcacao = ginasio.encontrarSocio(idSocio);
                    if (socioParaMarcacao == null) System.out.println("Não existe um instrutor com esse nome!");
                    else{
                        ginasio.listarAtividades();
                        System.out.println("Indique a atividade para a marcação");
                        int numeroAtividade = sc.nextInt();
                        sc.nextLine();
                        Atividades atividadeParaMarcacao = ginasio.encontrarAtividade(numeroAtividade);
                        Marcacoes marcacao = new Marcacoes(socioParaMarcacao, atividadeParaMarcacao);
                        ginasio.criarMarcacao(marcacao);
                    }
                    System.out.print("\nClique enter para retornar ao menu");
                    sc.nextLine();
                }
                case 7 ->{
                    ginasio.listarMarcacoes();
                    System.out.print("\nClique enter para retornar ao menu");
                    sc.nextLine();
                }
                case 8 ->{
                    ginasio.resumoAtividades();
                    System.out.print("\nClique enter para retornar ao menu");
                    sc.nextLine();
                }
                case 9 ->{
                    ginasio.maisPopular();
                    System.out.print("\nClique enter para retornar ao menu");
                    sc.nextLine();
                }
                case 10 ->{
                    ginasio.listarSocios();
                    System.out.println("Indique o nº de identificação do sócio");
                    int idSocio = sc.nextInt();
                    sc.nextLine();
                    ginasio.valoresSocio(idSocio);
                    System.out.print("\nClique enter para retornar ao menu");
                    sc.nextLine();
                }
                
                default ->{
                    assert false: "Função desconhecida";
                }
            };
        }

        sc.close();
    }
}
