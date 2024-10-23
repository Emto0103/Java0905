package jdbc2.entity;

public class Customer {
    private String customerID;
    private String customerName;
    private int age;
    private String level;
    private String job;
    private int reward;

    public String getCusomerID() {
        return customerID;
    }

    public void setCusomerID(String cusomerID) {
        this.customerID = cusomerID;
    }

    public String getCusomerName() {
        return customerName;
    }

    public void setCusomerName(String cusomerName) {
        this.customerName = cusomerName;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }
}

