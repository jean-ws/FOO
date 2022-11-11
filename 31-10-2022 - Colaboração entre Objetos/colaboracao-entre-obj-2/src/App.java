public class App {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.p1.marca = "Goodyear";

        Moto moto = new Moto();
        moto.p2.marca = "Pirelli";

        System.out.println("Marca do pneu 2 da moto: " + moto.p2.marca);
        System.out.println("Marca do pneu 1 do carro: " + carro.p1.marca);

    }
}