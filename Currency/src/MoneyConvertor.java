
    import java.util.Scanner;

    public class MoneyConvertor {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Insert currency: ");
            String currency = scanner.nextLine();

            System.out.println("Insert amount: ");
            double amount = Double.parseDouble(scanner.nextLine());

            System.out.println("Final currency: ");
            String finalCurrency = scanner.nextLine();

            if (currency.equals(("USD"))) {
                switch (finalCurrency) {
                    case "EURO":
                        System.out.println(amount * 1.01);
                        break;
                    case "BGN":
                        System.out.println(amount * 1.98);
                        break;
                    case "USD":
                        System.out.println("Same currency");
                        break;
                    default:  System.out.println("Error");
                        break;
                }
            }
            else if (currency.equals(("EURO")))
            {
                switch (finalCurrency)
                {
                    case "EURO":
                        System.out.println("Same currency");
                        break;
                    case "BGN":
                        System.out.println(amount*1.96);
                        break;
                    case "USD":
                        System.out.println(amount*0.99);
                        break;
                    default:  System.out.println("Error");
                        break;
                }
            }
            else if (currency.equals(("BGN")))
            {
                switch (finalCurrency)
                {
                    case "EURO":
                        System.out.println(amount*0.51);
                    case "USD":
                        System.out.println(amount*0.55);
                        break;
                    case "BGN":
                        System.out.println("Same currency");
                        break;
                    default:  System.out.println("Error");
                        break;
                }
            }
            else
            {
                System.out.println("Error! Invalid Currency!");
            }

        }


    }






