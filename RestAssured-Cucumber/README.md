Este Script foi criado com o intuito de atender a uma solicita��o da etapa do processo de contrata��o da empresa META para um de seus clientes.

Aproveitei o ensejo/est�mulo para estudar um pouco mais a constru��o de scripts via PageObject que propicia uma maior robustez nos scripts al�m de exercitar a aplica��o da solu��o RestAssured para automa��o de testes via API. O exerc�cio propriamente dito seria tranquilamente realizado via PostMan, mas como disse; o bom � o desafio!

IDE UTILIZADA:
Eclipse Java EE IDE for Web Developers.
Version: Oxygen Release (4.7.0)
Build id: 20170620-1800

SOBRE O C�DIGO:

FERRAMENTAs
- SELENIUM: com o objetivo de ao mesmo tempo participar do processo e aperfei�oar o meu conhecimento me desafiei a escrever uma consulta de acesso a API via Java com selenium

AMBIENTE (DEMAIS INFORMA��ES VIDE ARQUIVO POM.XML)
- MAVEN: O script foi constru�do sob estrutura de gest�o de depend�ncias do Maven, que permite uma ampla biblioteca de plugIns e uma excelente solu��o din�mica de gest�o de depend�ncias. (https://www.devmedia.com.br/introducao-ao-maven/25128)
- CUCUMBER: Com o objetivo de padroniza��o das escritas e direcionamento a uma interpreta��o mais leg�vel do c�digo adotei o Cucumber que suporte a escritas em cima de comportamento, permite as escrita dos cen�rios atrav�s dos casos de testes de forma natural (gherkin), deixando o script absolutamente interpretativo aos que dominam programa��o e os que n�o dominam tambem. � SHOW! Alem de relat�rios aos quais tb usei... espero que curtam!
- RESTASSURED: a grande estrela deste c�digo, o RestAssured � uma biblioteca utilizada para automa��o de testes. Ele permitira definir comportamento da aplica��o de tal forma que aplica��es e linguagens distintas possam se comunicar dando maior versatilidade no uso desta solu��o - desde que estejam todos utilizando o mesmo protocolo HTTP.

FRAMEWORK
Foi utilizado no frameWork uma arquitetura de PageObject permitindo que fossem aplicados solu��es din�micas que permitissem uma manutenabilidade para eventuais ajustes, alem de dar mais robustez ao script.

Foi utilizado o pacote de Runner para gerenciamento dos testes e o cucumber para a padroniza��o da escrita e busca de informa��es na Api

So, let's study and code. See you soon..
