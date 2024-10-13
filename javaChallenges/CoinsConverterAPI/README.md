# CoinsConverter - Conversor de Moedas

Este é um projeto simples em Java que realiza a conversão entre três moedas: Dólar (USD), Euro (EUR) e Real (BRL). O sistema utiliza a API **ExchangeRate-API** para obter as taxas de câmbio em tempo real e converter valores entre essas moedas, de acordo com a escolha do usuário.

## Funcionalidades

- Conversão de moedas em tempo real entre Dólar, Euro e Real.
- Consulta à API **ExchangeRate-API** para obter as taxas de câmbio atuais.
- Interface simples no terminal, onde o usuário pode escolher entre diferentes pares de conversão.
  
## Opções de Conversão

O programa oferece as seguintes opções de conversão:

1. Dólar (USD) -> Euro (EUR)
2. Dólar (USD) -> Real (BRL)
3. Euro (EUR) -> Dólar (USD)
4. Euro (EUR) -> Real (BRL)
5. Real (BRL) -> Dólar (USD)
6. Real (BRL) -> Euro (EUR)

## Tecnologias Utilizadas

- **Java 22**: Linguagem principal para o desenvolvimento do sistema.
- **API ExchangeRate-API**: Utilizada para consultar as taxas de câmbio em tempo real.
- **HTTP Client (java.net.http)**: Para realizar as requisições HTTP e obter os dados da API.
  
## Estrutura do Projeto

O projeto está organizado da seguinte forma:

### Arquivos Principais

- `Main.java`: Classe principal que gerencia a interface com o usuário e executa as operações de conversão.
- `ExchangeRate.java`: Classe responsável por realizar a requisição à API e retornar as taxas de câmbio.
- `Coins.java`: Classe modelo para representar uma moeda.
- `Dolar.java`, `Euro.java`, `Real.java`: Classes específicas para cada moeda, que herdam de `Coins.java` e implementam suas conversões específicas.
  
## Como Usar

1. **Rodar o programa**: Execute a classe principal `Main.java` para iniciar a aplicação.
2. **Escolha uma opção de conversão**: Após iniciar o programa, o usuário será apresentado com as opções de conversão de moeda.
3. **Inserir o valor a ser convertido**: Digite o valor em moeda que deseja converter.
4. **Receba o resultado**: O programa fará a consulta à API e exibirá o valor convertido com base na taxa de câmbio mais recente.

## Considerações

- O programa depende de uma conexão com a internet para fazer a requisição à API ExchangeRate-API e obter as taxas de câmbio.
- A taxa de câmbio pode variar de acordo com a resposta da API, portanto, os valores exibidos são sempre os mais atualizados possíveis no momento da consulta.

## Contribuição

Contribuições são bem-vindas! Se desejar adicionar funcionalidades ou melhorias, sinta-se à vontade para fazer um fork do projeto e enviar um pull request.

## Licença

Este projeto é de uso livre e aberto para a comunidade. Não há restrições de uso.

**Autor**: Pablo Leão Dias dos Santos
