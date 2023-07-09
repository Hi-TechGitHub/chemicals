package DataProcessing;
import View.Viewer;

public class Processing {

    public String name; // имя
    private String aggregateState; //liquid (жидкость), gaseous(газообразное), solid(твердое)
    private double density; // плотность тела
    private double volume; // объём тела
    private double weight; // вес тела


    public String getName() {
        return name;
    }

    /**
     * находим плотность тела, вес тела делим на объём тела
     * @param weight вес тела
     * @param volume объём тела
     * @return density
     */
    public double findOutTheDensity(double weight, double volume) {
        return weight/volume;
    }

    public String getAggregateState() {
        return aggregateState;
    }

    public void setAggregateState(String aggregateState) {
        this.aggregateState = aggregateState;
    }

    /**
     * находим объём тела, вес тела делим на плотность тела
     * @param weight вес тела
     * @param density плотность тела
     * @return volume
     */
    public double findOutTheVolume (double weight, double density) {
        return weight/density;
    }

    /**
     * находим вес тела, плотность тела умножаем на объём тела
     * @param density плотность тела
     * @param volume объём тела
     * @return weight
     */
    public double findOutTheWeight(double density, double volume) {
        return density * volume;
    }

    /**
     * может ли тело плавать?
     * @return true or false
     */
    public boolean canSwim() {
        if (findOutTheDensity(this.weight, this.volume) <= 1000) {
            return true;
        }
        else {
            return false;
        }
    }


    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }
    public void setVolumeWithSizeInMeters(double length,double width, double height) {
        double resVolume = (length * width / height);
        //return weight/density;
        this.volume = resVolume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
             return this.name + "\n" +
                "масса тела: " + this.weight + "\n" +
                "плотность тела: " + this.density + "кг/м^3\n" +
                "объём тела (м^3): " + this.volume + "\n" +
                "агрегатное состояние: " + this.aggregateState + "\n"+
                "может ли плавать: " + canSwim() + "\n";
    }
}
