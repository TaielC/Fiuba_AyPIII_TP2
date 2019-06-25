package algocraft.juego;

import algocraft.materialmineral.*;
import java.util.*;

public class ConstructorMapa {
    private Mapa mapa;
    private Random random;

    public ConstructorMapa(Mapa mapa) {
        this.mapa = mapa;
        this.random = new Random();
    }


    public void contruirMapa() {
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

    public void seleccionarMaterial(int factorMaterial) {


        int factorBloque = random.nextInt(5);
        switch (factorMaterial) {
            case 0:
                ponerMadera(factorBloque);
                ponerPiedra(factorBloque);
                ponerDiamante(factorBloque);
                break;

            case 1:
                ponerMadera(factorBloque);
                ponerDiamante(factorBloque);

                break;

            case 2:
                ponerPiedra(factorBloque);
                ponerMadera(factorBloque);

                break;

            case 3:
                ponerMadera(factorBloque);
                ponerMetal(factorBloque);
                break;

            default:
                break;

        }

    }

    public void ponerMadera(int factorBloque) {
        int posHorizontal = random.nextInt(mapa.getBordeHorizontal());
        int posVertical = random.nextInt(mapa.getBordeVertical());
        switch (factorBloque) {
            case 0:
                Posicion posicion0 = new Posicion(posHorizontal, posVertical);
                MaderaMineral madera0 = new MaderaMineral(posicion0);
                mapa.agregar(madera0, posicion0);
                break;

            case 1:
                for (int i = posHorizontal; i <= posHorizontal + 1; i++) {
                    Posicion posicion = new Posicion(i, posVertical);
                    MaderaMineral madera = new MaderaMineral(posicion);
                    mapa.agregar(madera, posicion);
                }
                break;

            case 2:
                for (int i = posHorizontal; i <= posHorizontal + 1; i++) {
                    for (int j = posVertical; j <= posVertical + 1; j++) {
                        Posicion posicion = new Posicion(i, j);
                        MaderaMineral madera = new MaderaMineral(posicion);
                        mapa.agregar(madera, posicion);
                    }
                }
                break;


            case 3:
                for (int i = posHorizontal; i <= posHorizontal + 2; i++) {
                    for (int j = posVertical; j <= posVertical + 2; j++) {
                        Posicion posicion = new Posicion(i, j);
                        MaderaMineral madera = new MaderaMineral(posicion);
                        mapa.agregar(madera, posicion);
                    }
                }
                break;

            default:
                break;


        }
    }


    public void ponerPiedra(int factorBloque) {
        int posHorizontal = random.nextInt(mapa.getBordeHorizontal());
        int posVertical = random.nextInt(mapa.getBordeVertical());
        switch (factorBloque) {
            case 0:
                Posicion posicion0 = new Posicion(posHorizontal, posVertical);
                PiedraMineral pidera0 = new PiedraMineral(posicion0);
                mapa.agregar(pidera0, posicion0);
                break;

            case 1:
                for (int i = posHorizontal; i <= posHorizontal + 1; i++) {
                    Posicion posicion = new Posicion(i, posVertical);
                    PiedraMineral pidera = new PiedraMineral(posicion);
                    mapa.agregar(pidera, posicion);
                }
                break;

            case 2:
                for (int i = posHorizontal; i <= posHorizontal + 1; i++) {
                    for (int j = posVertical; j <= posVertical + 1; j++) {
                        Posicion posicion = new Posicion(i, j);
                        PiedraMineral pidera = new PiedraMineral(posicion);
                        mapa.agregar(pidera, posicion);
                    }
                }
                break;


            case 3:
                for (int i = posHorizontal; i <= posHorizontal + 2; i++) {
                    for (int j = posVertical; j <= posVertical + 2; j++) {
                        Posicion posicion = new Posicion(i, j);
                        PiedraMineral pidera = new PiedraMineral(posicion);
                        mapa.agregar(pidera, posicion);
                    }
                }
                break;

            default:
                break;


        }
    }

    public void ponerMetal(int factorBloque) {
        int posHorizontal = random.nextInt(mapa.getBordeHorizontal());
        int posVertical = random.nextInt(mapa.getBordeVertical());
        switch (factorBloque) {
            case 0:
                Posicion posicion0 = new Posicion(posHorizontal, posVertical);
                MetalMineral metal0 = new MetalMineral(posicion0);
                mapa.agregar(metal0, posicion0);
                break;

            case 1:
                for (int i = posHorizontal; i <= posHorizontal + 1; i++) {
                    Posicion posicion = new Posicion(i, posVertical);
                    MetalMineral metal = new MetalMineral(posicion);
                    mapa.agregar(metal, posicion);
                }
                break;

            case 2:
                for (int i = posHorizontal; i <= posHorizontal + 1; i++) {
                    for (int j = posVertical; j <= posVertical + 1; j++) {
                        Posicion posicion = new Posicion(i, j);
                        MetalMineral metal = new MetalMineral(posicion);
                        mapa.agregar(metal, posicion);
                    }
                }
                break;


            case 3:
                for (int i = posHorizontal; i <= posHorizontal + 2; i++) {
                    for (int j = posVertical; j <= posVertical + 2; j++) {
                        Posicion posicion = new Posicion(i, j);
                        MetalMineral metal = new MetalMineral(posicion);
                        mapa.agregar(metal, posicion);
                    }
                }
                break;

            default:
                break;

        }
    }
    public void ponerDiamante(int factorBloque) {
        int posHorizontal = random.nextInt(mapa.getBordeHorizontal());
        int posVertical = random.nextInt(mapa.getBordeVertical());
        switch (factorBloque) {
            case 0:
                Posicion posicion0 = new Posicion(posHorizontal, posVertical);
                DiamanteMineral diamante0 = new DiamanteMineral(posicion0);
                mapa.agregar(diamante0, posicion0);
                break;

            case 1:
                for (int i = posHorizontal; i <= posHorizontal + 1; i++) {
                    Posicion posicion = new Posicion(i, posVertical);
                    DiamanteMineral diamante = new DiamanteMineral(posicion);
                    mapa.agregar(diamante, posicion);
                }
                break;

            case 2:
                for (int i = posHorizontal; i <= posHorizontal + 1; i++) {
                    for (int j = posVertical; j <= posVertical + 1; j++) {
                        Posicion posicion = new Posicion(i, j);
                        DiamanteMineral diamante = new DiamanteMineral(posicion);
                        mapa.agregar(diamante, posicion);
                    }
                }
                break;


            case 3:
                for (int i = posHorizontal; i <= posHorizontal + 2; i++) {
                    for (int j = posVertical; j <= posVertical + 2; j++) {
                        Posicion posicion = new Posicion(i, j);
                        DiamanteMineral diamante = new DiamanteMineral(posicion);
                        mapa.agregar(diamante, posicion);
                    }
                }
                break;

            default:
                break;

        }
    }

}
