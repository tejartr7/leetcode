public class Codec {
   
    // Encodes a URL to a shortened URL.
    String temp="";
    public String encode(String l) {
       temp=l;
       return "";
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return temp;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));