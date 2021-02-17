/*

> MAIN Class: Desafio
        Classe utilizada para testar o código.

>>> method: main
        Cria as listas vazias de Usuários e Produtos.
        Cria o mapa vazia que irá conter (key:emails, valorCobrado).

        Para criar um teste, chama a classe GenerateTestValues para gerar listas com X usuários e Y produtos.
            Os Y produtos tem preços unitários aleatórios entre 0 e 1000 e quantidades entre 0 e 10.
            [OBS] Para testar código repetidamente, foram utilizados os métodos userEmails e randomProducts.
                  X e Y foram definidos como números aleatórios entre 0 e 10.
                  Caso queira user algum número de usuários ou de produtos específicos, os métodos usados aceitam
                  qualquer número inteiro não negativo.

        O mapa (billPerUser) contendo os valores desejados é preenchido com a resposta do método SplitBill.perPerson
            o código exibe a lista de usuários para checagem dos valores cobrados associados com cada um.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Desafio {
    public static void main(String[] args) {

        // Gera listas vazias e o mapa a ser preenchido no formato Map(key:usuário,valorCobrado)
        List<String> userEmails = new ArrayList();
        List<ItemDetails> productsBilled = new ArrayList<>();
        Map<String, Integer> billPerUser = new HashMap<>();

        // Usa a classe Generate para preencher as listas com X usuários e Y produtos.
        int x_users = (int) (10 * Math.random());
        int y_products = (int) (10 * Math.random());
        userEmails = GenerateTestValues.userEmails(x_users);
        productsBilled = GenerateTestValues.randomProducts(y_products);

        // Preenche o mapa utilizando o método SplitBill.perPerson
        billPerUser = SplitBill.perPerson(userEmails, productsBilled);

        // Exibe o resultado
        System.out.println("<user:individualCharge>");
        billPerUser.forEach((key, value) -> System.out.println(key + ":" + value));

    }

}


