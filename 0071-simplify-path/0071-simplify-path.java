class Solution {
    public String simplifyPath(String path) {
        Stack <String> s = new Stack<String>();
        String [] p = path.split("/");
        for(String file: p){
            if(file.equals("..") && s.empty() == false)
            {
                s.pop();
            }
            else if(file.equals("..") == false && file.equals(".") == false && file.equals("") == false){
                s.push(file);
            }
        }
        String canonicalPath = "";
        if(s.empty() == true){
            canonicalPath = "/";
        }
        else{
            for (String file:s){
            canonicalPath += "/" + file;
        }
        }
        
    return canonicalPath;
    }
}