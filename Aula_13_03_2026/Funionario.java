class Funcionario extends Pessoa {
    private String cargo;

    Funcionario(String nome, String cpf, String cargo) {
        super(nome, cpf);
        this.cargo = cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;

    }

    public String getCargo() {
        return this.cargo;
    }
}