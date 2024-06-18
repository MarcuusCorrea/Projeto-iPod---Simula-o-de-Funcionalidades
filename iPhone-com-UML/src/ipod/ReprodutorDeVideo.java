package ipod;

public class ReprodutorDeVideo {
    private Video[] videos;

    public void tocar() {
        System.out.println("Reproduzindo vídeo.");
    }

    public void pausar() {
        System.out.println("Pausando vídeo.");
    }

    public void selecionarVideo(String nome) {
        System.out.println("Selecionando vídeo "+nome+".");
    }

    public Video[] getVideos() {
        return videos;
    }

    public void setVideos(Video[] videos) {
        this.videos = videos;
    }
}
