package Model;


public class Trapezio extends Quadrilatero{
    
    private float baseMenor;

    public float getBaseMenor(){
        return baseMenor;
    }

    public void setBaseMenor(float baseMenor){
        this.baseMenor = baseMenor;
    }

    @Override
    public float getPerimetro() {
        return 2 * getAltura() + getBase() + baseMenor; /*eu sei que não é isso, eu devia usar a 
        diferença entre as bases para calcular um dos catetos de um triângulo retângulo,
        usar a altura como outro cateto e depois disso descobrir a lateral do trapézio
        que seria a hipotenusa desse triângulo, fazendo então a hipotenusa vezes 2 e
        somando isso às duas bases obteria o perímetro real*/

    }

    @Override
    public float getArea() {
        return ((getBase() + baseMenor)*getAltura())/2; 
    }

    
}
