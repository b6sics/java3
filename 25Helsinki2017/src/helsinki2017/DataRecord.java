/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helsinki2017;

/**
 *
 * @author b6dmin
 */
public class DataRecord {

    private static String DELIMITER = ";";

    public static String getDELIMITER() {
        return DELIMITER;
    }

    public static void setDELIMITER(String DELIMITER) {
        DataRecord.DELIMITER = DELIMITER;
    }

    private String name;
    private String country;
    private double techPoint;
    private double comPoint;
    private int faults;

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public double getTechPoint() {
        return techPoint;
    }

    public double getComPoint() {
        return comPoint;
    }

    public int getFaults() {
        return faults;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTechPoint(double techPoint) {
        this.techPoint = techPoint;
    }

    public void setComPoint(double comPoint) {
        this.comPoint = comPoint;
    }

    public void setFaults(int faults) {
        this.faults = faults;
    }

    public DataRecord(String line) {
        String[] datas = line.split(DELIMITER);
        this.name = datas[0];
        this.country = datas[1];
        this.techPoint = Double.valueOf(datas[2]);
        this.comPoint = Double.valueOf(datas[3]);
        this.faults = Integer.valueOf(datas[4]);
        //System.out.println(">" + this.toString());
    }

    public double points() {
        return this.techPoint + this.comPoint - this.faults;
    }

    @Override
    public String toString() {
        return "DataRecord{" + "name=" + name + ", country=" + country
                + ", techPoint=" + techPoint + ", comPoint=" + comPoint
                + ", faults=" + faults + '}';
    }
}
