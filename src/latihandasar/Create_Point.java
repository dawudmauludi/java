/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihandasar;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import java.util.logging.Level;
import sun.awt.DisplayChangedListener;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author RPL
 */
public class Create_Point {
    public void render() {
    glClear(GL_COLOR_BUFFER_BIT);
    glLoadIdentity();
    glColor3f(0.0f, 1.0f, 0.0f);
    glPointSize(10);
    glBegin(GL_POINTS);
    glVertex2f(100,100);
    glVertex2f(200,100);
    glVertex2f(200,300);
    glVertex2f(100,300);
    glVertex2f(150,375);
    glVertex2f(375,375);
    glVertex2f(425,300);
    glVertex2f(425,100);
    glEnd();
  
    
    }
    
    public static void main(String[] args) {
        Create_Point main = null;
        
        try{
            System.out.println("Keys:");
            System.out.println("esc    - Exit");
            main = new Create_Point();
            main.create();
            main.run();
        } catch (Exception ex) {
         LOGGER.log(Level.SEVERE, ex.toString(), ex);
        
        }finally {
        if (main != null) {
        main.destroy();
        }
        }
            
            
    }

    private void create() throws LWJGLExeption{
        DisplayChangedListener.setDisplayMode(new DisplayMode(DISPLAY_WIDTH,DISPLAY_HEIGHT));
        Display.setFullscreen(false);
        Display.setTitle("Create Point");
//        Keyboard
            Keyboard.create();
//            Mouse

            Mouse.setGrabbed(false);
            Mouse.create();
//            openGL
            initGL();
            resizeGL();
            
                    
                   
    }
    
    private void run() {
    while (!Display.isCloseRequested() && !Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)){
    if (Display.isVisible()){
        render();
    }else{
    if (Display.isDirty()){
        render();
    }
    try{
    Thread.sleep(100);
    }catch (InterruptedException ex){
    
    }
    }
    
    }
    
    }
        
}
