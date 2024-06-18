package telefone;

public class AparelhoTelefonico {
    private Contato[] contatos;
    private Contato[] favoritos;
    private int totalContatos = 0;
    private int totalFavoritos = 0;

    public void ligar(String numero) {
        System.out.println("Ligando para o número "+numero+".");
    }

    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    public void AdicionarContato(Contato contato) {
        System.out.println("Adicionando contato: "+contato.getNome()+".");
        this.contatos[totalContatos] = contato;
        this.totalContatos += 1;
    }

    public void favoritar(Contato contato) {
        System.out.println("Favoritando "+contato.getNome()+".");
        this.favoritos[totalFavoritos] = contato;
        this.totalFavoritos += 1;
    }

    public void deixarEmEspera() {
        System.out.println("Deixando chamada em espera.");
    }

    public void fazerConferencia() {
        System.out.println("Fazendo conferencia.");
    }

    public void desfavoritar(String nome) {
        System.out.println("Desfaoritando "+nome+".");
        for (int i = 0; i < contatos.length-1; i++) {
            if (contatos[i].getNome() == nome) {
                for (int j = i; j < contatos.length-2; j++) {
                    contatos[j] = contatos[j+1];
                }
                break;
            }
        }
    }

    public Contato[] getContatos() {
        return contatos;
    }
    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }
    public Contato[] getFavoritos() {
        return favoritos;
    }
    public void setFavoritos(Contato[] favoritos) {
        this.favoritos = favoritos;
    }

}
