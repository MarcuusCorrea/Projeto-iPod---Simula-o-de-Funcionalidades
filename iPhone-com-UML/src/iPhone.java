import ipod.iPod;
import navegador.NavegadorInternet;
import telefone.AparelhoTelefonico;
import widgets.Widgets;
import galeria.Galeria;
import imap.Imap;

public class iPhone {
    private iPod ipod;
    private AparelhoTelefonico telefone;
    private Galeria galeria;
    private Imap imap;
    private Widgets widgets;
    private NavegadorInternet safari;
    
    public iPod getIpod() {
        return ipod;
    }
    public void setIpod(iPod ipod) {
        this.ipod = ipod;
    }
    public AparelhoTelefonico getTelefone() {
        return telefone;
    }
    public void setTelefone(AparelhoTelefonico telefone) {
        this.telefone = telefone;
    }
    public Galeria getGaleria() {
        return galeria;
    }
    public void setGaleria(Galeria galeria) {
        this.galeria = galeria;
    }
    public Imap getImap() {
        return imap;
    }
    public void setImap(Imap imap) {
        this.imap = imap;
    }
    public Widgets getWidgets() {
        return widgets;
    }
    public void setWidgets(Widgets widgets) {
        this.widgets = widgets;
    }
    public NavegadorInternet getSafari() {
        return safari;
    }
    public void setSafari(NavegadorInternet safari) {
        this.safari = safari;
    }

    
}
