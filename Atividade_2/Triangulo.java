class Triangulo extends Area{
    private double base;
    private double altura;

    Triangulo(double base, double altura){
        this.altura = altura;
        this.base=base;
    };

    @Override
    void calcularArea(){
        System.out.println("área traiangulo: "+((this.base*this.altura)/2));
    }
}