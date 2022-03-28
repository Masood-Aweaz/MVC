//View Class

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//using swing
public class view implements ActionListener{
    public static JLabel userLabel;
    static JTextField userText;
    static JLabel passwordLabel;
    static JPasswordField passwordText;
    static JLabel secretLabel;
    static JPasswordField secretText;
    static JButton button;
    static JLabel success;

    view(){}
    
    JFrame setview(){
        JFrame frame = new JFrame("PES1UG19CS274");
        JPanel panel = new JPanel();
        frame.setSize(350,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
       
        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        secretLabel = new JLabel("Secret Key");
        secretLabel.setBounds(10,90,80,25);
        panel.add(secretLabel);

        secretText = new JPasswordField();
        secretText.setBounds(100,90,165,25);
        panel.add(secretText);

        button = new JButton("Login");
        button.setBounds(10,130,80,25);
        button.addActionListener(new view());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10,160,300,25);
        panel.add(success);

        //frame.setVisible(true);
        //this.add(frame);
        return frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        //System.out.println("Button clicked");
        String user = userText.getText();
        String password = passwordText.getText();
        String secret = secretText.getText();
        //System.out.println(user+","+password);
        controller control = new controller();
        int res = control.setcontroller(user, password, secret);
        if(res==1){
            success.setText("Login successful!");
        }
        else{
            success.setText("Login Failed!! Please enter the correct credentials.");
        }
    }



    
}