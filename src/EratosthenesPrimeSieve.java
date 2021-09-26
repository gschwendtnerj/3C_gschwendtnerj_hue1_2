public class EratosthenesPrimeSieve implements PrimeSieve {

    private final int UPPER_LIMIT;

    public EratosthenesPrimeSieve(int UPPER_LIMIT)
    {
        this.UPPER_LIMIT = UPPER_LIMIT;
    }

    @Override
    public boolean isPrime(int p) {
        boolean[] primenumbers = new boolean[UPPER_LIMIT];
        for(int i = 0; i<UPPER_LIMIT;i++)
        {
            primenumbers[i] = true;
        }

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
        boolean[] primenumbers = new boolean[UPPER_LIMIT];
        for(int i = 0; i<UPPER_LIMIT;i++)
        {
            primenumbers[i] = true;
        }
        System.out.println("Primzahlen:");
        for(int i = 2; i<UPPER_LIMIT;i++)
        {
            if (primenumbers[i]) {
                System.out.println(i);

                for (int j = i; j < UPPER_LIMIT; j++) {
                    int primeIndex = i * j;
                    if (primeIndex < UPPER_LIMIT) {
                        primenumbers[primeIndex] = false;
                    }
                }
            }
        }
    }



}
