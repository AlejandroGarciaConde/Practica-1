package practical_competencias;
import javax.swing.JTextArea;
public class Hilo2 extends Thread {
    private JTextArea area;
    Hilo2(JTextArea area){
        this.area=area;
        
    }
    public void run(){
        long i = 0;
        while(true){
            area.append(i + "\n");
            i++;
        }
    }
    
}
