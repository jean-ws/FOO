public class App {
    public static void main(String[] args) throws Exception {

        Futebol aula1 = new Futebol();
        aula1.local = "São Paulo";
        aula1.data = "01/01/2023";
        aula1.hora = "06:30";

        Futebol aula2 = new Futebol();
        Futebol aula3 = new Futebol("Londrina", "02/12/2022", "10:19");

        aula1.agendarAula("02/02/2022");
        aula2.agendarAula("03/03/2023");
        aula3.agendarAula("03/03/2022");

        aula3.instrutor.nome = "João";

        Natacao aula4 = new Natacao();
        if (aula4.piscinaAquecida) {
            System.out.println("A piscina é aquecida");
        }
    }
}
