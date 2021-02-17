/*
> Class: GenerateTestValues

>>> method: userEmails(int howMany)
        Gera e retorna uma lista ordenada de N (howMany) emails.
        Os emails gerados são [user0@example.com, user1@example.com, user2@example.com...]

>>> method: randomProducts(int howMany)
        Gera e retorna uma lista de produtos ordenada de N (howMany) produtos.
        Os produtos gerados tem nomes [productId_0, productId_1, productId_2...]
        Cada produto na lista tera uma quantidade entre 0 e 10 definida aleatoriamente.
        Cada produto na lista tera uma preço unitário entre 0 e 1000 definido aleatoriamente.
 */

import java.util.ArrayList;
import java.util.List;

public class GenerateTestValues {

    // Gera e retorna uma lista de emails.
    public static List userEmails(int howMany) {
        List<String> emails = new ArrayList();
        if (howMany >= 0) {
            for (int i = 0; i < howMany; i++) {
                String userId = "user" + i + "@example.com";
                emails.add(userId);
            }
        }
        System.out.println("userEmails: " + howMany);
        return emails;
    }

    // Retorna uma lista de produtos
    public static List randomProducts(int howMany) {
        List<ItemDetails> products = new ArrayList<>();
        if (howMany >= 0) {
            for (int i = 0; i < howMany; i++) {
                String productId = "productId_" + i;
                int qty = (int) (10 * Math.random());
                int price = (int) (1000 * Math.random());
                ItemDetails product = new ItemDetails();
                product.set(productId, qty, price);
                products.add(product);
            }
        }
        System.out.println("products: " + howMany);
        System.out.println("billTotal: " + SplitBill.grandTotal(products) + "\n");
        return products;
    }

}
