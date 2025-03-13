package Blind75;

public class IpAddressDeFang {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        defangIp(address);
    }
   static void defangIp(String address){
    
    StringBuilder string = new StringBuilder(address);
        for(int i = 0; i< address.length(); i++){
            if(address.charAt(i) == '.'){
                string.append("[.]");
            }
            else{
                string.append(".");
            }
        }
        System.out.println(string.toString());
        
   }
}
