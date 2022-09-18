  
case class Point(x:Int,y:Int){
    def px=x
    def py=y
    def +(that:Point):Point={
        Point(that.px+this.px,that.py+this.py)
    }
    def move(dx:Int=0,dy:Int=0):Point={
        Point(dx+this.px,dy+this.py)
    }
    def dist(that:Point):Float={
        val difx=that.x-this.x
        val dify=that.y-this.y
        def sqaure(x:Float):Float=x*x 
        val c:Float=(sqaure(difx)+ sqaure(dify))
        java.lang.Math.sqrt(c)
    }
    def invert(){
        Point(this.y,this.x)
    }
}




object eighttute extends App{
    val c=Point(1,2)+Point(2,3)
    println(c) 
    val d=Point(0,0)
    println(d move(1,9))

 
}


