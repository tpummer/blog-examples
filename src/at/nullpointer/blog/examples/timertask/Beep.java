/**
 * This is an example for my blog http://www.nullpointer.at/2011/01/02/timer-und-timertasks-aufgaben-planen-in-java
 * 
 * @author Thomas Pummer
 */
package at.nullpointer.blog.examples.timertask;

import java.awt.Toolkit;

public class Beep {

    private static Beep singleton = null;
    private Toolkit defaultToolkit;


    public static Beep getInstance() {

        if ( singleton == null ) {
            singleton = new Beep();
        }
        return singleton;
    }


    private Beep() {

        this.defaultToolkit = Toolkit.getDefaultToolkit();
    }


    public void beep() {

        this.defaultToolkit.beep();
    }


    public static void main( String args[] ) {

        Beep b = Beep.getInstance();
        b.beep();
    }

}