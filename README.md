# ContaBanco

## Descrição

O projeto **ContaBanco** é um simples sistema de gerenciamento de contas bancárias. Ele permite que os usuários insiram informações sobre uma conta bancária, como o número da agência, número da conta, nome do cliente e saldo. O sistema exibe uma mensagem de confirmação com os dados inseridos.

## Funcionalidades

- **Entrada de dados do usuário**: Permite que o usuário digite informações sobre a conta.
- **Formatação de saldo**: Exibe o saldo formatado com duas casas decimais.
- **Saída amigável**: Exibe uma mensagem de confirmação clara e compreensível.

## Como Rodar o Projeto

Para executar o projeto, siga as instruções abaixo:

### Pré-requisitos

- JDK 8 ou superior instalado em sua máquina.
- IDE (como Eclipse, IntelliJ IDEA ou Visual Studio Code) para editar e executar o código.

### Passos

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/VeronicaCasanova/dio-trilha-java.git
   ```
2. **Navegue até o diretório do projeto**:
   ```bash
   cd conta-banco
   ```
3. **Compile o código** (caso necessário):
   ```bash
    javac src/ContaTerminal.java
   ```
4. **Execute o programa**:
   ```bash
    java -cp src ContaTerminal
   ```

## Exemplo de Uso
Quando o programa for executado, você verá as seguintes solicitações no terminal:
  ```bash
    Por favor, digite o número da Agência: 
    Por favor, digite o número da Conta: 
    Por favor, digite o Nome do Cliente: 
    Por favor, digite o Saldo:
  ````

Após inserir os dados, o programa exibirá uma mensagem como esta:
  ```bash
    Olá [Nome Cliente], obrigado por criar uma conta em nosso banco!
    Sua agência é [Agencia], conta [Numero] e seu saldo R$[Saldo] já está disponível para saque.
  ````

