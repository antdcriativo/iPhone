public class App {
    public static void main(String[] args) {

        iPhone iphone = new iPhone();
        System.out.println("Aparelho Telefonico:");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorrerioVoz();
        
        System.out.println("Reprodutor Musical:");
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
        
        System.out.println("Navegador de Internet:");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina();
    }
}