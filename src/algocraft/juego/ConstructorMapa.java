package algocraft.juego;

import algocraft.materialmineral.*;
import java.util.*;

public class ConstructorMapa {

    private static Mapa mapa;
    private static Random random = new Random();

    public static void contruirMapa(Mapa mapaConstruir) {
        mapa = mapaConstruir;

        for (int i = 0; i < 8; i++) {
            int factorBloque = random.nextInt(4);
            ponerMadera(factorBloque);
        }
        for (int i = 0; i < 5; i++) {
            int factorBloque = random.nextInt(4);
            ponerPiedra(factorBloque);
        }
        for (int i = 0; i < 3; i++) {
            int factorBloque = random.nextInt(4);
            ponerMetal(factorBloque);
        }

        for (int i = 0; i < 2; i++) {
            int factorBloque = random.nextInt(4);
            ponerDiamante(factorBloque);
        }

    }

    public static void ponerMadera(int factorBloque) {
        int posHorizontal = random.nextInt(mapa.getBordeHorizontal());
        int posVertical = random.nextInt(mapa.getBordeVertical());
        Posicion posicion;
        MaderaMineral madera;
        switch (factorBloque) {
            case 0:
                posicion = new Posicion(posHorizontal, posVertical);
                madera = new MaderaMineral(posicion);
                mapa.agregar(madera, posicion);
                break;

            case 1:
                for (int i = posHorizontal; i <= posHorizontal + 1; i++) {
                    posicion = new Posicion(i, posVertical);
                    madera = new MaderaMineral(posicion);
                    mapa.agregar(madera, posicion);
                }
                break;

            case 2:
                for (int i = posHorizontal; i <= posHorizontal + 1; i++) {
                    for (int j = posVertical; j <= posVertical + 1; j++) {
                        posicion = new Posicion(i, j);
                        madera = new MaderaMineral(posicion);
                        mapa.agregar(madera, posicion);
                    }
                }
                break;

            case 3:
                for (int i = posHorizontal; i <= posHorizontal + 2; i++) {
                    for (int j = posVertical; j <= posVertical + 2; j++) {
                        posicion = new Posicion(i, j);
                        madera = new MaderaMineral(posicion);
                        mapa.agregar(madera, posicion);
                    }
                }
                break;

            default:
                break;
        }
    }

    public static void ponerPiedra(int factorBloque) {
        int posHorizontal = random.nextInt(mapa.getBordeHorizontal());
        int posVertical = random.nextInt(mapa.getBordeVertical());
        Posicion posicion;
        PiedraMineral piedra;
        switch (factorBloque) {
            case 0:
                posicion = new Posicion(posHorizontal, posVertical);
                piedra = new PiedraMineral(posicion);
                mapa.agregar(piedra, posicion);
                break;

            case 1:
                for (int i = posHorizontal; i <= posHorizontal + 1; i++) {
                    posicion = new Posicion(i, posVertical);
                    piedra = new PiedraMineral(posicion);
                    mapa.agregar(piedra, posicion);
                }
                break;

            case 2:
                for (int i = posHorizontal; i <= posHorizontal + 1; i++) {
                    for (int j = posVertical; j <= posVertical + 1; j++) {
                        posicion = new Posicion(i, j);
                        piedra = new PiedraMineral(posicion);
                        mapa.agregar(piedra, posicion);
                    }
                }
                break;

            case 3:
                for (int i = posHorizontal; i <= posHorizontal + 2; i++) {
                    for (int j = posVertical; j <= posVertical + 2; j++) {
                        posicion = new Posicion(i, j);
                        piedra = new PiedraMineral(posicion);
                        mapa.agregar(piedra, posicion);
                    }
                }
                break;

            default:
                break;
        }
    }

    public static void ponerMetal(int factorBloque) {
        int posHorizontal = random.nextInt(mapa.getBordeHorizontal());
        int posVertical = random.nextInt(mapa.getBordeVertical());
        Posicion posicion;
        MetalMineral metal;
        switch (factorBloque) {
            case 0:
                posicion = new Posicion(posHorizontal, posVertical);
                metal = new MetalMineral(posicion);
                mapa.agregar(metal, posicion);
                break;

            case 1:
                for (int i = posHorizontal; i <= posHorizontal + 1; i++) {
                    posicion = new Posicion(i, posVertical);
                    metal = new MetalMineral(posicion);
                    mapa.agregar(metal, posicion);
                }
                break;

            case 2:
                for (int i = posHorizontal; i <= posHorizontal + 1; i++) {
                    for (int j = posVertical; j <= posVertical + 1; j++) {
                        posicion = new Posicion(i, j);
                        metal = new MetalMineral(posicion);
                        mapa.agregar(metal, posicion);
                    }
                }
                break;

            case 3:
                for (int i = posHorizontal; i <= posHorizontal + 2; i++) {
                    for (int j = posVertical; j <= posVertical + 2; j++) {
                        posicion = new Posicion(i, j);
                        metal = new MetalMineral(posicion);
                        mapa.agregar(metal, posicion);
                    }
                }
                break;

            default:
                break;
        }
    }
    public static void ponerDiamante(int factorBloque) {
        int posHorizontal = random.nextInt(mapa.getBordeHorizontal());
        int posVertical = random.nextInt(mapa.getBordeVertical());
        Posicion posicion;
        DiamanteMineral diamante;
        switch (factorBloque) {
            case 0:
                posicion = new Posicion(posHorizontal, posVertical);
                diamante = new DiamanteMineral(posicion);
                mapa.agregar(diamante, posicion);
                break;

            case 1:
                for (int i = posHorizontal; i <= posHorizontal + 1; i++) {
                    posicion = new Posicion(i, posVertical);
                    diamante = new DiamanteMineral(posicion);
                    mapa.agregar(diamante, posicion);
                }
                break;

            case 2:
                for (int i = posHorizontal; i <= posHorizontal + 1; i++) {
                    for (int j = posVertical; j <= posVertical + 1; j++) {
                        posicion = new Posicion(i, j);
                        diamante = new DiamanteMineral(posicion);
                        mapa.agregar(diamante, posicion);
                    }
                }
                break;

            case 3:
                for (int i = posHorizontal; i <= posHorizontal + 2; i++) {
                    for (int j = posVertical; j <= posVertical + 2; j++) {
                        posicion = new Posicion(i, j);
                        diamante = new DiamanteMineral(posicion);
                        mapa.agregar(diamante, posicion);
                    }
                }
                break;

            default:
                break;
        }
    }

}
