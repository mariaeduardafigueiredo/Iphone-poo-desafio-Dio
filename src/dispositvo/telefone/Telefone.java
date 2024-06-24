package dispositvo.telefone;

import dispositvo.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {

  @Override
  public void ligar() {
    System.out.println("ligando.");
  }

  @Override
  public void atender() {
    System.out.println("atendendo o numero 12345678");
  }

  @Override
  public void correioVoz() {
    System.out.println("a tim informa: voce esta sem saldo.");
  }
  
}
