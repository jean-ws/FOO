public class Futebol extends Esporte{
    Instrutor instrutor;
    String modalidade; //campo ou salão

    public Futebol(){
        this.data = "xx/xx/xxxx";
        this.instrutor = new Instrutor();
    }

    public Futebol(String local, String data, String hora){
        this.local = local;
        this.data = data;
        this.hora = hora;
        this.instrutor = new Instrutor();
    }
    
    void agendarAula(String dataDaVacina){
        System.out.println("Aula Agendada para " + dataDaVacina);
    }
}
