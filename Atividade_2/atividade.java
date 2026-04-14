 
 
interface ReprodutorMusical { 
    void tocar(); 
    void pausar(); 
    void selecionarMusica(String musica); 
} 
 
interface AparelhoTelefonico { 
    void ligar(String numero); 
    void atender(); 
    void iniciarCorreioVoz(); 
} 
 
interface NavegadorInternet { 
    void exibirPagina(String url); 
    void adicionarNovaAba(); 
    void atualizarPagina(); 
} 
 
 
class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet { 
 
    public void tocar() { 
        System.out.println("Tocando música "); 
    } 
 
    public void pausar() { 
        System.out.println("Música pausada "); 
    } 
 
    public void selecionarMusica(String musica) { 
        System.out.println("Selecionando música: " + musica); 
    } 
 
 
    public void ligar(String numero) { 
        System.out.println("Ligando para: " + numero); 
    } 
 
    public void atender() { 
        System.out.println("Atendendo chamada "); 
    } 
 
    public void iniciarCorreioVoz() { 
        System.out.println("Iniciando correio de voz "); 
    } 
 
   
    public void exibirPagina(String url) { 
        System.out.println("Abrindo página: " + url); 
    } 
 
    public void adicionarNovaAba() { 
        System.out.println("Nova aba aberta  "); 
    } 
 
    public void atualizarPagina() { 
        System.out.println("Página atualizada "); 
    } 
} 
 
public class Main { 
    public static void main(String[] args) { 
 
        iPhone iphone = new iPhone(); 
 
     
        iphone.selecionarMusica("Lose Yourself"); 
        iphone.tocar(); 
        iphone.pausar(); 
 
        System.out.println("-------------"); 
 
      
        iphone.ligar("71999999999"); 
        iphone.atender(); 
        iphone.iniciarCorreioVoz(); 
 
        System.out.println("-------------"); 
 
      
        iphone.exibirPagina("https://www.google.com"); 
        iphone.adicionarNovaAba(); 
        iphone.atualizarPagina(); 
    } 
} 
 
