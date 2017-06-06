package com.sundogsoftware.spark


object LearningScala {
 
  /** Our main function where the action happens */
  def main(args: Array[String]) {
    
      val hello: String = "sangeeta"                     //> hello  : String = Hola!
      println(hello)                                  //> Hola!
      
      val piSinglePrecision :Float = 3.14143f 
      val intvl :Int = 1
      
      print(f" $piSinglePrecision%.5f ")
      print(f" $intvl%05d")
      
        println(s"The s prefix isn't limited to variables; I can include any expression. Like ${"sam"+2}")
 println(s"${6+7}")
 
 val sentence:String="My age is 30. "
 val pattern = """.* ([\d]+).*""".r 
 val pattern(answer)=sentence
 
 println(answer)
      
      if(1>3)
      {
        println("IMPOSSIBLE")
        
      }
      else if(3<5) {
        println("IMPOSSIBLE2")
      }
      else
      {
        print("POSSIBLE")
      }
 
      val number=5
      number match
      {
        case 1=> println("ONE")
        case 5=> println("FIVE")
        case _=> println("NOT WORKING")
      }
      

      
      for(x<-0 to 10)
      {
        var a = x;
        var b = x+1;
        var temp = a+b;
        a = b;
        b = temp
        println(temp)
        
      }
      
      
      var x = 0
      
      do{ println(x) ; x+=1} while(x<10)
      
      
      
  
  }}