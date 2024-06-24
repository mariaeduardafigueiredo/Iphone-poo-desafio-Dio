package dispositvo.ipod;

import dispositvo.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {

  @Override
  public void tocarMusica() {


    System.out.println("Tocando Michael jackson."); 


  }

  @Override
  public void pausarMusica() {
    System.out.println("Musica pausada.");
  }

  @Override
  public void mudarMusica() {
    System.out.println("mudando musica.");
  }
  
}
