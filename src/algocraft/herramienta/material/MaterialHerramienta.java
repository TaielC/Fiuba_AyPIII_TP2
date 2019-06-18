package algocraft.material;

public interface MaterialHerramienta {

    boolean equals(MaterialHerramienta material);

    boolean daniaA(Madera madera);
    boolean daniaA(Piedra piedra);
    boolean daniaA(Metal metal);
    boolean daniaA(Diamante diamante);
}
