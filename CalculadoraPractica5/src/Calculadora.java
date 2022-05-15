public class Calculadora implements ICalculadora {
    public Calculadora() {

    }

    @Override
    public int sumar(int a, int b) {
        // Este metodo suma
        return a+b;
    }

    @Override
    public int restar(int a, int b) {
        // Este metodo resta
        return a-b;
    }

    @Override
    public int multiplicar(int a, int b) {
        // Este metodo multiplica
        return a*b;
    }

    @Override
    public int dividir(int a, int b) {
        // Este metodo divide
        return a/b;
    }
}
