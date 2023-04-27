public class Retangulo implements FormaGeometrica {
    
    private double base;
    private double altura;
    private int lados;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public Retangulo() {}

    public Retangulo(double base, double altura, int lados) {
            this.base = base;
            this.altura = altura;
            this.lados = lados;
    }

    @Override
    public double getArea(){

        double area = base * altura;
        
        return area;
    }

    @Override
    public int getNumLados() {
        int numLados = lados;
       
        return numLados;
    }

    @Override
    public double getPerimetro() {
        double perimetro = (2 * base) + (2 * altura); 
        
        return perimetro;
    }
}
