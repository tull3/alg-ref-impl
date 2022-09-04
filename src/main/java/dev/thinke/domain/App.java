package dev.thinke.domain;

import dev.thinke.domain.sort.alg.shell.Shell;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        new Shell<String>().sort(Arrays.asList(args));
        for (String item : args) {
            System.out.println(item);
        }
//        Set<Short> s = new HashSet<>();
//        for (short i = 0; i < 100; i++) {
//            s.add(i);
//            s.remove(i - 1);
//        }
//        System.out.println(s.size());
    }
}
