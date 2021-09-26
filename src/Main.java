import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);

        System.out.println("----------");
        System.out.println("PrimeSieve");
        System.out.println("----------");
        System.out.println("\n" + "Bitte geben Sie jetzt die Obergrenze ein!");
        EratosthenesPrimeSieve sieve = new EratosthenesPrimeSieve(s.nextInt());
        int option = 0;
        while(option!=3)
        {

            System.out.println("----------" + "\n");
            System.out.println("Optionen:");
            System.out.println("1... überprüft ob eine bestimmte Zahl eine Primzahl ist");
            System.out.println("2... gibt alle Primzahlen bis zur Obergrenze aus");
            System.out.println("3... beendet das Programm");

            option = s.nextInt();
            if(option == 1)
            {
                System.out.println("-------------------------------------------");
                System.out.println("Bitte geben Sie jetzt die Zahl, bei der Sie wissen wollen ob sie eine Primzahl ist, ein!");
                int zahl = s.nextInt();
                if(sieve.isPrime(zahl))
                {
                    System.out.println(zahl + " ist eine Primzahl!");
                }else
                {
                    System.out.println(zahl + " ist keine Primzahl!");
                }

            }else if(option == 2)
            {
                System.out.println("-------------------------------------------");
                sieve.printPrimes();

            }else if(option!=3){
                System.out.println(option + " ist keine gültige Option");
            }

        }
    }
}


