import java.rmi.*;

public class ProductClient {
     public static void main( String args[] ) {

         //String url =  "rmi:///";
         try {
      String url= "rmi://192.168.23.118/";      // if object located remotely
         Product p = ( Product ) Naming.lookup( url + "toaster" );


                     String d = p.getDescription();
                     System.out.println( "Result: " + d );
                     System.in.read();
                } catch( Exception e ) {
         System.err.println( "Error " + e );}
    }
}