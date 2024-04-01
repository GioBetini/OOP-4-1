package Model;

public class Paralelogramo extends Quadrilatero {

    public Paralelogramo(){
        super();
    }

    @Override
    public float getPerimetro() {
        return 2*(getAltura() + getBase());
    }

    @Override
    public float getArea() {
        return getAltura() * getBase();
    }
   
}
