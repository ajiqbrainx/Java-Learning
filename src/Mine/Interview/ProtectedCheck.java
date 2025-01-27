package Mine.Interview;

 class ProtectedCheck {
    protected void check(){
        System.out.println("It is checking Write");
    }

     public static void main(String[] args) {
         ProtectedCheck protectedCheck=new ProtectedCheck();
         protectedCheck.check();
     }
}
