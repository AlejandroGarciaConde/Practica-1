package practical_competencias;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Practical_Competencias extends JFrame {
        
        private JButton bRun,bPausa,bDetener;
        private JLabel etiHilo1,etiHilo2;
        private JTextArea areaHilo1, areaHilo2;
        private JScrollPane jspHilo1, jspHilo2;
        
    public Practical_Competencias(){
    
        setSize(400,400);
        setTitle("Condiciones de competencia");
        MisComponentes();
    }
    private void MisComponentes(){
        bRun=new JButton("Run");
        bPausa = new JButton ("Pausa");
        bDetener = new JButton("Detener");
        etiHilo1 = new JLabel ("Hilo 1");
        etiHilo2 = new JLabel ("Hilo 2");
        areaHilo1 = new JTextArea();
        areaHilo1.setEditable(false);
        areaHilo2 = new JTextArea();
        areaHilo2.setEditable(false);
        jspHilo1 = new JScrollPane(areaHilo1);
        jspHilo2 = new JScrollPane(areaHilo2);
        
        setLayout(null);
        bRun.setBounds(10,100,100,25);
        bPausa.setBounds(10,150,100,25);
        bDetener.setBounds(10,200,100,25);
        etiHilo1.setBounds(150,10,100,25);
        etiHilo2.setBounds(250,10,100,25);
        jspHilo1.setBounds(150,50,100,300);
        jspHilo2.setBounds(250,50,100,300);
        
        add(bRun);
        add(bPausa);
        add(bDetener);
        add(etiHilo1);
        add(etiHilo2);
        add(jspHilo1);
        add(jspHilo2);
        
        bRun.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Hilo1 t1 = new Hilo1(areaHilo1);
                Hilo2 t2 = new Hilo2(areaHilo2);
                t1.start();
                t2.start();
            }
        });
        
        bPausa.addActionListener(new ActionListener(){
            public void actionPermormed(ActionEvent e) throws InterruptedException{
                Hilo1 t1 = new Hilo1(areaHilo1);
                Hilo2 t2 = new Hilo2(areaHilo2);
                if(t1.isInterrupted())
            try{
                t1.resume();
            }catch(Exception a){}
        else           

                t1.interrupt();
                t2.interrupt();
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
         
        bDetener.addActionListener(new ActionListener(){
            public void actionPermormed(ActionEvent e) {
              Hilo1 t1 = new Hilo1(areaHilo1);
              Hilo2 t2 = new Hilo2(areaHilo2);
              t1.stop();
              t2.stop();
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
    }
   
    public static void main(String[] args) {
        Practical_Competencias fr = new Practical_Competencias();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
