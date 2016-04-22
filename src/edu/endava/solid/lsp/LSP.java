package edu.endava.solid.lsp;

/**
 * The Liskov Substitution Principle (LSP)
 *
      “If S is a declared subtype of T,
       objects of type S should behave as objects of type T are expected to behave,
       if they are treated as objects of type T”
 *
 * @author dmunteanu
 *
 * @Important
 * https://www.artima.com/intv/bloch17.html
 *
 * @Quote
 * "Josh Bloch:
 * Yes. You are correct in saying that using getClass in equals makes it much easier to preserve the equals contract,
 * but at what cost?
 * Basically, at the cost of violating the Liskov substitution principle and the principle of least astonishment.
 * You write something that obeys the contract, but whose behavior can be very surprising. "
 *
 */
public class LSP { }

/**
 *  *
 * In some cases where the LSP is difficult

   Like a healthy diet the LSP is obviously good,
   but it can be tempting to cheat a little.

 * @author dmunteanu
 *
 */


