# Desafio de projeto - Simulando Conta Bancária Através do Terminal/Console

## Resolução do desafio de projeto da formação Java Developer da DIO

### Sobre o desafio

Criar um projeto que receba dados via terminal contendo características de conta em banco conforme os atributos:

| Atributo     | Tipo    |
| -------------|---------|
| Número Conta | int     |
| Agência      | String  |
| Nome cliente | String  |
| Saldo        | double  |

Esse dados deverão ser inseridos pelo usuário via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada. Em seguida o sistema deverá exibir uma mensagem com todos os dados inseridos pelo usuário.

### Resolução 

Para o input de dados usei a classe ```Scanner``` que permite a leitura dos dados de entrada do usuário no terminal de acordo com um texto de sugestão. Vide o trecho de código a seguir:

```java
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String clientName = scanner.next();

        System.out.println("Digite o número da agência: ");
        String agencyNumber = scanner.next();
```

Na sequência imprimi os dados inseridos usando concatenação:

```java
        System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é: " + agencyNumber + " conta: " + countNumber);
        System.out.println("E seu saldo R$: " + balance + " Já está disponível para saque.");
```
