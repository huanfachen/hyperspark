package it.polimi.hyperh.worksheets
import scala.util.Random
import it.polimi.hyperh.solution.Solution
import it.polimi.hyperh.solution.EvaluatedSolution

object testFramework {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(221); 
  println("Welcome to the Scala worksheet");$skip(91); 
 	def checkDuplicates(list: List[Int]): Boolean = {
 		list.distinct.size != list.size
 	};System.out.println("""checkDuplicates: (list: List[Int])Boolean""")}
}