package mathematics

object PrimerFactors{
 
   def primeFactors(n: Long) : List[Long] = {
       val exists = (2L to math.sqrt(n.toDouble).toLong).find(n % _ == 0)
       exists match{
           case None => List(n)
           case Some(factor) => factor :: primeFactors(n / factor)
       }
        
    }
}