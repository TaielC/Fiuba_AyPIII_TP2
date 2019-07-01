package controller.juego;

import algocraft.herramienta.durabilidad.DurabilidadHerramienta;
import algocraft.juego.Juego;
import algocraft.juego.Posicion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.Nombres;
import view.PantallaJuego;


public class BotonMaterialMineralEventHandler implements EventHandler<ActionEvent> {

    private Juego juego;
    private Posicion posicion;
    private PantallaJuego pantallaJuego;
    private String texto;

    public BotonMaterialMineralEventHandler(PantallaJuego pantallaJuego, Juego juego, Posicion posicion){
        this.juego = juego;
        this.pantallaJuego = pantallaJuego;
        this.posicion = posicion;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        juego.jugadorUsarHerramientaEquipada(posicion);
        String nombreHerramienta = Nombres.get(juego.getJugador().getHerramientaEquipada().getClass().getName() + juego.getJugador().getHerramientaEquipada().material().getClass().getName());
        texto = ("Golpeaste un material, tu herramienta ahora esta rota!");
        if (!(nombreHerramienta.equals("ninguna herramienta"))) {
            double durabilidad = juego.getJugador().getHerramientaEquipada().durabilidad();
            texto = ("Golpeaste un material, tu herramienta ahora tiene una durabilidad igual a:  " + durabilidad);
        }
        pantallaJuego.actualizar(texto);
    }
}
