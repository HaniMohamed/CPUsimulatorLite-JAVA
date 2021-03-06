/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proga.CPUsimLite;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hani
 */
public class ProgramRun extends javax.swing.JFrame {

    String IR_Binary = null;
    boolean finish = false;

    List<String> code = new ArrayList<>();

    CPURegisters cpu = new CPURegisters();
    MainMemory ram = new MainMemory();
    GPRegisters reg = new GPRegisters();
    Stack stack = new Stack();
    int i = 0;

    DefaultListModel listModel = new DefaultListModel();

    /**
     * Creates new form Run
     */
    public ProgramRun() {
        initComponents();
    }

    public ProgramRun(List<String> code) {
        this.code = code;
        initComponents();

        next.setVisible(false);
        fetch.setVisible(false);
        execute.setVisible(false);
        end.setVisible(false);

        setTitle("Running Program");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        cpu.setTitle("CPU Registers");
        cpu.setResizable(false);
        cpu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cpu.setLocationByPlatform(true);
        cpu.setLocation(960, 160);
        cpu.setVisible(true);
        cpu.setSP(Integer.toHexString(20));

        reg.setTitle("General Purpose Registers");
        reg.setResizable(false);
        reg.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        reg.setLocationByPlatform(true);
        reg.setLocation(20, 450);
        reg.setVisible(true);

        stack.setTitle("Stack Memory");
        stack.setResizable(false);
        stack.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        stack.setLocationByPlatform(true);
        stack.setLocation(960, 390);
        stack.setVisible(true);

        ram.setTitle("Main Memory");
        ram.setResizable(false);
        ram.setLocationByPlatform(true);
        ram.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ram.setVisible(true);
        ram.setLocation(20, 100);
        ram.insertCode(code);

        start.requestFocus();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        next = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        start = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fetch = new javax.swing.JButton();
        execute = new javax.swing.JButton();
        end = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setAutoscrolls(true);

        jList1.setBackground(java.awt.SystemColor.window);
        jScrollPane1.setViewportView(jList1);

        next.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        next.setText(">");
        next.setEnabled(false);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        start.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        start.setText("start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Running The Program");

        fetch.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        fetch.setText("fetch");
        fetch.setEnabled(false);
        fetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetchActionPerformed(evt);
            }
        });

        execute.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        execute.setText("Execute");
        execute.setEnabled(false);
        execute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeActionPerformed(evt);
            }
        });

        end.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        end.setText(">>>");
        end.setEnabled(false);
        end.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fetch, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(execute, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(end, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(start, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(fetch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(execute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(end, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:

        listModel.addElement(code.get((int) Long.parseLong(cpu.getPC(), 16)));
        jList1.setModel(listModel);
        jList1.ensureIndexIsVisible(jList1.getModel().getSize() - 1);

        fetch.setEnabled(true);
        fetch.requestFocus();
        next.setEnabled(false);


    }//GEN-LAST:event_nextActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        // TODO add your handling code here:
        listModel.addElement(code.get((int) Long.parseLong(cpu.getPC(), 16)));
        jList1.setModel(listModel);
        jList1.ensureIndexIsVisible(jList1.getModel().getSize() - 1);

        start.setEnabled(false);
        end.setVisible(true);
        end.setEnabled(true);
        next.setVisible(true);
        fetch.setVisible(true);
        execute.setVisible(true);
        fetch.setEnabled(true);
        fetch.requestFocus();

    }//GEN-LAST:event_startActionPerformed

    private void fetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetchActionPerformed
        // TODO add your handling code here:
        fetch();

        fetch.setEnabled(false);
        end.setEnabled(false);
        execute.setEnabled(true);
        execute.requestFocus();
    }//GEN-LAST:event_fetchActionPerformed

    private void executeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeActionPerformed
        // TODO add your handling code here:
        next.setEnabled(true);
        end.setEnabled(true);
        next.requestFocus();
        execute.setEnabled(false);

        execute();

    }//GEN-LAST:event_executeActionPerformed

    private void endActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endActionPerformed
        // TODO add your handling code here:
        while (!finish) {

            fetch();
            execute();
            if (!finish) {
                listModel.addElement(code.get((int) Long.parseLong(cpu.getPC(), 16)));
                jList1.setModel(listModel);
                jList1.ensureIndexIsVisible(jList1.getModel().getSize() - 1);
            }

        }
    }//GEN-LAST:event_endActionPerformed

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
            java.util.logging.Logger.getLogger(ProgramRun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramRun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramRun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramRun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramRun().setVisible(true);
            }
        });
    }

    public void fetch() {
        cpu.setMAR(cpu.getPC());
        cpu.setMBR(ram.getContent(cpu.getPC()));
        cpu.setIR(cpu.getMBR());

        IR_Binary = "0" + Integer.toBinaryString((int) Long.parseLong(cpu.getMBR(), 16));

        cpu.setPC(Integer.toHexString((int) Long.parseLong(cpu.getPC(), 16) + 1));
    }

    public void execute() {
        String inst = null;
        String OPCODE = "";
        if (IR_Binary.length() >= 26) {
            if (IR_Binary.length() > 26) {
                IR_Binary = IR_Binary.substring(1, IR_Binary.length());
            }
            OPCODE = Integer.toHexString((int) Long.parseLong(IR_Binary.substring(0, 6), 2));
        } else if (IR_Binary.length() > 8 && IR_Binary.length() < 26) {
            if (IR_Binary.length() > 16) {
                IR_Binary = IR_Binary.substring(1, IR_Binary.length());

            }
            OPCODE = Integer.toHexString((int) Long.parseLong(IR_Binary.substring(0, 6), 2));
        } else if (IR_Binary.length() < 16) {
            if (IR_Binary.length() > 8) {
                IR_Binary = IR_Binary.substring(1, IR_Binary.length());

            }
            OPCODE = Integer.toHexString((int) Long.parseLong(IR_Binary, 2));
        }

        inst = Integer.toString((int) Long.parseLong(OPCODE, 16)).replace("57", "SUB").replace("62", "DEC")
                .replace("56", "INC").replace("45", "MOV").replace("68", "END")
                .replace("33", "INP").replace("48", "OUT").replace("28", "BNZ").replace("41", "SKZ")
                .replace("67", "NEGATE").replace("58", "ADD").replace("115", "MULTIPLY")
                .replace("23", "PUSH").replace("24", "POP").replace("29", "SKIP").replace("30", "SKIPZ");

        switch (inst) {
            //two operands instructions
            case "SUB": {
                int result = (int) Long.parseLong(fetchOperand(IR_Binary.substring(6, 16)), 16) - (int) Long.parseLong(fetchOperand(IR_Binary.substring(16, IR_Binary.length())), 16);
                cpu.setAC(Integer.toHexString(result));
                if (IR_Binary.substring(6, 8).equals("10")) {
                    reg.setReg((int) Long.parseLong(IR_Binary.substring(8, 16), 2), cpu.getAC());
                } else {
                    ram.insertContent(getDestination(IR_Binary.substring(6, 16)), cpu.getAC());
                }
                break;
            }
            case "MOV": {
                int result = (int) Long.parseLong(fetchOperand(IR_Binary.substring(16, IR_Binary.length())), 16);
                cpu.setAC(Integer.toHexString(result));
                if (IR_Binary.substring(6, 8).equals("10")) {
                    reg.setReg((int) Long.parseLong(IR_Binary.substring(8, 16), 2), cpu.getAC());
                } else {
                    ram.insertContent(getDestination(IR_Binary.substring(6, 16)), cpu.getAC());
                }
                break;
            }
            case "BNZ":
                if (!(((int) Long.parseLong(fetchOperand(IR_Binary.substring(16, IR_Binary.length())), 16)) == 0)) {

                    cpu.setPC(fetchOperand(IR_Binary.substring(6, 16)));
                }
                break;
            //one operands instructions
            case "SKZ": {
                if (((int) Long.parseLong(fetchOperand(IR_Binary.substring(6, IR_Binary.length())), 16)) == 0) {

                    cpu.setPC(Integer.toHexString((int) Long.parseLong(cpu.getPC(), 16) + 1));
                }
                break;
            }
            case "DEC": {
                int result = (int) Long.parseLong(fetchOperand(IR_Binary.substring(6, IR_Binary.length())), 16) - 1;
                cpu.setAC(Integer.toHexString(result));
                if (IR_Binary.substring(6, 8).equals("10")) {
                    reg.setReg((int) Long.parseLong(IR_Binary.substring(8, IR_Binary.length()), 2), cpu.getAC());
                } else {
                    ram.insertContent(getDestination(IR_Binary.substring(6, IR_Binary.length())), cpu.getAC());
                }
                break;
            }
            case "INC": {
                int result = (int) Long.parseLong(fetchOperand(IR_Binary.substring(6, IR_Binary.length())), 16) + 1;
                cpu.setAC(Integer.toHexString(result));
                if (IR_Binary.substring(6, 8).equals("10")) {
                    reg.setReg((int) Long.parseLong(IR_Binary.substring(8, IR_Binary.length()), 2), cpu.getAC());
                } else {
                    ram.insertContent(getDestination(IR_Binary.substring(6, IR_Binary.length())), cpu.getAC());
                }
                break;
            }
            case "INP":
                cpu.setAC(Integer.toHexString(Integer.parseInt(showInputDialog())));
                if (IR_Binary.substring(6, 8).equals("10")) {
                    reg.setReg((int) Long.parseLong(IR_Binary.substring(8, IR_Binary.length()), 2), cpu.getAC());
                } else {
                    ram.insertContent(getDestination(IR_Binary.substring(6, IR_Binary.length())), cpu.getAC());
                }
                break;
            case "OUT":
                cpu.setAC(fetchOperand(IR_Binary.substring(6, IR_Binary.length())));
                JOptionPane.showMessageDialog(null, "Output (Decimal):  " + (int) Long.parseLong(cpu.getAC(), 16));
                break;
            case "PUSH":
                stack.push(Integer.toString((int) Long.parseLong(fetchOperand(IR_Binary.substring(6, IR_Binary.length())), 16)));
                cpu.setSP(Integer.toHexString((int) Long.parseLong(stack.top(), 16) - 1));
                break;
            case "POP":
                if (IR_Binary.substring(6, 8).equals("10")) {
                    reg.setReg((int) Long.parseLong(IR_Binary.substring(8, IR_Binary.length()), 2), Integer.toHexString(Integer.parseInt(stack.pop())));
                } else {
                    ram.insertContent(getDestination(IR_Binary.substring(6, IR_Binary.length())), Integer.toHexString(Integer.parseInt(stack.pop())));
                }
                cpu.setSP(stack.top());
                break;
            case "SKIP": {
                int result = (int) Long.parseLong(fetchOperand(IR_Binary.substring(6, IR_Binary.length())), 16);
                cpu.setPC(Integer.toHexString((int) Long.parseLong(cpu.getPC(), 16) + result));
                break;
            }
            case "SKIPZ":
                if (Integer.parseInt(stack.pop()) == 0) {
                    int result = (int) Long.parseLong(fetchOperand(IR_Binary.substring(6, IR_Binary.length())), 16);
                    cpu.setPC(Integer.toHexString((int) Long.parseLong(cpu.getPC(), 16) + result));

                }
                cpu.setSP(Integer.toHexString((int) Long.parseLong(stack.top(), 16) - 1));
                break;
            //zero operand instructions                           
            case "MULTIPLY":
                cpu.setAC(Integer.toHexString(Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop())));
                stack.push(Integer.toString((int) Long.parseLong(cpu.getAC(), 16)));
                cpu.setSP(Integer.toHexString((int) Long.parseLong(stack.top(), 16) - 1));
                break;
            case "NEGATE":
                cpu.setAC(Integer.toHexString(Integer.parseInt(stack.pop()) * -1));
                stack.push(Integer.toString((int) Long.parseLong(cpu.getAC(), 16)));
                cpu.setSP(Integer.toHexString((int) Long.parseLong(stack.top(), 16) - 1));
                break;
            case "END":
                finish = true;
                next.setEnabled(false);
                fetch.setEnabled(false);
                execute.setEnabled(false);
                end.setEnabled(false);
                break;

            //two or zero operand
            case "ADD":

                if (IR_Binary.length() >= 26) { //two operands
                    int result = (int) Long.parseLong(fetchOperand(IR_Binary.substring(6, 16)), 16) + (int) Long.parseLong(fetchOperand(IR_Binary.substring(16, IR_Binary.length())), 16);
                    cpu.setAC(Integer.toHexString(result));
                    if (IR_Binary.substring(6, 8).equals("10")) {
                        reg.setReg((int) Long.parseLong(IR_Binary.substring(8, 16), 2), cpu.getAC());
                    } else {
                        ram.insertContent(getDestination(IR_Binary.substring(6, 16)), cpu.getAC());
                    }
                } else {//if (IR_Binary.length() > 8 && IR_Binary.length() < 26) { //zero operand

                    cpu.setAC(Integer.toHexString(Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop())));
                    stack.push(Integer.toString((int) Long.parseLong(cpu.getAC(), 16)));
                    cpu.setSP(Integer.toHexString((int) Long.parseLong(stack.top(), 16) - 1));
                }

                break;
            default:
                break;
        }

    }

    //return value of operand (hex) 
    public String fetchOperand(String opernandBinary) {
        String value = null;
        switch (opernandBinary.substring(0, 2)) {
            case "00":
                //Immediate  Addressing Mode
                value = Integer.toHexString((int) Long.parseLong(opernandBinary.substring(2, opernandBinary.length()), 2));
                break;
            case "01":
                //Memory Indirect
                value = ram.getContent(Integer.toHexString((int) Long.parseLong(opernandBinary.substring(2, opernandBinary.length()), 2)));
                break;
            case "10":
                //Register Addressing Mode
                value = Integer.toHexString((int) Long.parseLong(reg.getReg((int) Long.parseLong(opernandBinary.substring(2, opernandBinary.length()), 2)), 16));
                break;
            case "11":
                //Register Indirect
                String RegValue = Integer.toHexString((int) Long.parseLong(reg.getReg((int) Long.parseLong(opernandBinary.substring(2, opernandBinary.length()), 2)), 16));
                value = Integer.toHexString((int) Long.parseLong(ram.getContent(RegValue), 16));
                break;
            default:
                break;
        }

        return value;
    }

    public String getDestination(String opernandBinary) {
        String dest = null;

        switch (opernandBinary.substring(0, 2)) {
            case "00":
                //Immediate  Addressing Mode
                JOptionPane.showMessageDialog(null, "Error!  Destination operand can't be Immediate Addressing mode");
                break;
            case "01":
                //Memory Indirect
                dest = Integer.toHexString((int) Long.parseLong(opernandBinary.substring(2, opernandBinary.length()), 2));
                break;
            case "11":
                //Register Indirect
                dest = Integer.toHexString((int) Long.parseLong(reg.getReg((int) Long.parseLong(opernandBinary.substring(2, opernandBinary.length()), 2)), 16));
                break;
            default:
                break;
        }

        return dest;
    }

    private String showInputDialog() {
        String inputValue = JOptionPane.showInputDialog("Please input (int) number");

        if (inputValue == null || inputValue.isEmpty() || !inputValue.matches("[0-9]*")) {
            inputValue = showInputDialog();
        }

        return inputValue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton end;
    private javax.swing.JButton execute;
    private javax.swing.JButton exit;
    private javax.swing.JButton fetch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton next;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
