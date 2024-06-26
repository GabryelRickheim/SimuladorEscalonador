/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package escalonador;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

class txtFilter extends javax.swing.filechooser.FileFilter {
    @Override
    public boolean accept(File file) {
        return file.isDirectory() || file.getAbsolutePath().endsWith(".txt");
    }
    @Override
    public String getDescription() {
        return "Arquivos de Texto (*.txt)";
    }
}

/**
 *
 * @author Gabryel
 */
public class Escalonador extends javax.swing.JFrame {
    
    private File file;
    private ArrayList<Tarefa> tarefas;
    private ArrayList<Tarefa> tarefasFinalizadas;
    private boolean isDone = false;
    private boolean isLoaded = false;
    private Long timeStarted;

    /**
     * Creates new form Escalonador
     */
    public Escalonador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        executar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fila = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        currentProcess = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        timeCounter = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        quantumCounter = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        timeRemaining = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        finishedProcesses = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        open = new javax.swing.JMenuItem();

        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setCurrentDirectory(new java.io.File("C:\\Users\\Gabryel\\Desktop"));
        fileChooser.setFileFilter(new txtFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escalonador");

        executar.setText("Executar");
        executar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executarActionPerformed(evt);
            }
        });

        jLabel1.setText("Arquivo selecionado atualmente:");

        jLabel2.setText("{nenhum}");
        jLabel2.setAutoscrolls(true);

        fila.setEditable(false);
        fila.setColumns(20);
        fila.setRows(5);
        jScrollPane1.setViewportView(fila);

        jLabel3.setText("Processo sendo executado:");

        currentProcess.setEditable(false);
        currentProcess.setColumns(20);
        currentProcess.setRows(1);
        jScrollPane2.setViewportView(currentProcess);

        jLabel4.setText("Fila de Processos:");

        jLabel5.setText("Tempo de Execução:");

        timeCounter.setText("00:00");

        jLabel6.setText("Quantum:");

        quantumCounter.setText("{nenhum}");

        jLabel7.setText("Tempo Restante:");

        timeRemaining.setText("{nenhum}");

        jLabel8.setText("Processos Finalizados:");

        finishedProcesses.setEditable(false);
        finishedProcesses.setColumns(20);
        finishedProcesses.setRows(5);
        jScrollPane3.setViewportView(finishedProcesses);

        jMenu1.setText("Arquivo");

        open.setText("Selecionar arquivo .txt");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        jMenu1.add(open);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(executar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timeCounter))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantumCounter)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timeRemaining))
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(timeCounter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(quantumCounter)
                    .addComponent(jLabel7)
                    .addComponent(timeRemaining))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(executar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void executarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executarActionPerformed
        
        tarefasFinalizadas = new ArrayList<>();
        isDone = false;
        isLoaded = false;
        tarefas = new ArrayList<>();

        //get current time
        timeStarted = System.currentTimeMillis();
        executar.setEnabled(false);
        try {
			carregarNaMemoria(5000);
            executarTarefas();
            countTime();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        

    }//GEN-LAST:event_executarActionPerformed

    private void countTime() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                while (!isDone) {
                    try {
                        Thread.sleep(1000);
                        Long timeElapsed = System.currentTimeMillis() - timeStarted;
                        timeCounter.setText(String.format("%02d:%02d", timeElapsed/1000/60, timeElapsed/1000%60));
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Escalonador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                Thread.currentThread().interrupt();
            }
        };

        thread.start();
    }

    private void executarTarefas() throws InterruptedException {
        
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    while (!isDone) {
                        if (isLoaded) {
                            executarTarefa();
                        } else {
                            Thread.sleep(1);
                        }
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Escalonador.class.getName()).log(Level.SEVERE, null, ex);
                }
                executar.setEnabled(true);
                exibirTarefas();
                //save finished processes content to text file
                try {
                    java.io.FileWriter writer = new java.io.FileWriter("processosFinalizados.txt");
                    writer.write(finishedProcesses.getText() + "\n\nTempo decorrido: " + timeCounter.getText());
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Erro ao salvar arquivo");
                }
                Thread.currentThread().interrupt();
            }
        };

        thread.start();
    }

    private void executarTarefa() throws InterruptedException {

        int quantum = 5000;
        exibirTarefas();
        Tarefa tarefa = tarefas.get(0);
        while (quantum > 0) {
            if (tarefa.getCurrentPosition() == tarefa.getChars().length()) {
                    if (!tarefasFinalizadas.contains(tarefa)) {
                        tarefasFinalizadas.add(tarefa);
                    }
                    break;
            }
            quantumCounter.setText(String.valueOf(quantum));
            switch(tarefa.getCurrentChar()) {
                case 'A':
                    timeRemaining.setText(String.valueOf(1000 - tarefa.getTimeElapsed()));
                    if (tarefa.getTimeElapsed() >= 1000) {
                        tarefa.setCurrentPosition(tarefa.getCurrentPosition() + 1);
                        tarefa.setTimeElapsed(0);
                        exibirTarefas();
                    }
                    break;
                case 'B':
                    timeRemaining.setText(String.valueOf(2000 - tarefa.getTimeElapsed()));
                    if (tarefa.getTimeElapsed() >= 2000) {
                        tarefa.setCurrentPosition(tarefa.getCurrentPosition() + 1);
                        tarefa.setTimeElapsed(0);
                        exibirTarefas();
                    }
                    break;
                case 'C':
                    timeRemaining.setText(String.valueOf(3000 - tarefa.getTimeElapsed()));
                    if (tarefa.getTimeElapsed() >= 3000) {
                        tarefa.setCurrentPosition(tarefa.getCurrentPosition() + 1);
                        tarefa.setTimeElapsed(0);
                        exibirTarefas();
                    }
                    break; 
                case 'D':
                    timeRemaining.setText(String.valueOf(4000 - tarefa.getTimeElapsed()));
                    if (tarefa.getTimeElapsed() >= 4000) {
                        tarefa.setCurrentPosition(tarefa.getCurrentPosition() + 1);
                        tarefa.setTimeElapsed(0);
                        exibirTarefas();
                    }
                    break;
                default:
                    System.out.println("ERROR");
                    break;
                }
                //switch to set timeremaining
                if(!(tarefa.getCurrentPosition() == tarefa.getChars().length())) {
                    switch(tarefa.getCurrentChar()) {
                        case 'A':
                            timeRemaining.setText(String.valueOf(1000 - tarefa.getTimeElapsed()));
                            break;
                        case 'B':
                            timeRemaining.setText(String.valueOf(2000 - tarefa.getTimeElapsed()));
                            break;
                        case 'C':
                            timeRemaining.setText(String.valueOf(3000 - tarefa.getTimeElapsed()));
                            break; 
                        case 'D':
                            timeRemaining.setText(String.valueOf(4000 - tarefa.getTimeElapsed()));
                            break;
                        default:
                            System.out.println("ERROR");
                            break;
                }
                }
                Thread.sleep(500);
                tarefa.setTimeElapsed(tarefa.getTimeElapsed() + 500);
                quantum -= 500;
        }
        tarefas.remove(0);
        tarefas.add(tarefa);
        if (tarefasFinalizadas.size() == tarefas.size()) {
            isDone = true;
        }

    }

    private void carregarNaMemoria(int wait) throws InterruptedException {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    tarefas = new ArrayList<>();
                    int count = 1;
                    for (String line : java.nio.file.Files.readAllLines(file.toPath())) {
                        String oldText = fila.getText();
                        fila.append("Carregando tarefa: " + line);
                        Thread.sleep(wait/10);
                        fila.append(".");
                        Thread.sleep(wait/10);
                        fila.append(".");
                        Thread.sleep(wait/10);
                        fila.append(".");
                        Thread.sleep(wait/10);
                        fila.append(".");
                        Thread.sleep(wait/10);
                        fila.append(".");
                        Thread.sleep(wait/10);
                        fila.append(".");
                        Thread.sleep(wait/10);
                        fila.append(".");
                        Thread.sleep(wait/10);
                        fila.append(".");
                        Thread.sleep(wait/10);
                        fila.append(".");
                        Thread.sleep(wait/10);
                        fila.append(".");
                        fila.setText(oldText + count + " - " + line + " <-- Pronta\n");
                        tarefas.add(new Tarefa(line, count));
                        count++;
                    }
                } catch (IOException e) {
                    System.out.println("Erro ao ler arquivo");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Escalonador.class.getName()).log(Level.SEVERE, null, ex);
                }
                isLoaded = true;
                Thread.currentThread().interrupt();
            }
        };

        thread.start();
    }

    public void exibirTarefas() {
        fila.setText("");
        currentProcess.setText("");
        finishedProcesses.setText("");
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getCurrentPosition() == tarefa.getChars().length()) {
                
            } else if (tarefa == tarefas.get(0)) {
                currentProcess.append(tarefa.getPid() + " - " + tarefa.getChars());
                currentProcess.append(" <-- Executando caractere ");
                currentProcess.append(String.valueOf(tarefa.getCurrentChar()));
                currentProcess.append(" na posição ");
                currentProcess.append(String.valueOf(tarefa.getCurrentPosition()));
            } else {
                fila.append(tarefa.getPid() + " - " + tarefa.getChars());
                fila.append(" <-- Pronta");
                fila.append("\n");
            }
            
        }
        for (Tarefa tarefa : tarefasFinalizadas) {
            finishedProcesses.append(tarefa.getPid() + " - " + tarefa.getChars());
            finishedProcesses.append("\n");
        }
    }

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            jLabel2.setText(file.getAbsolutePath());
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_openActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Escalonador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escalonador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escalonador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escalonador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escalonador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea currentProcess;
    private javax.swing.JButton executar;
    private javax.swing.JTextArea fila;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JTextArea finishedProcesses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuItem open;
    private javax.swing.JLabel quantumCounter;
    private javax.swing.JLabel timeCounter;
    private javax.swing.JLabel timeRemaining;
    // End of variables declaration//GEN-END:variables
}
