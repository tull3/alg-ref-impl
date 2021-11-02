package dev.thinke.domain;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        new Bubble<String>().sort(args);
        for (String item : args) {
            System.out.println(item);
        }
    }
}
