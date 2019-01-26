package lab;

class Company {
    String name;

    void changeRef(Company that, Company someCompany) {
        someCompany = that;
        this.name = someCompany.name;
    }
}

class Main {
    public static void main(String[] args) {
        Company c1 = new Company();
        c1.name = "Ethnus";
        Company c2 = new Company();
        c2.name = "Aptimithra";
        c1.changeRef(c2, c1);
        System.out.println(c1.name);
        System.out.println(c2.name);
    }
}
