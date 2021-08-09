
import javax.swing.JLabel;

public class Cenario extends JLabel implements Runnable {

    private Thread thread;
    private int largTela, altuTela;

    public Cenario(int w, int h) {
        this.largTela = w;
        this.altuTela = h;
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cenario.png")));
        this.setLocation(0, 0);
        this.setBounds(0, 0, w, h);
        this.thread = new Thread(this);
        this.thread.start();
    }

    public void setTamanhoTela(int w, int h) {
        this.largTela = w;
        this.altuTela = h;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
