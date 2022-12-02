@Grab('org.apache.commons:commons-math3:3.4.1')
import org.apache.commons.math3.primes.Primes

def call(int count = 0) {
  if (!Primes.isPrime(count)) {
    //error "${count} was not prime"
    echo "${count} is not prime"
  }
  echo "it's prime"
}
