package helloworld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        byte b1 = (byte) 11000001;
        byte b2 = (byte) 10000001;

       char a =  (char) (((b1 << 6) ^ b2)^
                (   ((byte) 0xC0 << 6) ^
                        ((byte) 0x80 << 0)   )   );

        System.out.println(  (   ((byte) 0xC0 << 6)   ));
        System.out.println(  ((byte) 0xC0 << 6) ^
                ((byte) 0x80 << 0)  );



        System.out.println(a);

        System.out.println((byte)11 ^ (byte)11);

    }
}
