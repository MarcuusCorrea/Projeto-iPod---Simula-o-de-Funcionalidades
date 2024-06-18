package telefone;

public class Contato {
    private String nome;
    private String[] numeros;
    private int id = 0;
    
    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numeros[id] = numero;
        this.id += 1;
    }
    
    public void adicionarNumero(String numero) {
        System.out.println("Adicionando numero em: "+this.getNome()+".");
        numeros[id] = numero;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getNumero() {
        return numeros;
    }

    public void setNumero(String[] numero) {
        this.numeros = numero;
    }

}
