public class DBConnect {
    private String dBName;
    private String dBPassword;
    public DBConnect(){
    }
    public DBConnect(String dBName,String dBPassword){
        this.dBName = dBName;
        this.dBPassword = dBPassword;
    }
    public String getdBName(){
        return dBName;
    }
    public String getdBPassword(){
        return dBPassword;
    }
    public void setdBName(String dBName){
        this.dBName = dBName;
    }
    public void setdBPassword(String dBPassword){
        this.dBPassword = dBPassword;
    }
}
