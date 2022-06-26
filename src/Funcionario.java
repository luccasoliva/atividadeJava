public class Funcionario {


    private String nome;
    private Integer idade;
    private String cargo;
    private boolean situacao;


    public Funcionario(String nome, Integer idade, String cargo, boolean situacao) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.situacao = situacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public void aniversario(){
        setIdade( idade += 1);
        System.out.println(getNome() + ", parabéns por completar " + getIdade() + " Anos!");
    }

    public void demitirFuncionario(){
        setSituacao(false);
        System.out.println( "Funcionario(a): "+getNome()+" foi demitido!");
    }
    public void pagarSalario(){
        System.out.println("Salário do(a) Funcionario(a) " + getNome() +" foi efetuado!");
    }
    public void trocarCargoFuncionario(String cargo){
        this.cargo = cargo;
        System.out.println("Funcionário(a) "+ getNome() + " Foi promovido(a) a: " + cargo);
    }
    public void mostrarFuncionario(){
        System.out.println("Nome: " + getNome()+ ", Idade: "+ getIdade() + ", Cargo: " + getCargo());
    }
}
