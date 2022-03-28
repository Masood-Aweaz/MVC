//Model Class

public class model {
    private String userName;
    private String password;
    private String secretKey;
    String[] uname = new String[100];
    String[] pass = new String[100];
    String[] sec = new String[100];
    private int i =0;
    public void set(String userName,String password,String secretKey){
        this.userName = userName;
        this.password = password;
        this.secretKey = secretKey;
        this.i=this.i+1;
    }

    public String[] putuser(){
        uname[i] = this.userName;
        return uname;
    }

    public String[] putpass(){
        pass[i] = this.password;
        return pass;
    }

    public String[] putsec(){
        sec[i] = this.secretKey;
        return sec;
    }
}
