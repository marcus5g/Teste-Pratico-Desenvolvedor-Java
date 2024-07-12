- Este projeto aborda um formulario com o proposito de cadastrar vagas para agendamentos e consultar os agendamentos realizados.
---
- No menu temos 5 opções que são:
  - Cadastro de vagas:
    - Início: Data de início;
    - Fim: Data de término;
    - Quantidade: Número de vagas disponíveis para a vigência.
  - Cadastro de solicitantes:
      - Nome: Nome da pessoa.
  - Cadastro de agendamentos:
    - Data: Data do agendamento;
    - Número: Número do agendamento;
    - Motivo: Motivação para o agendamento;
    - Solicitante: Pessoa que solicitou o agendamento.
  - Consulta de agendamentos: lista de agendamentos com todos os dados no período informado.
     - Parâmetros: início, fim e solicitante.
  - Consulta do total de agendamentos por solicitante: lista total de agendamentos por solicitante
    - Parâmetros: início, fim e solicitante.
---
Funciona de forma em que possa realizar cadastros e buscas dos agendamentos recebendo parametros foi usado versão Java 17, JPA, Spring, HSQLDB e JSF.
Maven para gerenciamento das dependências.
---
Primeiro passo para execução:
- Após baixar o projeto, inicie-o abrindo pela pom para que a IDE possa baixar as dependencias corretamente.
- Crie o Banco de Dados para o projeto e indique o caminho, usuario e senha que foram criados juntos.
 - Configurações para Funcionamento:
   > - No arquivo "application.properties" informe em %CAMINHO_BANCO_HSQL_LOCAL% 
    - O caminho completo utilizado para acesso ao banco de dados:
   > - spring.datasource.url=jdbc:hsqldb:file:%CAMINHO_BANCO_HSQL_LOCAL%;hsqldb.lock_file=false
  Por exemplo: C:\\Projetos\\Teste-Pratico-Desenvolvedor-Java\\banco\\agenda
-  Utilize o comando  para compilação do projeto:
   > - mvn install -DskipTests
- Para iniciá-lo, utilize o comando:
  > - java -jar -Dserver.port=9494 target/Teste-Pratico-Desenvolvedor-Java-1.5.4-SNAPSHOT.jar
- Abra o negador e acesse:
    > - http://localhost:9494
---
Siga as instruções e bom uso!