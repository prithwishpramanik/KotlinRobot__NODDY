import java.awt.Robot


class ROBOT {
val name="NODDY"

/*THIS ROBOT HAS TO BE GIVEN INSTRUCTION EVERYDAY OTHERWISE IT WILL CRASH*/
                        /*IMPORTANT INSTRUCTION
                        1.DON'T FORGET TO GIVE INSTRUCTIONS TO NODDY BEFORE GOING TO SLEEP...OTHERWISE NODDYY WILL ALSO SLEEP
                        2.HERE DAY COUNTING STARTS WITH 0 AND NOT with 1 i.e Sunday=day1=0
                                                                        Monday=day2 =1
                                                                        Tuesday=day3=2
                                                                        Wednesday=day4=3
                                                                        Thursday=day5=4
                                                                        Friday=day6=5
                                                                        Saturday=day7=6


                        3.WHERE EVER "ENTER DAY" IS REQUIRED PLS DO THE NEEDFUL AND ENTER THE DAY COUNTER(0,1,2...6)
                         */

    fun alarm(){
        val i =4 /*ENTER DAY here*/
        val t =6 /*enter time here*/
        if(i in 1..5 && t==6)   /*here alarm goes from monday to friday*/
        {
        println("IT'S TIME TO GET UP")}

        else{
            println(null)
        }
    }
             fun makeCoffee(){
               val day1=`Coffee makiing`(type = "BLACK", numberOfSugarCubes = 2, sterngth = "strong")
                val day2=`Coffee makiing`(type = "With Milk", numberOfSugarCubes = 3, sterngth = "moderate")
                val day3=`Coffee makiing`("BLACK",2,"normal")
                val day4=`Coffee makiing`("With Milk",3,"normal")
                val day5=`Coffee makiing`("BLACK",2,"normal")
                val day6=`Coffee makiing`("With Milk",3,"strong")
                val day7=`Coffee makiing`("BLACK",2,"moderate")

                        val coffeeRoutine= mutableListOf(day1,day2,day3,day4,day5,day6,day7)


                       println(coffeeRoutine[0])   /*enter the DAY COUNTER*/



    }

                       fun heatWater(){
                            val day1=waterheating(35.5,"yes")
                            val day2=waterheating(35.5,"yes")
                            val day3=waterheating(35.5,"yes")
                            val day4=waterheating(35.5,"yes")
                            val day5=waterheating(35.5,"yes")
                            val day6=waterheating(35.5,"yes")
                            val day7=waterheating(35.5,"yes")



                            val bathingRoutine= mutableListOf(day1,day2,day3,day4,day5,day6,day7)

                          println(bathingRoutine[0]) /*ENTER THE DAY COUNTER*/



                        }
                                                fun bagPacking(){
                                                    val day1=backpacking("math","physics","chemistry")
                                                    val day2=backpacking("math","copmuter","chemistry")
                                                    val day3=backpacking("english","physics","chemistry")
                                                    val day4=backpacking("computer","physics","chemistry")
                                                    val day5=backpacking("math","physics","chemistry")
                                                    val day6=backpacking("math","physics","computer")
                                                    val day7=backpacking("math","physics","chemistry")

                                                    val backpacking= mutableListOf(day1,day2,day3,day4,day5,day6,day7)

                                                    println(backpacking[0])  /*ENTER THE DAY COUNTER*/







                                                }

                                                                fun cook (){
                                                                    val breakfast= listOf("idle","dhosa","paratha","milk and egg","bread butter")
                                                                    val lunch= listOf("chicken", "fish", "non veg", "roti &sabji","veg")
                                                                    println(breakfast.random())
                                                                    println(lunch.random())
                                                                }


                                                                                  fun ironTheCloth() {
                                                                                      val days1 = dress(
                                                                                              tShirt = true,
                                                                                              shirt = false,
                                                                                              jeans = true,
                                                                                              jeansColour = "blue",
                                                                                              shirtColour = "red"
                                                                                      )
                                                                                      val days2 = dress(false,true,true,"black","red")
                                                                                      val days3 = dress(true,false,true,"blue","red")
                                                                                      val days4 = dress(false,true,true,"black","yellow")
                                                                                      val days5 = dress(true,false,true,"blue","yellow")
                                                                                      val days6 = dress(false,true,true,"black","green")
                                                                                      val days7 = dress(true,false,true,"blue","greeen")

                                                                                      val dressForToday = mutableListOf(days1, days2, days3, days4, days5, days6, days7)
                                                                                      println(dressForToday[0]) /*ENTER THE DAY COUNTER*/
                                                                                  }

}



    fun main(){
        val robot1=ROBOT()
        robot1.alarm()
        robot1.makeCoffee()
        robot1.heatWater()
        robot1.bagPacking()
        robot1.cook()
        robot1.ironTheCloth()





    }
