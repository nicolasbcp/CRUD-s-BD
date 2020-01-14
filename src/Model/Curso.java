package Model;

public class Curso extends Cadastro_DC {
	// Atributos
    private int totalMaterias;
    
    // Métodos Especiais
    public int getTotalMaterias() {
        return totalMaterias;
    }

    public void setTotalMaterias(int totalMaterias) {
        this.totalMaterias = totalMaterias;
    }
    
}
