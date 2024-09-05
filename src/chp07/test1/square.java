package chp07.test1;

public class square {
    private int length;

    private int area(){
        int result=(int)Math.pow(length,2);
        return result;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

public int getArea() {
        return area();
}

}
