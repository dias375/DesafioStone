/*
> Class: SplitBill

>>> method: perPerson
        Verifica se ha usuários ou itens na lista:
            Se não houver usuários: cobrar de undefinedUser.
            Se não houver itens: a cobrança será zero.
        Calcula o valor total a ser cobrado utilizando o método this.grandTotal.
            billSplit: Divide o valor cobrado totalCharge pelo numero de usuários;
            billRemainder: Restante da divisão. Deve ser acrescido a cobrança.
        Para cada usuário na lista
            Cobrar o valor individual (splitCharge);
            Se houver sobra: cobrar mais 1 centavo e retirar 1 centavo da sobra.
        Adicionar o resultado ao Map(key:email,valorCobrado).

>>> method: grandTotal
        Para cada produto na lista, encontrar seu valor com ItemDetails.totalPrice;
        Acrescentar o valor do produto no grandTotal
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SplitBill {

    public static Map<String, Integer> perPerson(List users, List products) {


        // Checar se há itens na lista de produtos.
        if (products.isEmpty()) {
            System.out.println("[AVISO] Lista de itens vazia. Retornando o valor cobrado como 0." + "\n");
        }
        // Checar se há usuários, se não houver, cobrar de undefinedUser.
        if (users.isEmpty()) {
            System.out.println("[AVISO] Lista de usuários vazia. Retornando valor para undefinedUser." + "\n");
            users.add("undefinedUser");
        }

        // Calcular o valor total a ser cobrado, o valor por usuário e se há sobra.
        int billTotal = grandTotal(products);
        int billSplit = billTotal / users.size();
        int billRemainder = billTotal % users.size();
        Map<String, Integer> individualBill = new HashMap<>();

        // Adicionar o valor por usuário ao individualBill(key:email,valorCobrado)
        for (Object user : users) {
            String currentUser = String.valueOf(user);
            int chargeUser = billSplit;
            // Adicionar 1 centavo a cobrança se houver sobra.
            if (billRemainder != 0) {
                chargeUser++;
                billRemainder--;
            }
            individualBill.put(currentUser, chargeUser);
        }
        return individualBill;
    }

    public static Integer grandTotal(List products) {
        int grandTotal = 0;
        for (Object product : products) {
            ItemDetails item = (ItemDetails) product;
            grandTotal += item.totalPrice();
        }
        return grandTotal;
    }
}