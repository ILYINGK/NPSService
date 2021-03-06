public class NPSService {
    public int nps(int[] votes) {


        int detractors = 0;
        int promoters = 0;


        for (int vote : votes) {
            if (vote <= 6) detractors++;
            if (vote >= 9) promoters++;
        }

        //можно вбить в формулу, но так понятнее
        int abonents = votes.length;

        double nps = promoters * 1.0 / abonents * 100 - detractors * 1.0 / abonents * 100;

        return (int) nps;
    }
}
