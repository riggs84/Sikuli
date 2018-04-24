import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import java.io.File;
import java.io.IOException;

public class main {

    public static void main(String args []){
         String pathToApp = "C:\\Program Files\\Siber Systems\\GoodSync\\GoodSync-v10.exe";
         Process process;

        File gs = new File(pathToApp);
        try {
            process = Runtime.getRuntime().exec(pathToApp);
        } catch (IOException e) {
            e.printStackTrace();
        }
        App app = new App("GoodSync Synchronizer");
        System.out.println(app.getName());
        app.focus("GoodSync Synchronizer");
        System.out.println(app.getName());


        Screen s = new Screen();
        try {
            s.click("src/img/btn.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        s.type("azaza");
        try {
            s.click("src/img/okBtn.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        try {
            s.click("src/img/jobNameAzaza.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        try {
            s.click("src/img/leftBrwsd.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        try {
            s.click("src/img/gstpFS.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        try {
            s.click("src/img/newAccount.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        if ((s.exists("src/img/newAcc.png")) != null){
            System.out.println("test is done");
        } else {
            System.out.print("test has failed");
        }

        app.close();

        /*Target target = new ImageTarget(new File("C:\\Excersises\\btn.png"));
        ScreenRegion sr = new DesktopScreenRegion();
        ScreenRegion btn = sr.find(target);
        System.out.print("done");
        //Mouse mouse = new DesktopMouse();
        //mouse.click(btn.getCenter()); */

    }
}
