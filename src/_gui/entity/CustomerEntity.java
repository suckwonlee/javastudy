package _gui.entity;

public class CustomerEntity {
    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getSaveMoney() {
        return saveMoney;
    }

    public void setSaveMoney(int saveMoney) {
        this.saveMoney = saveMoney;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    private String customerId;
    private String customerName;
    private int age;
    private String level;
    private String job;
    private int saveMoney;



}
