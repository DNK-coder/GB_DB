package main;

public class DB {
    public static void main(String[] args) {
        Workman[] servCorp = new Workman[5];
        servCorp[0] = new Workman("Ivan", "Ivanov","Programmer 1C", "ivanovn@mailbox.com", "88005553535",45000,41);
        servCorp[1] = new Workman("Petr", "Belyi","Programmer 1C", "belyi@mailbox.com", "89239235555",43000,39);
        servCorp[2] = new Workman("Alexey", "Sidorov","Programmer 1C", "sidorov@mailbox.com", "89069003355",40000,40);
        servCorp[3] = new Workman("Nadejda", "Glotova","Bookkeeper", "glotova@mailbox.com", "89965555005",20000,18);
        servCorp[4] = new Workman("Julia", "Nikolaevna","Bookkeeper", "nikolaevna@mailbox.com", "8",22000,21);
        for (Workman workmans : servCorp)
            if (workmans.getAge()>=40)
                System.out.println(workmans);

    }
}
class Workman {
    private String name;

    private String second_name;

    private String position;
    private String email;
    private String phone;
    private int pay;
    private int age;

    public Workman(String name,String second_name, String position, String email, String phone, int pay, int age) {
        this.name = name;
        this.second_name = second_name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return("\n"+name+"\n"+second_name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +pay+ "\n-"
                +age);
    }
}