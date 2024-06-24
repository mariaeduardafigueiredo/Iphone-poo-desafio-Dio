package dispositvo.iphone;

import dispositvo.AparelhoTelefonico;
import dispositvo.NavegadorInternet;
import dispositvo.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

  @Override
  public void exibirPagina() {
   System.out.println("iphone: exibindo pagina");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println(" iphone: adicinando aba");

  }

  @Override
  public void atualizarPagina() {
    System.out.println("iphone: atualizando pagina");
  }


  @Override
  public void ligar() {
    System.out.println("iphone: ligando");
  }

  @Override
  public void atender() {
    System.out.println("iphone: atendendo chamada");
  }

  @Override
  public void correioVoz() {
    System.out.println("iphone: iniciando correio");

  }

  @Override
  public void tocarMusica() {
    System.out.println("iphone: tocando musica");

  }

  @Override
  public void pausarMusica() {
    System.out.println("iphone: pausando música Ariana Grande");

  }

  @Override
  public void mudarMusica() {
    System.out.println("iphone: mudar música para Michael Jackson");
  }
  
}
