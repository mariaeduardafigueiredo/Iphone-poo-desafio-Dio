import dispositvo.iphone.Iphone;
import dispositvo.ipod.Ipod;
import dispositvo.mp3.Mp3;
import dispositvo.safari.Safari;
import dispositvo.telefone.Telefone;

public class App {
    public static void main(String[] args) throws Exception {               
      Ipod ipod = new Ipod();
      ipod.tocarMusica();
      
      Mp3 mp3 = new Mp3();
      mp3.tocarMusica();

      Telefone telefone = new Telefone();
      telefone.ligar();

      Safari safari = new Safari();
      safari.atualizarPagina();

      Iphone iphone = new Iphone();
      iphone.tocarMusica();      
    }
}
