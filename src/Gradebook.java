public class Gradebook {

    String[] labels = { "Last", "First", "Test1", "Test2", "Quiz1", "Quiz2", "Homework1", "Homework2", "Homework3",
            "Homework4", "Homework5", "Homework6", "Homework7", "Homework8", "Homework9", "Homework10" };

    String[][] book;

    public Gradebook(String[][] b) {
        if (b.length > 0 && b[0].length == 16) {
            book = b;
        }

        else {
            System.out.println("Gradebook is not the right size. Ensure that formatting is correct.");
            book = new String[1][16];
        }
    }

    public boolean changeGrade(String lastName, String assnName, int newGrade) {
        // our code here
        return false;
    }

    public double findAssignmentAverage(String assnName) {
        double assnAvg = 0;
        for(int b = 0; b<labels.length;b++){
            if(labels[b].equals(assnName)){
                
            }
        }
        return -1;
    }

    public double findStudentAverage(String lastName) {
        double testAvg = 0;
        double quizAvg = 0;
        double homeworkAvg = 0;
        double totalAvg = 0;
        for (int x=0;x<book.length;x++){
            if(lastName.equals(book[x][0])){
                for(int i =2;i<4;i++){
                    testAvg+= Double.valueOf(book[x][i]);
                }
                testAvg/=2;
                for(int i =4;i<6;i++){
                    quizAvg+= Double.valueOf(book[x][i]);
                }
                quizAvg/=2;
                for(int i =6;i<15;i++){
                    homeworkAvg+= Double.valueOf(book[x][i]);
                }
                homeworkAvg/=10;
                quizAvg*=.3;
                testAvg*=.3;
                homeworkAvg*=.4;
                totalAvg = quizAvg + testAvg + homeworkAvg;
                
            }
        }
        return totalAvg;
    }

    public void printStudentInfo(String lastName) {
        boolean found = false;
        for (int x=0;x<book.length;x++){
            if(lastName.equals(book[x][0])){
                found = true;
                System.out.print(book[x][1] + " " + book[x][0] + ": \n");
                for(int i =2;i<labels.length;i++){
                    System.out.println(labels[i] + " - " + book[x][i]);
                }
            }

        
        }
        if(found == false){
            System.out.println("Error 404: No student found.");
        }
        
    }

}
