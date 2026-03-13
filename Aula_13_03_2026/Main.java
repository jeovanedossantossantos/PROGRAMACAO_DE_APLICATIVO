public class Main {

    public static void main(String args[]) {
        Funcionario f1 = new Funcionario(
                "Jeovane",
                "000.000.000-00",
                "zelador");

        System.out.println(f1.getNome() + ' ' + f1.getCargo());

        Cliente c1 = new Cliente(
                "Carlos",
                "000.000.001-00");

        System.out.println(c1.getNome());

    }
}