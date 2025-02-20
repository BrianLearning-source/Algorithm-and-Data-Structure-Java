public class Function {
    public static void main(String[] args) {

        // Array
        String flower[] = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int quantity[][] = {
                            {10, 5, 15, 7},
                            {6, 11, 9, 12},
                            {2, 10, 10, 5},
                            {5, 7, 12, 9}};
        int price[] = {75000, 50000, 60000, 10000};
        
        //call another function
        displayIncome(flower, quantity, price);
        
        displayStockAfterReduction(quantity[3]);

    }

        static void displayIncome(String flower[], int quantity[][], int price[]) {

            for (int i = 0; i < quantity.length; i++) { // Looping setiap cabang
                int totalIncome = 0;
                System.out.println("Royal Garden " + (i + 1) + " income details:");
                for (int j = 0; j < flower.length; j++) { // Looping setiap bunga
                    int income = quantity[i][j] * price[j];
                    totalIncome += income;
                }
                System.out.println("Total Income for Royal Garden " + (i + 1) + ": Rp " + totalIncome);
                System.out.println();
            }
        
        }

            static void displayStockAfterReduction(int stock[]) {
                int reduction[] = {-1, -2, 0, -5}; // Pengurangan stok bunga yang mati
                System.out.println("Stock in Royal Garden 4 after reduction:");
                for (int i = 0; i < stock.length; i++) {
                    stock[i] += reduction[i];
                    System.out.println("Remaining stock of " + (i == 0 ? "Aglonema" : i == 1 ? "Keladi" : i == 2 ? "Alocasia" : "Mawar") + ": " + stock[i]);
                }        
        }
    }