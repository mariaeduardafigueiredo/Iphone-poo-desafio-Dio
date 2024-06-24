### Exemplo de Diagrama UML (Mermaid) by: Leonardo Roeda
```mermaid
classDiagram
    class ReprodutorMusical {
        +tocarMusica()
        +pausarMusica()
        +mudarMusica()
    }

    class AparelhoTelefonico {
        +ligar()
        +atender()
        +correioVoz()
}
    class NavegadorInternet {
        +exibirPagina()
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```
