package copyconstructor;

public class Exam {
    private int exam_id;
    private int score;

    public Exam(){
    }
    public Exam(int exam_id, int score){
        this.exam_id = exam_id;
        this.score = score;
    }

    public Exam(Exam others){
        this.exam_id = others.exam_id;
        this.score = others.score;
    }
}
