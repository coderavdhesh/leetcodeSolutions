class Solution {
    public boolean strongPasswordCheckerII(String password) {
        
        if(password.length() < 8)
            return false;
        
        String special_character = "!@#$%^&*()-+";
        
        boolean lowercase = false;
        boolean uppercase = false;
        boolean digit = false;
        boolean specialChar = false;
        
        for(int i =0; i< password.length(); i++)
        {
            char ch = password.charAt(i);
            if(i< password.length()-1 && password.charAt(i) == password.charAt(i+1))
                return false;
            if(Character.isUpperCase(ch))
                uppercase = true;
            if(Character.isLowerCase(ch))
                lowercase = true;
            if(Character.isDigit(ch))
                digit = true;
            if(special_character.indexOf(ch) != -1)
                specialChar = true;
        }
        return lowercase && uppercase && digit && specialChar ;
    }
}