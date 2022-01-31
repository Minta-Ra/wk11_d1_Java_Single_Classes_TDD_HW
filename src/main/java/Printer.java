public class Printer {

    private int numOfSheets;
    private int tonerVolume;

    public Printer(int numOfSheets, int tonerVolume){
        this.numOfSheets = numOfSheets;
        this.tonerVolume = tonerVolume;
    }

    public int getNumOfSheets(){
        return this.numOfSheets;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }

    public boolean print(int pages, int copies){
        if (pages * copies <= numOfSheets){
            return true;
        }
        return false;
    }

    public int reduceTonerVolume(int pages, int copies){
        int remainingToner = tonerVolume - (pages * copies);
        return remainingToner;
    }

}
