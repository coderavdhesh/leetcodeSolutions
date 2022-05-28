class Solution {
    public int numUniqueEmails(String[] emails) {
        
        Set<String> set = new HashSet<>();
        
        for (int i = 0; i < emails.length; ++i) {
            String[] email = emails[i].split("@");
            String preEmail = email[0];
            String postEmail = email[1];
            
            String[] preEmailSplit = preEmail.split("\\+");
            String resultPreEmail = preEmailSplit[0].replace(".", "");
            
            set.add(resultPreEmail + "@" +postEmail);
        }
        
        return set.size();
        
    }
}