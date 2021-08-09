
import javax.swing.JLabel;

public class Carro extends JLabel implements Runnable {

    private Thread thread;
    private int velocidade;
    private RotatedIcon carro;
    private int largTela, altuTela;
    boolean finalizado;

    public Carro(int w, int h) {
        this.largTela = w;
        this.altuTela = h;
        this.velocidade = 1;
        this.carro = new RotatedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carro.png")), RotatedIcon.Rotate.ABOUT_CENTER);
        this.setIcon(carro);
        this.finalizado =false;
        this.setLocation(700, 550);
        this.setBounds(700, 500, 100, 100);
        this.thread = new Thread(this);
        this.thread.start();
    }

    public void setTamanhoTela(int w, int h) {
        this.largTela = w;
        this.altuTela = h;
    }

    public void move(String direcao) {
        switch (direcao) {
            case "cima":
                this.setLocation(this.getX(), this.getY() - 1);
                break;
            case "baixo":
                this.setLocation(this.getX(), this.getY() + 1);
                break;
            case "esquerda":
                this.setLocation(this.getX() - 1, this.getY());
                break;
            case "direita":
                this.setLocation(this.getX() + 1, this.getY());
                break;
        }
    }

    public void gira(String sentido) {
        switch (sentido) {
            case "horario":
                carro.setDegrees(carro.getDegrees() + 1);
                break;
            case "antihorario":
                carro.setDegrees(carro.getDegrees() - 1);
                break;
            case "cima":
                carro.setDegrees(0);
                break;
            case "baixo":
                carro.setDegrees(180);
                break;
            case "esquerda":
                carro.setDegrees(270);
                break;
            case "direita":
                carro.setDegrees(90);
                break;

        }
    }

    @Override
    public void run() {
        
        while (!finalizado) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //subida 1
            for (int i = 0; i < 650; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (i < 500) move("cima");

                if (i < 280 &&  i%5==0) move("direita");
                
                if (i == 500) gira("esquerda");
                
                if (i > 450 && i%3==0) move("esquerda");

                if (i > 500) move("esquerda");
            }
            gira("baixo");
            //descida 1
            for (int i = 0; i < 600; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (i < 400) move("baixo");
                
                if (i < 250 &&  i%4==0) move("direita");

                if (i == 400) gira("esquerda");
                
                if (i > 250 && i%5==0 && i < 350) move("esquerda");
                
                if (i > 400) move("esquerda");
                
            }
            gira("cima");
                   
            //subida 2
            for (int i = 0; i < 750; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (i < 60) move("cima");
                
                if (i == 60) gira("esquerda");
                
                if (i > 60 && i < 200) move("esquerda");
                
                if (i > 100 && i < 200 && i%5==0) move("cima");
                
                if (i == 200) gira("cima");
                
                if (i > 200 && i <530 ) move("cima");
                
                if (i > 400 && i%5==0 && i<450) move("esquerda");
                
                if (i == 530) gira("esquerda");
                
                if (i > 530) move("esquerda");
                
            }
            gira("baixo");
            //descida 2
            for (int i = 0; i < 700; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                if (i < 140) move("baixo");
                
                if (i == 140) gira("direita");
                
                if (i > 140 && i < 230) move("direita");
                
                if (i==230) gira("baixo");
                
                if (i>200 && i%5==0 && i<250) move("baixo");
                
                if (i>250) move("baixo");
                
                
            }
            
            finalizado = true;
        }
    }
}
