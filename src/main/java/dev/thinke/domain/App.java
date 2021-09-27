package dev.thinke.domain;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        for (String item : new Bubble<String>().sort(args)) {
            System.out.println(item);
        }
    }
}
