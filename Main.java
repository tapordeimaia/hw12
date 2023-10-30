public class Main {
    public static void main(String[] args) {
        Manger manger1 = new Manger("HR", 34, "Paul");
        manger1.attendTraining();
        manger1.conductInterview();
        Programmer programmer1 = new Programmer("IT", 26, "Maia");
        programmer1.attendTraining();
        attendTraining[] attenders = {manger1, programmer1};
        MeetingRoom meetingRoom = new MeetingRoom(attenders);
        meetingRoom.attendedMeeting();
        Programmer programmer2 = new Programmer("IT", 26, "Valeria");
        Programmer programmer3 = new Programmer("IT", 26, "Maria");
        Programmer programmer4 = new Programmer("IT", 26, "Andrea");
        Employee[] employers = new Employee[]{manger1, programmer1, programmer2, programmer3, programmer4};
        for (Employee employer: employers){
            if (employer instanceof attendTraining){
                attendTraining goodEmployer = (attendTraining) employer;
                goodEmployer.attendTraining();
            } else if (employer instanceof conductInterview) {
                conductInterview interviewer = (conductInterview) employer;
                interviewer.conductInterview();
            }
        }
    }
}