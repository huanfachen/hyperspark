package util

import it.polimi.hyperh.solution.EvaluatedSolution

/**
 * @author Nemanja
 */
object Performance {
  def RPD(someVal: Int, optVal: Int): Double = {
    100 * (someVal - optVal) / optVal
  }
  def RPD(Csome: EvaluatedSolution, Copt: EvaluatedSolution): Double = {
    RPD(Csome.value, Copt.value)
  }
  def ARPD(RPDs: List[Double]): Double = {
    var sum = 0.0
    for(i <- 0 until RPDs.size){
      sum = sum + RPDs(i)
    }
    val arpd = sum / RPDs.size
    arpd
  }
    
}