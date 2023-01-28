class demo1{
    public static void main(String[] args){
        private static final Charset UTF_8 = Charset.forName("UTF-8");

String text = "Hello World!";
byte[] bytes = text.getBytes(UTF_8);
System.out.println("bytes= "+Arrays.toString(bytes));
System.out.println("text again= "+new String(bytes, UTF_8));
    }
}
