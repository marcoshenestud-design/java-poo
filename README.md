# Agência de Viagens

Projeto em Java feito para praticar orientação a objetos. O programa monta um pacote
de viagem no console, calcula o valor final e gera o resumo de uma venda.

## Como funciona

O usuário informa os dados do transporte, da hospedagem e do pacote (destino, dias,
margem de lucro e taxas). O sistema soma transporte + hospedagem (diária x dias),
aplica a margem de lucro e acrescenta as taxas para chegar ao total em dólar.

Depois disso são cadastrados os dados da venda (cliente, forma de pagamento e data)
e a cotação do dólar do dia, para exibir o resumo com o total convertido em reais.

## Classes

- `Transporte` — tipo e valor do transporte
- `Hospedagem` — descrição e valor da diária
- `PacoteViagem` — junta transporte e hospedagem e faz os cálculos do pacote
- `Venda` — dados do cliente, conversão de dólar para real e resumo final
- `Main` — leitura dos dados pelo teclado

## Como executar

Abra o projeto no NetBeans e rode a classe `Main`.

Ou pelo terminal:

    javac -d build/classes src/agenciaviagens/*.java
    java -cp build/classes agenciaviagens.Main
