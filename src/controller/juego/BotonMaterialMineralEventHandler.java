package controller.juego;

import algocraft.herramienta.Hacha;
import algocraft.herramienta.Pico;
import algocraft.juego.Juego;
import algocraft.juego.Posicion;
import algocraft.materialmineral.MaterialMineralNulo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import media.Sonidos;
import view.Nombres;
import view.juego.PantallaJuego;


public class BotonMaterialMineralEventHandler implements EventHandler<ActionEvent> {

    private Juego juego;
    private Posicion posicion;
    private PantallaJuego pantallaJuego;

    public BotonMaterialMineralEventHandler(PantallaJuego pantallaJuego, Juego juego, Posicion posicion){
        this.juego = juego;
        this.pantallaJuego = pantallaJuego;
        this.posicion = posicion;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Media soundMadera = Sonidos.get("golpeMadera");
        MediaPlayer sonidoMadera = new MediaPlayer(soundMadera);
        Media soundNoMadera = Sonidos.get("golpeNoMadera");
        MediaPlayer sonidoNoMadera = new MediaPlayer(soundNoMadera);
        Media soundObtenido = Sonidos.get("materialObtenido");
        MediaPlayer sonidoObtenido = new MediaPlayer(soundObtenido);

        boolean habiaMaterial = !(juego.getMapa().getObjetoUbicable(posicion) instanceof MaterialMineralNulo);
        juego.jugadorUsarHerramientaEquipada(posicion);

        String nombreHerramienta = Nombres.get(juego.getJugador().getHerramientaEquipada().getClass().getName() + juego.getJugador().getHerramientaEquipada().material().getClass().getName());
        String texto = ("Golpeaste un material, no hay una Herramienta equipada!");
        if (!(nombreHerramienta.equals("ninguna herramienta"))) {
            double durabilidad = juego.getJugador().getHerramientaEquipada().durabilidad();
            texto = ("Golpeaste un material, tu Herramienta ahora tiene una durabilidad igual a: " + durabilidad);
            if(habiaMaterial && juego.getJugador().getPosicion().esAdyacente(posicion)){
                if(juego.getJugador().getHerramientaEquipada() instanceof Hacha)
                    sonidoMadera.play();
                else
                    sonidoNoMadera.play();
                if(juego.getMapa().getObjetoUbicable(posicion) instanceof MaterialMineralNulo)
                    sonidoObtenido.play();
            }

        }
        pantallaJuego.actualizar(texto);
    }
}
