class Main{
    public int lengthOfLastWord(String s) {
        String s1[]=s.split(" ");
        int d=s1.length;
        String h=s1[d-1];
        return h.length();
    }
}