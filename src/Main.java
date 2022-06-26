public class Main {
    public static void main(String[] args) {

    Funcionario f1 = new Funcionario("Diego", 33, "Júnior", true);
    Funcionario f2 = new Funcionario("Maria", 25, "Júnior", true);
    Funcionario f3 = new Funcionario("João", 29, "Pleno", true);
    Funcionario f4 = new Funcionario("Lucas", 33, "Sênior", true);

        f1.mostrarFuncionario();
        f2.mostrarFuncionario();
        f3.mostrarFuncionario();
        f4.mostrarFuncionario();


        f1.demitirFuncionario();

        f2.trocarCargoFuncionario("Pleno");

        f3.aniversario();

        f4.pagarSalario();

    }
}