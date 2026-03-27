class Main_10{
    public static void main(String[] args) {


        Area a[] = {
            new Area(),
            new Triangulo(4,12),
            new Circulo(4)
        };
        for (Area i : a){
            i.calcularArea();
        }
    
}


}