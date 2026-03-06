// 2.1 - Conta Bancária, crie uma classe ContaBancaria com: 
// numeroConta (String)
// titular (String)
// saldo (double)
// Regras: Todos os atributos devem ser private

class ContaBancaria{
    private String numeroConta;
    private String titular;
    private double saldo;

    ContaBancaria(){
        this.saldo =0;
    }

    ContaBancaria(String numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Criar métodos:
    // depositar(double valor)
    // não pode Depósito com valor negativo

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.print("Deposito feito com  sucesso!! Valeu pai!");
            return;
        }

        System.out.print("Depisito não foi realizado! SE VIRE!");

    }
    // sacar(double valor), na mensagem exibida mostre mostre também a quantidade 
// de cédulas usadas para o valor sacado. EX: 256, 2 cédulas de 100, 1 cédula 
// de 50, 1 cédula de 5 e 1 cédula de 1.(dica: / devolve o valor inteiro e % devolve o resto). 
// não pode Saque maior que o saldo
    public void sacar(double valor){

        if(valor > this.saldo){
            System.out.print("Valor invalido! Está queredo dinheiro que não tem!");
            return;
        }

        this.saldo-=valor;

        int c100, c50, c20,c10,c5,c2,c1;
        int r100, r50,r20,r10,r5,r2;

        c100 = (int)valor / 100;
        r100 = (int)valor % 100;

        c50 = (int) r100 / 50;
        r50 = (int) r100 % 50;

        c20 = (int) r50 / 20;
        r20 = (int) r50 % 20;

        c10 = (int) r20 / 10;
        r10 = (int) r20 % 10;

        c5 = (int) r10 / 5;
        r5 = (int) r10 % 5;

        
        c2 = (int) r5 / 2;
        r2 = (int) r5 % 2;
        
        
        c1 = (int) r2 / 1;
       

        System.out.println("Saque feito com sucesso!!");
        System.out.println(c100 + "Cédulas de 100");
        System.out.println(c50 + "Cédulas de 50");
        System.out.println(c20 + "Cédulas de 20");
        System.out.println(c10 + "Cédulas de 10");
        System.out.println(c5 + "Cédulas de 5");
        System.out.println(c2 + "Cédulas de 2");
        System.out.println(c1 + "Cédulas de 1");

    }
// getSaldo()
    public double getSaldo(){
        return this.saldo;
    }




}




// Não permitir:
// 
// 
// Exibir mensagem adequada em cada caso inválido
// Faça o Main.java para testar sua classe



