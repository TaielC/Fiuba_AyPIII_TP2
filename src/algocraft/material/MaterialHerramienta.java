package algocraft.material;

public interface MaterialHerramienta {

    boolean equals(MaterialHerramienta material);

    boolean dania(Madera madera);
    boolean dania(Piedra piedra);
    boolean dania(Metal metal);
    boolean dania(Diamante diamante);
}
