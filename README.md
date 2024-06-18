# Projeto iPhone - Simulação de Funcionalidades

Este projeto simula um conjunto de funcionalidades inspiradas em um iPhone, incluindo uma galeria de fotos, gerenciamento de e-mails, reprodução de músicas e vídeos, navegação na internet, telefone e widgets.

## Estrutura do Projeto

O projeto está organizado em vários pacotes que representam diferentes aspectos do sistema do iPod:

- `galeria`: Funcionalidades relacionadas à galeria de fotos.
- `imap`: Funcionalidades relacionadas ao gerenciamento de e-mails.
- `ipod`: Classes principais que definem o reprodutor de mídia iPod.
- `navegador`: Funcionalidades de navegação na internet.
- `telefone`: Funcionalidades relacionadas ao telefone.
- `widgets`: Funcionalidades de widgets adicionais.

Cada pacote contém classes que implementam diferentes partes do sistema, como músicas, artistas, álbuns, vídeos, contatos telefônicos, etc.

## Funcionalidades Implementadas

### Galeria (`galeria.Galeria`)

- `verFoto()`: Exibe uma foto.
- `darZoom()`: Aplica zoom em uma foto.
- `tirarZoom()`: Remove o zoom da foto.
- `setWallpaper()`: Define uma foto como papel de parede.
- `apagarFoto()`: Apaga uma foto da galeria.

### Imap (`imap.Imap`)

- `verTodosEmails()`: Exibe todos os e-mails disponíveis.
- `abrirEmail()`: Abre um e-mail específico.
- `enviarEmail(String email)`: Envia um e-mail para o endereço especificado.

### iPod (`ipod.*`)

O pacote `ipod` contém classes que representam a estrutura do iPod, incluindo:

- `iPod`: Centraliza as funcionalidades de reprodução de música e vídeo.
- `Musica`, `Album`, `Artista`: Classes relacionadas à organização e reprodução de músicas.
- `ReprodutorMusical`, `ReprodutorDeVideo`: Classes que implementam as operações de reprodução e controle de músicas e vídeos.

### Navegador (`navegador.NavegadorInternet`)

- `exibirPagina(String url)`: Exibe uma página da web.
- `adicionarNovaAba()`: Abre uma nova aba no navegador.
- `atualizarPagina()`: Atualiza a página atual.
- `fecharAba()`: Fecha a aba atual.

### Telefone (`telefone.AparelhoTelefonico`, `telefone.Contato`)

- `ligar(String numero)`: Inicia uma ligação para o número especificado.
- `atender()`: Atende uma chamada.
- `iniciarCorreioVoz()`: Inicia o correio de voz.
- Métodos adicionais para gerenciar contatos, favoritos e operações de chamada.

### Widgets (`widgets.Widgets`)

- `verAcoes()`: Exibe informações de mercado de ações.
- `verClima()`: Mostra a previsão do tempo para o dia.

## Classe Principal (`iPhone`)

A classe `iPhone` centraliza todas as funcionalidades implementadas no projeto:

- `iPod`, `AparelhoTelefonico`, `Galeria`, `Imap`, `Widgets`, `NavegadorInternet`: Instâncias que permitem utilizar todas as funcionalidades simuladas em um iPhone.

## Utilização

Para utilizar o projeto, é necessário instanciar e configurar objetos de cada classe principal (`iPod`, `AparelhoTelefonico`, etc.) e utilizar os métodos disponíveis para simular as funcionalidades de um iPod real.

Exemplo de utilização básica:
```java
public class App {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        
        // Configuração dos objetos iPod, AparelhoTelefonico, Galeria, etc.
        // Exemplo: iphone.setIpod(new iPod());
        
        // Uso das funcionalidades
        // Exemplo: iphone.getIpod().getReprodutorMusical().tocar();
    }
}
