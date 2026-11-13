package Aleatorios;

// import javax.print.DocFlavor.STRING;

class Livro {
    private int paginas = 700;
    private String nome;
    public int getPaginas() {
        return paginas;
    }
    public String getNome() {
        return nome;
    }
    public void pageMessage() {
        System.out.println("Número de páginas: " + getPaginas());
    }
    public String toString() {
        return nome + " " + paginas;
    }
    public Livro(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }
}

class Dicionario extends Livro {
    private int entradas;
    public Dicionario(String nome, int paginas, int entradas) {
        super(nome, paginas);
        this.entradas = entradas;
    }
    public void entradasMessage() {
        System.out.println("Número entradas: " + entradas);
        System.out.println("Média por página: " + entradas / getPaginas());
    }
    public String toString() {
        return super.toString() + " " + entradas;
    }
}

class Palavras {
    public static void main(String[] args) {
        Dicionario larousse = new Dicionario("Latim-Português", 600, 8000);
        larousse.pageMessage(); 
        larousse.entradasMessage();
        System.out.println(larousse);
    }
}