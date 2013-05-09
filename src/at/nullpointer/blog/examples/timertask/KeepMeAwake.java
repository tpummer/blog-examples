/**
 * This is an example for my blog http://www.nullpointer.at/2011/01/02/timer-und-timertasks-aufgaben-planen-in-java
 * 
 * @author Thomas Pummer
 */
package at.nullpointer.blog.examples.timertask;

import java.util.Timer;
import java.util.TimerTask;

public class KeepMeAwake {

    /**
     * Schedules an annoying beep every 5 seconds to keep us awake
     * 
     * @param args
     */
    public static void main( String[] args ) {

        TimerTask action = new TimerTask() {

            public void run() {

                Beep b = Beep.getInstance();
                b.beep();
            }

        };

        Timer caretaker = new Timer();
        caretaker.schedule( action, 1000, 5000 );

    }
}
