public class ShoppingCart {
    public static void main(String[] args) {
        double item1Price = 19.99;
        double item2Price = 5.49;
        double item3Price = 12.89;
        int item1Qty = 2;
        int item2Qty = 4;
        int item3Qty = 1; //given inputs

        double item1Total = calculateItemTotal(item1Price, item1Qty); 
        double item2Total = calculateItemTotal(item2Price, item2Qty);
        double item3Total = calculateItemTotal(item3Price, item3Qty); // logic to find the total for each item using methods

        double total = item1Total + item2Total + item3Total; // new logic for adding total using the above

        displayTotal(total); //new logic to display total
    }
    public static double calculateItemTotal(double price, int quantity) {
        return price * quantity;
    }

    public static void displayTotal(double total) {
        System.out.println("Total cost: $" + total);
    }
}

// uploaded to https://github.com/VYX1/quiz-2-csi2300