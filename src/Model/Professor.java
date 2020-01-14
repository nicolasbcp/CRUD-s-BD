package Model;

public class Professor extends Pessoa_Cadastro {
    // Atributos
	private String departamento;
    private int registro;

    // Métodos Especiais
    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getRegistro() {
        return registro;
    }

    public String getDepartamento() {
        return departamento;
    }
    
}
