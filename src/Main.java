public class Main {
    public static void main(String[] args) {

        int[] votes = {6, 6, 6, 6, 6, 9, 9, 9, 9, 9};

        NPSService npsService = new NPSService();

        System.out.println(npsService.nps(votes));


    }
}
