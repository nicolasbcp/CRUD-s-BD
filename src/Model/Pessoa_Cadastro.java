package Model;

abstract class Pessoa_Cadastro {
	// Atributos
    private String nome, genero, cpf, nascimento;
    
    // Métodos Especiais
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNascimento() {
        return nascimento;
    }
    
}
