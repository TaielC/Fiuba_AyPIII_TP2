package algocraft.material;

public interface MaterialDaniable {

    public boolean esDaniadoPor(MaterialDaniable material);

    boolean dania(Madera madera);
    boolean dania(Piedra piedra);
    boolean dania(Metal metal);
    boolean dania(MetalYPiedra metalYPiedra);
    boolean dania(Diamante diamante);
}
