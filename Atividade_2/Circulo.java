class Circulo extends Area{

    private double raio;

    Circulo(double raio){
        this.raio = raio;
    }

    @Override
    void calcularArea(){
        System.out.println("Área do circulo: "+((this.raio*this.raio*3.1415)));
    }
}