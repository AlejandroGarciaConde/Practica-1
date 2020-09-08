package practical_competencias;
import javax.swing.JTextArea;
public class Hilo1 extends Thread {
    private JTextArea area;
    Hilo1(JTextArea area){
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
