package demo;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

/**
 * Demo MIDlet creates, runs and displays DemoGameCanvas.
 *
 * @author  Karel Herink
 * @version 1.0
 */
public class GameMidlet extends MIDlet {

    private DemoGameCanvas gameCanvas;
    private Thread t;
    private Display d;

    public void startApp() {
        this.gameCanvas = new DemoGameCanvas();
        this.t = new Thread(gameCanvas);
        t.start();
        d = Display.getDisplay(this);
        d.setCurrent(gameCanvas);
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
        this.gameCanvas.stop();
    }
}