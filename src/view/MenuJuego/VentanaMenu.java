package view.MenuJuego;

import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class VentanaMenu extends Stage {

    public VentanaMenu(){
        super(StageStyle.UNDECORATED);

        PantallaMenu pantallaMenu = new PantallaMenu(this);

        Scene escenaConstructor = new Scene(pantallaMenu);


        this.setTitle("Menu Juego");
        this.initOwner(pantallaMenu.getScene().getWindow());
        this.setScene(escenaConstructor);
        this.initModality(Modality.APPLICATION_MODAL);

        this.showAndWait();
        this.setX((pantallaMenu.getWidth() - this.getWidth())/2);
        this.setY((pantallaMenu.getHeight() - this.getHeight())/2);
    }


}
