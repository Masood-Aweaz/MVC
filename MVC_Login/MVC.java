//MVC Class

import javax.swing.*;
public class MVC {
    public static void main(String[] args){
        view theView = new view();
        model theModel = new model();
        //controller theController = new controller(theModel,theView);
        JFrame v = theView.setview();
        v.setVisible(true);
    }
}