Esse projeto tem a finalidade de
Criar um sistema que permita o cadastro de anúncios. O anúncio dever conter os seguintes dados:
nome do anúncio;
cliente;
data de início;
data de término;
investimento por dia;

Tecnologias usadas são:
Sprintg-boot
Spring-mvc
Spring-data
JPA
h2 database
thymeleaf
junit

Para executar o projeto, será necessário instalar os seguintes programas:
JDK 11: Necessário para executar o projeto Java
Maven 3.5.3: Necessário para realizar o build e as  importações das bibliotecas do projeto Java
Intellij: Para desenvolvimento do projeto

Construção
Para construir o projeto com o Maven, executar os comando abaixo:

mvn clean install
O comando irá baixar todas as dependências do projeto e criar um diretório target com os
artefatos construídos, que incluem o arquivo jar do projeto. Além disso, serão executados
os testes unitários, e se algum falhar, o Maven exibirá essa informação no console.

Levantar Servidor
mvn spring-boot:run
O comando ira levantar um servidor H2 um banco de dados relacional escrito em Java
a aplicação ira rodar na url:  http://localhost:8080/

Testes
Para rodar os testes, utilize o comando abaixo:
mvn test


Licença
Não se aplica.

Conclusão
Esse projeto tentou atender as exigencias imposta pela atividade .O relatório de cada anúncio contivesse:
Valor total investido;
Quantidade máxima de visualizações;
Quantidade máxima de cliques;
Quantidade máxima de compartilhamentos;
Filtrados por intervalo de tempo e cliente.
