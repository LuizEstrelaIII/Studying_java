import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHours;
    private Integer hours;

    public HourContract(){
    }

    public HourContract(Date date, Double valuePerHours, Integer hour) {
        this.date = date;
        this.valuePerHours = valuePerHours;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHours;
    }

    public void setValuePerHour(Double valuePerHours) {
        this.valuePerHours = valuePerHours;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHour(Integer hours) {
        this.hours = hours;
    }
    public double totalValue(){
        return valuePerHours * hours;
    }
}
