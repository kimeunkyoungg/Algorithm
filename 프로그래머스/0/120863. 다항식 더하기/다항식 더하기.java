class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int xsum =0;
        int num =0;
        String [] arr = polynomial.split("\\s*\\+\\s*");
        for(String str : arr){
            if(str.contains("x")){
                String xnum = str.replace("x", "");
            
                xsum += xnum.isEmpty() ? 1 : Integer.parseInt(xnum);
            }
            else{
                num += Integer.parseInt(str);
            }
        }
        
         
        if (xsum == 0) 
            return String.valueOf(num);
        if (num == 0) 
            return (xsum == 1) ? "x" : xsum + "x";
        return (xsum == 1 ? "x" : xsum + "x") + " + " + num;

    }
}