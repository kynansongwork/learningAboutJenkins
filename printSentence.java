class printSentence {

    public static void main(String[] args){

        String sentence = "Hello, this is a test";

        printASentence(sentence);

    }

    public static void printASentence(String message) {
        for(int i=1; i <= 6; i++)
        System.out.println(message + " " + i);
    }

}