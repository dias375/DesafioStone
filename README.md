# Teste técnico do Programa de Formação em Elixir da Stone

Resposta enviada para o teste técnico da Stone. Foram além das classes criadas para solucionar o desafio (splitBill e itemDetails), também foi criada uma classe para gerar listas aleatórias que pudessem ser usadas nos testes (GenerateTestItems). As soluções podem ser testadas utilizando a classe Desafio.


## Informações Iniciais

- Você pode resolver o teste usando as seguintes linguagens: **Java, JavaScript, C#, Python, Ruby, Swift, Kotlin, Objective-C, Go, Erlang, Elixir, Emacs Lisp, e Rust**.
- Você não precisa se preocupar com performance e conhecimento de bibliotecas na resolução do teste. Esses e outros aspectos iremos abordar durante a sua formação conosco. Se preocupe em fazer uma solução que seja *clara* e *objetiva*, ou seja, não inclua funcionalidades além do que pedimos. E lembre que seu teste será avaliado por uma pessoa, facilite a vida dela :)

## Vamos ao teste!

Imagine uma lista de compras. Ela possui:

- Itens
- Quantidade de cada item
- Preço por unidade/peso/pacote de cada item

Desenvolva uma função (ou método) que irá receber uma lista de compras (como a detalhada acima) e uma lista de e-mails. Aqui, cada e-mail representa uma pessoa. 

A função deve:

- Calcular a soma dos valores, ou seja, multiplicar o preço de cada item por sua quantidade e somar todos os itens
- Dividir o valor de forma igual entre a quantidade de e-mails
- Retornar um mapa/dicionário onde a chave será o e-mail e o valor será quanto ele deve pagar nessa conta

**⚠️ IMPORTANTE**

- Quando fizer a divisão, é **importante que não falte nenhum centavo!** Cuidado quando tiver, por exemplo, um valor total de R$ 1,00 para ser dividido entre 3 e-mails. Isso daria uma dízima infinita. No entanto, o correto aqui é que duas pessoas fiquem com o valor 0,33 e a terceira fique com 0,34.
- Para facilitar e como boa prática, **não trabalhe com valores com decimais**. Ou seja, ponto flutuante ou float. Use inteiros para representar os valores! Como a menor unidade na nossa moeda é o centavo, use valores inteiros em centavos. Assim, um real será representado por 100 (cem centavos é igual a um real).
- **Deixe documentado como você "testa" a solução**. Por exemplo: "eu coloco o arquivo numa pasta/desafio e executo javac Desafio.java e depois java Desafio". Testes automatizados são bem vindos, mas não são necessários.
  - Para as linguagens que possuem um REPL (read-eval-print-loop... uma espécie de "shell" da linguagem), você pode simplesmente dizer que executa o módulo/classe de dentro dele.
  - Para as linguagens que não possuem um REPL, você pode incluir no código uma função que gera os dados e chamar o "main" da linguagem. Por exemplo, no caso de Java, seria algo nesse sentido:

```java
class Desafio {
 
  public static void main(String[] args) {
    List<Item> itens = // gera seus itens aqui
    List<String> emails = // gera seus emails aqui
    
    Map<String, Integer> resultado = Desafio.calcula(itens, emails);
    System.out.println(xxxxx); // printa o resultado
  }
}
```

**DICAS**

- Para a avaliação, iremos gerar listas de itens de acordo com a função/método definida por você e listas de e-mails aleatórias. Portanto, defina bem o comportamento para, por exemplo, uma lista vazia de itens ou uma lista vazia de e-mails.
- Não vamos trabalhar com valores nulos. Você pode assumir que os valores de entrada **SEMPRE** estarão preenchidos, porém, quando são listas, podem estar vazias.
- Não é necessário escrever o desafio em inglês, mas é algo que você pode fazer caso se sinta confortável com seu inglês técnico.
- Dedique-se ao desafio com calma. Arrume um espaço e um horário que você possa se concentrar e não hesite em procurar dicas na internet, mas tome cuidado com copiar respostas prontas para problemas. Entenda o que está fazendo e verifique muitas vezes com dados diferentes a solução. Estresse bem o modelo com listas grandes de dados e coisas do tipo para ganhar confiança na sua solução.
- Caso ache necessário, você pode incluir um arquivo de documentação a parte do código. Um "README.md" por exemplo onde você explica como chegou nessa solução, como executá-la e etc.
