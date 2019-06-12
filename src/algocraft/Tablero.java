package algocraft;
import java.util.HashMap;
import java.util.Map;

public class Tablero {

    private Map casilleros = new HashMap();

    public Tablero(int x, int y){
        for(int i = 0; i < x; i ++){
            for (int j = 0; j < y; j++){

                Casillero casillero = new Casillero(i, j);
                int clave[]  = {i,j};
                this.casilleros.put(clave, casillero);
            }

        }

    }

    public Object casillero(int clave[]){
        return casilleros.get(clave);


    }

}
