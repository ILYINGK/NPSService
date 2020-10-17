public class NPSService {
    public int nps(int[] votes){


        int detractors = 0;
        int promoters = 0;
        int neutrals = 0;

        for (int vote : votes) {
            if(vote<=6)detractors++;
            if (vote>=9)promoters++;
            if(vote>6&&vote<9)neutrals++;
        }

        int sum = detractors+promoters+neutrals;

        double nps =  promoters*1.0/sum*100 - detractors*1.0/sum*100;

        return (int) nps;
    }
}
