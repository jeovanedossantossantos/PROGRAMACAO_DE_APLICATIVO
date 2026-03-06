class Main{
    public static void main(String [] args){

        ContaBancaria conta = new ContaBancaria( "123456", "Obama", 1000);

        System.out.print(conta.getSaldo());
        conta.depositar(-1000);
        conta.depositar(1000);
        System.out.print(conta.getSaldo());

        conta.sacar(256);
    }
}