object caeser_cipher extends App{

    val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  
    def ciph(c:Char,key:Int,a:String):Char={
        a((a.indexOf(c.toUpper)+key)%a.size)
    }
  
    def deciph(c:Char,key:Int,a:String):Char={
        val shiftval=(a.indexOf(c.toUpper)-key)%a.size
        if(shiftval<0){
          a(a.size+(shiftval))
        }
        else{
          a(shiftval)
        }
    }
   
    val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))
    val result=cipher(ciph,"ABCDEFGHIJKLMNOPQRSTUVWXYZ",2,alphabet)
    println(result)
    println(cipher(deciph,result,2,alphabet))

}