public class Main {
    public static void main(String[] args) {

    Funcionario f1 = new Funcionario("Diego", 33, "J�nior", true);
    Funcionario f2 = new Funcionario("Maria", 25, "J�nior", true);
    Funcionario f3 = new Funcionario("Jo�o", 29, "Pleno", true);
    Funcionario f4 = new Funcionario("Lucas", 33, "S�nior", true);

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