/*
> Class: ItemDetails
        A classe ItemDetails é responsável por segurar os valores Nome/Quantidade/Valor.

>>> method: set(String itemName, int qty, int price)
         O método set é utilizado para inserir os valores necessários para criar um objeto desta classe.

>>> method: totalPrice()
        Retorna o valor total do produto (preço unitário * quantidade).
 */

public class ItemDetails {
    private String itemName;
    private int quantity;
    private int unitaryPrice;

    // insere os valores no datatype ItemDetails
    public void set(String itemName, int qty, int price) {
        this.itemName = itemName;
        this.quantity = qty;
        this.unitaryPrice = price;
    }

    // Retorna o valor da quantidade de produtos * preço
    public int totalPrice() {
        int price = this.getUnitaryPrice();
        int qty = this.getQty();
        int sum = price * qty;
        return sum;
    }

    public int getUnitaryPrice() {
        return unitaryPrice;
    }

    public int getQty() {
        return quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(int price) {
        this.unitaryPrice = price;
    }

    public void setQty(int qty) {
        this.quantity = qty;
    }
}
