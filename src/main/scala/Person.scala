class Person(val name: String, val age: Int) extends Ordered {
  def compare(person2: Person): Unit = {
    if(this.name.equals(person2.name)){
      if (this.age<person2.age){
        println("True")
      }
      else{
        println("False")
      }
    }
    else{
      if (this.name.length<person2.name.length) {
        println("True")
      }
      else
      {
        println("False")
      }
    }
  }
}
