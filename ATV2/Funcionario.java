package ATV2;

public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario (String nome, String email, String cargo){
        super(nome, email);
        this.cargo = cargo;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void exibirInfo(){
        System.out.println("nome: " + this.getNome());
        System.out.println("email: " + this.getEmail());
        System.out.println("cargo: " + this.cargo);
    }

}
