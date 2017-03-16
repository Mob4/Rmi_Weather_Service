
package meteoservice;

/**
 *
 * @author DL9
 */
public class Villes {
    private String name;

    public String getName() {
        return name;
    }
    private double temp;
    private double windSpeed;
   
    public Villes()
    {
    
    }
    public  Villes(String name,double tmp,double windsp)
    {
        this.name=name;
        this.windSpeed=windsp;
        this.temp=tmp;
    }
    public void setMeteo(double temp,double windsp)
    {
        this.windSpeed=windsp;
        this.temp=temp;
    }
    public String getMeteo()
    {
        String meteo=String.valueOf(windSpeed)+ " km/h "+String.valueOf(temp) +" °c";
        return meteo;
    }
}
