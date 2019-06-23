package algocraft.excepciones;

public class NoHaySuficienteMaterialExeption extends RuntimeException {
    public NoHaySuficienteMaterialExeption(String material) {
        super(material);
    }
}
