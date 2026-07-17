package model;

// Nova filha da hierarquia: herda tudo de Veiculo e adiciona so a sua especialidade
public class Moto extends Veiculo {
    private int cilindradas;
    private boolean temBau;

    public Moto(String marca, String modelo, int ano, int cilindradas, boolean temBau) {
        super(marca, modelo, ano); // o que e de Veiculo vai para Veiculo
        this.cilindradas = cilindradas;
        this.temBau = temBau;
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Vrum vrum vrum!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo(); // reaproveita a parte comum
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Tem baú: " + (temBau ? "Sim" : "Não"));
    }

    // Metodo proprio da Moto: usa o getter herdado para decidir
    public void empinar() {
        if (getVelocidade() > 20) {
            System.out.println("A moto empinou! Segura firme!");
        } else {
            System.out.println("Velocidade baixa demais para empinar: acelere acima de 20 km/h.");
        }
    }

    // Getters especificos
    public int getCilindradas() {
        return cilindradas;
    }

    public boolean isTemBau() {
        return temBau;
    }
}
