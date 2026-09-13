package chap02.labmda01;

public class ChangerImpl implements Changer {

    @Override
    public int change(int n) {
        return n * 2;
    }
}
