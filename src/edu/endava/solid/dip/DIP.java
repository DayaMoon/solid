package edu.endava.solid.dip;

import java.util.List;


/**
 * Dependency Inversion principle
 *
 * Dependency Inversion is the strategy of depending upon interfaces or abstract functions and classes, rather than upon
 * concrete functions and classes
 *
 * 1) Entities must depend on abstractions not on concretions. It states that the high level/layer module must not
 * depend on the low level/layer module, but they should depend on abstractions.
 *
 * 2) Abstractions should not depend upon details. Details should depend upon abstractions
 *
 * Always program for interface and not for implementation this will lead to flexible code which can work with any new
 * implementation of interface. So use interface type on variables, return types of method or argument type of methods
 * in Java.
 *
 * This has been advised by many Java programmer including in Effective Java and Head First design pattern book.
 *
 * Read more: http://javarevisited.blogspot.com/2012/03/10-object-oriented-design-principles.html#ixzz3n1z0JaGX
 *
 *
 * Assume: *********************************************************************************************
 * View Layer  * (depends on) Service Layer (depends on) DAO Layer
 * *********************************************************************************************
 *
 *
 *
 * The goal of the dependency inversion principle is to avoid this highly coupled distribution with the mediation of an
 * abstract layer, and to increase the re-usability of higher layers.
 *
 *
 *
 * *********************************************************************************************
 * Specific Views (depend * on) <<Service Interfaces>>  (depend on) << DAO interfaces>>
 *                                       |                                  |
 *                              SpecificServices                       Specific DAOs
 *
 * *********************************************************************************************
 *
 * @author dmunteanu
 *
 */
public class DIP
{
}

