package edu.endava.solid.srp;

import java.util.*;

public class StandardDeviation {

	/**
	 *
	 * SRP may apply to class, interface method, module, etc...
	 *
	 * Check formulas http://www.diffen.com/difference/Standard_Deviation_vs_Variance
	 * @param list
	 * @return
	 */

    public static double sum(List<Double> list) {
        double sum = 0;
        for (double i : list){
           sum = sum + i;
        }
        return sum;
    }

    public static double average(List<Double> list) { // reusable
        return  sum(list) / (double) list.size();
    }

    public static List<Double> squareDeviation(List<Double> list, double mean){
   	 List<Double> squareDeviation = new ArrayList<>();
   	 for (double t : list){
   		 squareDeviation.add((t - mean) * (t - mean));
   	 }
   	 return squareDeviation;
    }

    public static double variance(List<Double> list) {
   	 double mean = average(list);
       return sum(squareDeviation(list, mean))/list.size();
    }

    public static double standardDeviation(List<Double> list) {
       return Math.sqrt(variance(list));
    }

    /**
     * All in one - just like a Swiss knife !!
     *
     *
     * @param list
     * @return
     */
    public static double getStandardDeviation(List<Double> list) {

   	 double mean, sum = 0d;

   	 for (double item : list){
   		 sum += item;
   	 }
   	 mean = sum/list.size();

   	 sum = 0;
   	 for (double item : list){
   		 sum += (item - mean) * (item - mean);
   	 }

       return Math.sqrt ( sum / list.size());
    }
}