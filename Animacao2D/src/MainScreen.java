

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainScreen extends JFrame implements Runnable {
    Carro carro;
    Cenario cenario;

    public MainScreen() {
        initComponents();
        carro = new Carro(painelAnimacao.getWidth(), painelAnimacao.getHeight());
        cenario = new Cenario(painelAnimacao.getWidth(), painelAnimacao.getHeight());
        painelAnimacao.add(carro);
        painelAnimacao.add(cenario);
        pack();
        new Thread(this).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelAnimacao = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelAnimacao.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout painelAnimacaoLayout = new javax.swing.GroupLayout(painelAnimacao);
        painelAnimacao.setLayout(painelAnimacaoLayout);
        painelAnimacaoLayout.setHorizontalGroup(
            painelAnimacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        painelAnimacaoLayout.setVerticalGroup(
            painelAnimacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(painelAnimacao, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel painelAnimacao;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

}
