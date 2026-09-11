// CODIGO INICIAL DO EXERCICIO. Sua missao esta em EXERCICIO-03-eliminando-a-escada-de-if.md.
// Repare: a mesma escada "if tipo == X" aparece DUAS vezes (area e perimetro).
// Se alguem esquecer de atualizar uma das duas ao adicionar uma forma nova,
// o programa compila, roda, e mente sobre um dos dois valores.
public class CalculadoraDeFormas {

    public static void main(String[] args) {
        String[] tipos = { "circulo", "quadrado", "circulo" };
        double[] medidas = { 3.0, 4.0, 5.0 }; // raio ou lado, dependendo do tipo

        for (int i = 0; i < tipos.length; i++) {
            String tipo = tipos[i];
            double medida = medidas[i];

            double area;
            if (tipo.equals("circulo")) {
                area = Math.PI * medida * medida;
            } else if (tipo.equals("quadrado")) {
                area = medida * medida;
            } else {
                area = 0;
            }

            double perimetro;
            if (tipo.equals("circulo")) {
                perimetro = 2 * Math.PI * medida;
            } else if (tipo.equals("quadrado")) {
                perimetro = 4 * medida;
            } else {
                perimetro = 0;
            }

            System.out.println(tipo + " (medida=" + medida + "): area=" + area + ", perimetro=" + perimetro);
        }
    }
}
