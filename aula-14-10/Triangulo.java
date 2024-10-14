public class Triangulo {
    private float a;
    private float b;
    private float c;

    // Triângulo escaleno
    public Triangulo(float lado1, float lado2, float lado3) {
        this.a = lado1;
        this.b = lado2;
        this.c = lado3;
    }

    // Triângulo equilátero
    public Triangulo(float lado) {
        this(lado, lado, lado);
    }

    // Triângulo isóceles
    public Triangulo(float lado1, float lado2) {
        this(lado1, lado1, lado2);
    }

    public float calcularPerimetro() {
        return this.a + this.b + this.c;
    }

    public float calcularPerimetro(float lado1, float lado2, float lado3) {
        return lado1 + lado2 + lado3;
    }
}