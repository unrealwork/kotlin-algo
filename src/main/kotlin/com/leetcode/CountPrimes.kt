package com.leetcode

class CountPrimes {
    fun countPrimes(n: Int): Int {
        val primes = mutableListOf<Int>()
        for (i in 2 until n) {
            var j = 0;
            var isPrime = true;
            while (j < primes.size && primes[j]*primes[j] <= i) {
                if (i % primes[j] == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }
            if (isPrime) {
                primes.add(i)
            }
        }
        return primes.size;
    }
}