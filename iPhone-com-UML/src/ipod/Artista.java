package ipod;

public class Artista {
    private String nome;
    private Album[] albuns;

    public Album[] getAlbuns() {
        return albuns;
    }

    public void setAlbuns(Album[] albuns) {
        this.albuns = albuns;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
