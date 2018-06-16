// can you remember how to set up your main function?
public class JavaBuzz{
  public static void main(String[] args){
    for(int i=1; i<101; i++) {
      if(i%15 == 0) {
        System.out.println("JavaBuzz");
      } else if(i%3 == 0) {
        System.out.println("Java");
      } else if(i%5 == 0) {
        System.out.println("Buzz");
      }else{
        System.out.println(i);
      }
    }
  }
}

// "Java" if divisible by 3
// "Buzz" if divisible by 5
// "JavaBuzz" if divisible by 15
