import java.util.concurrent.Phaser;

public class PhraseOMatic {
    public static void main(String[] args){

        String[] WordListOne = { "agnostic","opinionated","voice activated","haptically driven","extensible","reactve","agent based","functional","AI enabled","strongly typed" };

        String[] WordListTwo = {"loosely coupled","six sigma","asynchronous","event driven","pubsub","Iot","cloudnative","service oriented","containerized","serverless","microservices","distributed ledger" };

        String[] WordListThree = {"framework","library","DSL","REST API","repository","pipeline","servicemesh","architecture","perspective","design","orientation"};

        int oneLength = WordListOne.length;
        int twoLength = WordListTwo.length;
        int threeLength = WordListThree.length;

        java.util.Random randomGenerator = new java.util.Random();

        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        String phrase = WordListOne[rand1] + " " + WordListTwo[rand2] + " " + WordListThree[rand3];

        System.out.println("Precisamos de " + phrase);
    }
    
}
