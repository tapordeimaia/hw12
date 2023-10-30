public class MeetingRoom {
    private attendTraining[] attenders;
    public MeetingRoom(attendTraining[] attenders){
        this.attenders = attenders;
    }

    public void attendedMeeting(){
        for (attendTraining attender: attenders){
            attender.attendTraining();
        }
    }
}
