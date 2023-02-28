public class Main {
    // Application code
    public static void main(String args[]) {
        School sc1 = new School();
        School sc2 = new School();
        School sc3 = new School();

        // Direct access to attributes is not a good practices
        sc1.setName("King George VI");
        sc2.setName("King George II");
        sc3.setName("King George III");

        Address addr = new Address();
        Address addr2 = new Address();
        Address addr3 = new Address();

        //setting Addresses
        addr.setStreet("Street 2");
        addr.setDistrict("JB");
        addr.setPostcode("30021");
        addr.setState("Johor");
        sc1.setAddress(addr);

        addr2.setStreet("Street 3");
        addr2.setDistrict("Kelantan");
        addr2.setPostcode("32610");
        addr2.setState("Ohio");
        sc2.setAddress(addr2);

        addr3.setStreet("Street 4");
        addr3.setDistrict("Penang");
        addr3.setPostcode("30003");
        addr3.setState("California");
        sc3.setAddress(addr3);

        //setPrincipal
        sc1.setPrincipal("Mrs. Jason");
        sc2.setPrincipal("Mr. Smith");
        sc3.setPrincipal("Lord Marius");

        //School 1
        System.out.println("Name of school is "+sc1.getName());
        System.out.println("Address of school is "+sc1.getAddress().getStreet());
        System.out.println("Principal of school is "+sc1.getPrincipal());

        //dataset for marks
        Marks marks = new Marks();
        marks.createData(100);

        marks.setMark(50, 0);
        marks.setMark(52, 1);
        marks.setMark(93, 2);
        float mark = marks.getMark(0);
        for (int i=0; i<3; i++) {
            System.out.println("Marks for student "+ i +" is " + mark);
            mark = marks.getMark(i + 1);
        }
        System.out.println(" ");

        //School 2
        System.out.println("Name of school is "+sc2.getName());
        System.out.println("Address of school is "+sc2.getAddress().getStreet());
        System.out.println("Principal of school is "+sc2.getPrincipal());

        Marks marks2 = new Marks();
        marks2.createData(100);

        marks2.setMark(50, 0);
        marks2.setMark(50, 1);
        marks2.setMark(55, 2);
        float mark2 = marks2.getMark(0);
        for (int j=0; j<3; j++) {
            System.out.println("Marks for student "+ j +" is " + mark2);
            mark2 = marks2.getMark(j + 1);
        }
        System.out.println(" ");

        //School 3
        System.out.println("Name of school is "+sc3.getName());
        System.out.println("Address of school is "+sc3.getAddress().getStreet());
        System.out.println("Principal of school is "+sc3.getPrincipal());

        Marks marks3 = new Marks();
        marks3.createData(100);

        marks3.setMark(24, 0);
        marks3.setMark(55, 1);
        marks3.setMark(23, 2);
        float mark3 = marks3.getMark(0);
        for (int k=0; k<3; k++) {
            System.out.println("Marks for student "+ k +" is " + mark3);
            mark3 = marks3.getMark(k + 1);
        }
        System.out.println(" ");
    }
}
