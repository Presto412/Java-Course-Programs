# Java Course Files

## Lab Programs

### Experiment 1

- [Simple Calculator](./lab/Calculator.java)
- [Duplicates in an array](./lab/Duplicate.java)
- [Odd and Even numbers in an array](./lab/EvenOdd.java)
- [Pascal Triangle](./lab/Pascal.java)
- [Third largest in an array](./lab/ThirdLargest.java)
- [Palindrome](./lab/Palindrome.java)

---

### Experiment 2

**Question 1:** Number Conversion <br>
**Solution**

- [Test Class](./lab/NumberConversionTest)
- [Decimal to Hexadecimal](./lab/NumberConversion/Decimal2Hexa.java)
- [Decimal to Binary](./lab/NumberConversion/Decimal2Binary.java)

**Question 2:**: Program to read a chemical equation and find out the
count of the reactants and the products. Also display the count of the
number of molecules of each reactant and product. <br>
Eg., For the equation, <br> `2NaOH + H2SO4 -> Na2SO4+ 2H2O`, <br> the O/P
should be as follows. <br>
Reactants are 2 moles of `NaOH`, 1 mole of `H2SO4`. <br>
Products are 1 mole of `Na2SO4` and 2 moles of `H2O`.

- [Solution](./lab/ChemicalEquation.java)

---

### Experiment 3

**Question 1:** Assume that a bank maintains two kinds of accounts for customers, one
called as savings account and the other as current account. The savings
account provides compound interest and withdrawal facilities but no
cheque book facility. The current account provides cheque book facility but
no interest. Current account holders should maintain a minimum balance
and if the balance falls below this level, a service charge is imposed.
Create a class account that stores customer name, account number and type
of account. From this derive the classes cur_acct and sav_acct to make
them more specific to their requirements. Include necessary member
functions in order to achieve the following tasks :

- Accept deposit from a customer and update the balance.
- Display the balance
- Compute and deposit interest.
- Permit withdrawal and update the balance.
- Check for the minimum balance, impose penalty, necessary, and update the balance. <br>

**Solution**: <br>

- [Test Class](./lab/Account/AccountTest.java)
- [Account Class](./lab/Account/Account.java)
- [Current Account Class](./lab/Account/Cur_acct.java)
- [Savings Account Class](./lab/Account/Sav_acct.java)

**Question 2**: <br>
Within the package named ‘primespackage’, define a class Primeswhich includes a method checkForPrime() for checking if the given
number is prime or not. Define another class named TwinPrimes outside of
this package which will display all the pairs of prime numbers whose
difference is 2. (Eg, within the range 1 to 10, all possible twin prime
numbers are (3,5), (5,7)). The TwinPrimes class should make use of the
checkForPrime() method in the Primes class. <br>

**Solution**

- [Primes.java](./lab/primepackages/Primes.java)
- [TwinPrimes.java](./lab/TwinPrimes.java)

**Question 3**: Q2 in [CAT1 Question Paper](./CAT-1-QP.pdf)<br>
[**Solution**](./lab/Userpassword.java)

**Question 4**: Q3 in [CAT1 Question Paper](./CAT-1-QP.pdf)<br>
[**Solution**](./lab/StudentTest.java)

---
