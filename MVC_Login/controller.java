//Controller class

import javax.swing.JLabel;

class controller{
    //private model data = new model[100];
    String user;
    String password;
    String secret;
    model theModel;
    view theView;

    controller (){}
    /*controller(model theModel,view theView){
        this.theModel = theModel;
        this.theView = theView;
    }*/
    public int setcontroller(String user,String password,String secret){
        this.user = user;
        this.password = password;
        this.secret = secret;

        model temp = new model();
        temp.set(user,password,secret);
        String[] u = temp.putuser();
        String[] p = temp.putpass();
        String[] s = temp.putsec();
        

        /*if(user.equals("Masood") && password.equals("masood@123") && secret.equals("1234")){
            return 1;
        }
        else{
            return 0;
        }*/

        for(int i=0;i<100;i++){
            if(u[i]==user && p[i]==password && s[i]==secret){
                return 1;
            }
            else{
                return 0;
            }
        }
        return -1;
    }
}