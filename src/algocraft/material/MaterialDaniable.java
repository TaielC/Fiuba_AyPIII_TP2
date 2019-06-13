package algocraft.material;

public interface MaterialDaniable  implements ObjectoUbicable{

    public boolean esDaniadoPor(MaterialDaniable material);

    boolean dania(Madera madera);
    boolean dania(Piedra piedra);
    boolean dania(Metal metal);
    boolean dania(Diamante diamante);
}
