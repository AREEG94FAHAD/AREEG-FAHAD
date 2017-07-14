public enum Email {

    AREEG("areeg" ,"www.areeg@google.com")
    ,SARA("sara" ,"www.sara@,,.com")
    ,AHMED("ahmed" ,"www.ahmedyahoo.errwdfvccx") //this are invalid Email
    ,Muna("muna ","muna@icloud.com");

    private final String UserName;
    private final String Emailaddress;


    Email(String name,String emailaddress){
        this.UserName=name;
        this.Emailaddress=emailaddress;
    }

    public String getUserName() {
        return UserName;
    }

    public String getEmailaddress() {
        return Emailaddress;
    }
}


