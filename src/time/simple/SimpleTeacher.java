package time.simple;

public class SimpleTeacher {

      private static Teacher instance=null;

      private SimpleTeacher(){


      }

     static Teacher getInstance(){
          if (instance==null){
              instance =new Teacher();


          }
         return  instance;
     }
}
