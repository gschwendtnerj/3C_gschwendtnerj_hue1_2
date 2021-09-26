import java.util.ArrayList;
import java.util.List;

public class EratosthenesPrimeSieve implements PrimeSieve {

    private final int UPPER_LIMIT;
    private static boolean[] primenumbers;

    public EratosthenesPrimeSieve(int UPPER_LIMIT)
    {
        this.UPPER_LIMIT = UPPER_LIMIT;

    }

    private void initializePrimes()
    {
        primenumbers = new boolean[UPPER_LIMIT];
        for(int i = 0; i<UPPER_LIMIT;i++)
        {
            primenumbers[i] = true;
        }
    }


    @Override
    public boolean isPrime(int p) {
        initializePrimes();
        for(int i = 2; i<UPPER_LIMIT;i++)
        {
            if(primenumbers[i])
            {
                if(i == p)
                {
                    return true;
                }

                for(int j = i;j<UPPER_LIMIT;j++)
                {
                    int primeIndex = i*j;
                    if(primeIndex<UPPER_LIMIT)
                    {
                        primenumbers[primeIndex] = false;
                    }
                }
            }

        }
        return false;
    }

    @Override
    public void printPrimes() {
        System.out.println("Primzahlen:");
        var primes = getPrimes(UPPER_LIMIT);
        for(int i = 0; i < primes.size();i++)
        {
            System.out.println(primes.get(i));
        }
    }

    @Override
    public void printEvenNumberWithPrimeSum() {
        int primeNumber1;
        int primeNumber2;
        boolean doBreak = false;
        for(int i = 4; i<UPPER_LIMIT;i++)
        {
            if(i%2==0)
            {
                var primes = getPrimes(i);
                for(int index2 = 0; index2 < primes.size();index2++)
                {
                    primeNumber1 = primes.get(index2);
                    for(int index3 = 0; index3 < primes.size();index3++)
                    {
                        primeNumber2 = primes.get(index3);
                        if(i == (primeNumber1 + primeNumber2))
                        {
                            System.out.println(i + " summe: " + i + " = " + primeNumber1 + " + " + primeNumber2);
                            doBreak = true;
                            break;
                        }
                    }
                    if(doBreak)
                    {
                        break;
                    }
                }
            }
        }
    }

    private ArrayList<Integer> getPrimes(int upper_limit)
    {
        initializePrimes();
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i = 2; i<upper_limit;i++)
        {
            if (primenumbers[i]) {
                primes.add(i);
                for (int j = i; j < upper_limit; j++) {

                    int primeIndex = i * j;
                    if (primeIndex < upper_limit) {
                        primenumbers[primeIndex] = false;
                    }
                }
            }
        }
        return primes;
    }


}
