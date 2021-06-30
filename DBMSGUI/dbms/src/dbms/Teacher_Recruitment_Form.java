package dbms;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import com.toedter.calendar.JDateChooser;


/**
 *
 * @author ASUS
 */
public class Teacher_Recruitment_Form extends javax.swing.JFrame {

    /**
     * Creates new form Teacher_Recruitment_Form
     */
    public Teacher_Recruitment_Form(){
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    Connection connect = null;
    Statement stmt = null;
    ResultSet rs;
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Teacher Recruitment Form (School Management System)");
        setAlwaysOnTop(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Teacher Recruitment Form");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Father  Name");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Mother Name");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("D.O.B");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("Teacher ID");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("Contact No.");

        

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Fetch");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        JButton btnNewButton = new JButton("Submit");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
        			Class.forName("com.mysql.cj.jdbc.Driver");
                    connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","anuj3107");
                    stmt=connect.createStatement();
                    String sql="insert into teacher values(?,?,?,?,?,?,?,?,?)";
                    String sql1="insert into salary(T_ID) values(?);";
                    PreparedStatement pst1=connect.prepareStatement(sql1);
                    pst1.setString(1,jTextField5.getText());
                    PreparedStatement pst=connect.prepareStatement(sql);
                    pst.setString(2,jTextField2.getText());
                    pst.setString(3,textField.getText());
                    pst.setString(4,textField_1.getText());
                    pst.setString(6,jTextField3.getText());
                    pst.setString(7,jTextField4.getText());
                    Date date =jDateChooser1.getDate();  
                    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
                    String strDate = formatter.format(date);
                    pst.setString(5,strDate);
                    pst.setString(1,jTextField5.getText());
                    pst.setString(8,jTextField1.getText());
                    pst.setString(9,textField_2.getText());
                    pst.executeUpdate();
                    pst1.executeUpdate();
                    JOptionPane.showMessageDialog(Teacher_Recruitment_Form.this, "Registered Successfully");
                    jTextField2.setText("");
                    textField.setText("");
                    textField_1.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                    jTextField5.setText("");
                    jTextField1.setText("");
                    textField_2.setText("");
                    jDateChooser1.setDate(null);
        		}
        		catch(SQLException e1)
        		{
        			
        		}
        		catch(ClassNotFoundException e2)
        		{
        			
        		}
        	}
        });
       
        btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
        
        textField = new JTextField();
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        
        JLabel lblAddress = new JLabel();
        lblAddress.setText("Address");
        lblAddress.setFont(new Font("Arial", Font.BOLD, 18));
        
        textField_2 = new JTextField();
        
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser1.getCalendarButton().addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(65)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        							.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
        							.addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
        							.addComponent(jLabel12, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        							.addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        						.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
        					.addGap(36)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.LEADING)
        										.addGroup(layout.createSequentialGroup()
        											.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        											.addGap(18)
        											.addComponent(textField, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
        										.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
        										.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
        									.addGap(28)
        									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
        								.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        										.addComponent(jDateChooser1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(jTextField5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
        									.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
        									.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
        									.addGap(157)))
        							.addPreferredGap(ComponentPlacement.RELATED, 133, Short.MAX_VALUE))
        						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap(394, Short.MAX_VALUE)
        					.addComponent(jLabel1)))
        			.addGap(116))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(27)
        			.addComponent(jLabel1)
        			.addGap(50)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        				.addComponent(textField, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        				.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jDateChooser1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
        			.addGap(26)
        			.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(115, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    	try {
    	    Class.forName("com.mysql.cj.jdbc.Driver");        		    
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","anuj3107");
    		String sql="select count(*) as c2 from teacher;";
    		stmt=connect.createStatement();
    		rs=stmt.executeQuery(sql);
    		if(rs.next()){
    	    int ID = rs.getInt("c2");
    	    ID++;
    	    String ros=Integer.toString(ID);
    	    ros='T'+ros;
    	    jTextField5.setText(ros);
    		}
    		}
    		catch(SQLException e1){
    			
    		} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    	
    	
    	// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(Teacher_Recruitment_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher_Recruitment_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher_Recruitment_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher_Recruitment_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher_Recruitment_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
}