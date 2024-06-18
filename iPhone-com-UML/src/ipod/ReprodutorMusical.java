package ipod;

public class ReprodutorMusical {
    private Artista[] artistas;

    public void tocar() {
        System.out.println("Tocando música.");
    }

    public void pausar() {
        System.out.println("Pausando música.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Slecionando musica "+musica+".");
    }

    public Artista[] getArtistas() {
        return artistas;
    }

    public void setArtistas(Artista[] artistas) {
        this.artistas = artistas;
    }
}