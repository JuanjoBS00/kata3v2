package kata3v2;

public class Kata3v2 {

   
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
        
        histogram.increment("ull.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");

        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM", histogram);
        histogramDisplay.execute();
    }
       
    
}
